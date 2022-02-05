package com.dynamicallyblunttech.cve.pojo.v1_1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
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
}
