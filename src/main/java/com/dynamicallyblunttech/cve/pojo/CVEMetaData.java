package com.dynamicallyblunttech.cve.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
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
}
