package com.dynamicallyblunttech.cve.controller;


import com.dynamicallyblunttech.cve.OutputCVEJson;
import com.dynamicallyblunttech.cve.pojo.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.net.ssl.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;


@RestController
@RequestMapping("/cve")
public class CveController {

    @Value("${nvd.version}")
    private String nvdVersion;

    @Value("${nvd.base.url}")
    private String nvdBaseURL;

//    private final static String HTTP_PROXY = "web-proxy.in.softwaregrp.net";
//    private final static String HTTPS_PROXY = "web-proxy.in.softwaregrp.net";
//    private final static String HTTP_PORT = "8080";

    @RequestMapping(value="/{year}/{vendor}/{product}", method = RequestMethod.GET)
    public @ResponseBody Map<String, List<OutputCVEJson>> getCVEData(@PathVariable final String year,
                                                                     @PathVariable String vendor,
                                                                     @PathVariable List<String> product) {
        System.out.println("Start Getting CVE from " + year);
        Map<String, List<OutputCVEJson>> cveJson = null;
        String baseURL = nvdBaseURL + nvdVersion + "/nvdcve-"+ nvdVersion +"-" + year + ".json.zip";
        URL cveReq = null;
        ZipInputStream zis = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        byte[] buffer = new byte[2048];
        try {
            cveReq = new URL(baseURL);
            String readLine = null;

//            System.setProperty("http.proxyHost", HTTP_PROXY);
//            System.setProperty("http.proxyPort", HTTP_PORT);
//            System.setProperty("https.proxyHost", HTTPS_PROXY);
//            System.setProperty("https.proxyPort", HTTP_PORT);
            //System.setProperty("zip.altEncoding", "Cp437");

            HttpsURLConnection connection = (HttpsURLConnection) cveReq.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            //System.out.println("ResponseCode:" + responseCode + "----ContentType:" + connection.getContentType() + "---Encoding:" + connection.getContent());

            if (responseCode == HttpURLConnection.HTTP_OK) {

                zis = new ZipInputStream(connection.getInputStream());

                ZipEntry zentry = null;
                while ((zentry = zis.getNextEntry()) != null) {
                    System.out.println(zentry.getName() + "--");
                    fos = new FileOutputStream(zentry.getName());
                    bos = new BufferedOutputStream(fos, buffer.length);
                    int size;
                    while ((size = zis.read(buffer, 0, buffer.length)) != -1) {
                        bos.write(buffer, 0, size);
                    }

                    bos.flush();
                    bos.close();

                    fos.close();

                    File outputJson = new File(zentry.getName());
                    //System.out.println("File Downloaded to:" + outputJson.getAbsolutePath());

                    System.out.println("Parsing Json to get the CVE data");
                    cveJson = convertJsonToObject(vendor, product, outputJson);

                    //Remove the large JSON file, once the processing is done.
                    boolean isDeleted = deleteCVEJsonFile(outputJson);
                    System.out.println(outputJson.getName()+" File deleted:"+ isDeleted);
                }
            } else {
                System.out.println("Cannot Extract Zip From CVE, Something Wrong!");
            }
            System.out.println("--END---");
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        } catch (EOFException eof){
            System.out.println("EOF Error Occurred");
            eof.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (zis != null)
                    zis.close();
                if (fos != null)
                    fos.close();
            } catch (Exception fe){
                fe.printStackTrace();
            }
        }
        return cveJson;
    }

    @RequestMapping(value="/parse/{vendor}/{product}")
    public static @ResponseBody Map<String, List<OutputCVEJson>> convertJsonToObjectWithJsonFile(
            @PathVariable String vendor,
            @PathVariable List<String> product){
//        String jsonFile = "C:\\Users\\agrahari.CORPDOM\\Documents\\GitHub\\cve\\nvdcve-1.0-2019-2.json";
        String jsonFile = "/opt/tomcat/apache-tomcat-9.0.24/bin/nvdcve-1.0-2019.json";
        Gson gson = new Gson();
        Gson prettyGson = null;
        Map<String, List<OutputCVEJson>> mapping = null;

        try (Reader reader = new FileReader(jsonFile)) {

            // Convert JSON File to Java Object
            CVEMetaData obj= gson.fromJson(reader, CVEMetaData.class);

            mapping = generateVendorVersionCVEMapping(obj, vendor, product);

            prettyGson = new GsonBuilder().setPrettyPrinting().create();
            String prettyJson = prettyGson.toJson(mapping);

            System.out.println(prettyJson);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return mapping;
    }

    public static Map<String, List<OutputCVEJson>> convertJsonToObject(String vendor, List<String> product, File outputJson){

        Gson gson = new Gson();
        Gson prettyGson = null;
        Map<String, List<OutputCVEJson>> mapping = null;

        try (Reader reader = new FileReader(outputJson)) {

            // Convert JSON File to Java Object
            CVEMetaData obj= gson.fromJson(reader, CVEMetaData.class);
            System.out.println(obj.toString());

            mapping = generateVendorVersionCVEMapping(obj, vendor, product);

            prettyGson = new GsonBuilder().setPrettyPrinting().create();
            String prettyJson = prettyGson.toJson(mapping);

//            System.out.println(prettyJson);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return mapping;
    }

    public static Map<String, List<OutputCVEJson>> generateVendorVersionCVEMapping(CVEMetaData data, String vendor, List<String> product){
        Map<String, List<OutputCVEJson>> mapping = new HashMap<>();

        for (CVEItem item : data.getCVEItems()){

            for(VendorData vendor_data:item.getCve().getAffects().getVendor().getVendor_data()){

                if(vendor_data.getVendor_name().equals(vendor)){
                    for(ProductData product_data:vendor_data.getProduct().getProduct_data()){

                        if(product.contains(product_data.getProduct_name())){
                            for(VersionData version_data: product_data.getVersion().getVersion_data()){

                                OutputCVEJson cveJson = new OutputCVEJson();
                                cveJson.setCveId(item.getCve().getCVE_data_meta().getID());
                                cveJson.setDescription(item.getCve().getDescription().getDescription_data().get(0).getValue());
                                cveJson.setBaseMetricV2score(String.valueOf(item.getImpact().getBaseMetricV2().getImpactScore()));
                                cveJson.setBaseMetricV3score(String.valueOf(item.getImpact().getBaseMetricV3().getImpactScore()));

                                if(mapping.containsKey(version_data.getVersion_value())){
                                    List<OutputCVEJson> cveIds = mapping.get(version_data.getVersion_value());
                                    List<String> cveIdList = new ArrayList<>();
                                    cveIds.stream().forEach(cveIdsItem -> cveIdList.add(cveIdsItem.getCveId()));
                                    if(!cveIdList.contains(item.getCve().getCVE_data_meta().getID())){
                                        cveIds.add(cveJson);
                                    }
                                } else{
                                    List<OutputCVEJson> cve_ids = new ArrayList<>();
                                    cve_ids.add(cveJson);
                                    mapping.put(version_data.getVersion_value(),cve_ids);
                                }
                            }
                        }
                    }
                }
            }
        }
        return mapping;
    }

    private static boolean deleteCVEJsonFile(File outputJson){
        return outputJson.delete();
    }
}
