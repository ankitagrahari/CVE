package com.dynamicallyblunttech.cve.pojo.v1_0;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cve {

    @JsonProperty
    private String data_type;
    @JsonProperty
    private String data_format;
    @JsonProperty
    private String data_version;
    @JsonProperty
    private CVEDataMeta CVE_data_meta;
    @JsonProperty
    private Affects affects;
//    @JsonProperty
//    private Problemtype problemtype;
//    @JsonProperty
//    private References references;
    @JsonProperty
    private Description2 description;
}
