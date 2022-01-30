package com.dynamicallyblunttech.cve.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CVEMetaData {

    @JsonProperty
    private String CVE_data_type;
    @JsonProperty
    private String CVE_data_format;
    @JsonProperty
    private String CVE_data_version;
    @JsonProperty
    private String CVE_data_numberOfCVEs;
    @JsonProperty
    private String CVE_data_timestamp;
    @JsonProperty
    private List<CVEItem> CVE_Items;

    public String getCVE_data_type() {
        return CVE_data_type;
    }

    public void setCVE_data_type(String CVE_data_type) {
        this.CVE_data_type = CVE_data_type;
    }

    public String getCVE_data_format() {
        return CVE_data_format;
    }

    public void setCVE_data_format(String CVE_data_format) {
        this.CVE_data_format = CVE_data_format;
    }

    public String getCVE_data_version() {
        return CVE_data_version;
    }

    public void setCVE_data_version(String CVE_data_version) {
        this.CVE_data_version = CVE_data_version;
    }

    public String getCVE_data_numberOfCVEs() {
        return CVE_data_numberOfCVEs;
    }

    public void setCVE_data_numberOfCVEs(String CVE_data_numberOfCVEs) {
        this.CVE_data_numberOfCVEs = CVE_data_numberOfCVEs;
    }

    public String getCVE_data_timestamp() {
        return CVE_data_timestamp;
    }

    public void setCVE_data_timestamp(String CVE_data_timestamp) {
        this.CVE_data_timestamp = CVE_data_timestamp;
    }

    public List<CVEItem> getCVEItems() {
        return CVE_Items;
    }

    public void setCVE_Items(List<CVEItem> CVE_Items) {
        this.CVE_Items = CVE_Items;
    }
}
