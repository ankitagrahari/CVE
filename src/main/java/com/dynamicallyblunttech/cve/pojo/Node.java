package com.dynamicallyblunttech.cve.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Node {

    @JsonProperty
    private String operator;
    @JsonProperty
    private List<CpeMatch> cpe_match ;
}
