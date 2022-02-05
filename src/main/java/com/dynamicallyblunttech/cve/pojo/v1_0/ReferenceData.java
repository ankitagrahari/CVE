package com.dynamicallyblunttech.cve.pojo.v1_0;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ReferenceData {

    @JsonProperty
    private String refsource ;
    @JsonProperty
    private List<String> tags ;
    @JsonProperty
    private String url ;
    @JsonProperty
    private String name ;
}
