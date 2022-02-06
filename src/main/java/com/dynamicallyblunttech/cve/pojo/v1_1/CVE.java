package com.dynamicallyblunttech.cve.pojo.v1_1;

import com.dynamicallyblunttech.cve.pojo.v1_0.CvssV2;
import com.dynamicallyblunttech.cve.pojo.v1_0.CvssV3;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CVE {

    @JsonProperty(value = "CVE_data_type")
    private String type;

    @JsonProperty(value = "CVE_data_format")
    private String format;

    @JsonProperty(value = "CVE_data_version")
    private String version;

    @JsonProperty(value = "CVE_data_numberOfCVEs")
    private String noOfCVEs;

    @JsonProperty(value = "CVE_data_timestamp")
    private String timeStamp;

    @JsonProperty(value = "CVE_Items")
    private List<CVEItems> items;

    private CVE builder(){
        this.type = "CVE";
        this.format = "MITRE";
        this.version = "4.0";
        this.noOfCVEs = "916";
        this.timeStamp = "2022-02-05T08:00Z";

        CvssV3 cvss3 = new CvssV3();
        cvss3.setVersion("3.1");
        cvss3.setVectorString("CVSS:3.1/AV:L/AC:L/PR:L/UI:N/S:U/C:N/I:H/A:H");
        cvss3.setAttackVector("LOCAL");
        cvss3.setAttackComplexity("LOW");
        cvss3.setPrivilegesRequired("LOW");
        cvss3.setUserInteraction("NONE");
        cvss3.setScope("UNCHANGED");
        cvss3.setConfidentialityImpact("NONE");
        cvss3.setIntegrityImpact("HIGH");
        cvss3.setBaseScore(7.1);
        cvss3.setBaseSeverity("HIGH");


        return this;
    }
}
