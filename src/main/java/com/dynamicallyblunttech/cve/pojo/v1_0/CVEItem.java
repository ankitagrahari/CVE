package com.dynamicallyblunttech.cve.pojo.v1_0;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CVEItem {

    @JsonProperty
    private Cve cve;
//    @JsonProperty
//    private Configurations configurations;
    @JsonProperty
    private Impact impact;
//    @JsonProperty
//    private String publishedDate;
//    @JsonProperty
//    private String lastModifiedDate;
}
