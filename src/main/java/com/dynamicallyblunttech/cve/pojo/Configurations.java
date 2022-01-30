package com.dynamicallyblunttech.cve.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Configurations {

    @JsonProperty
    private String CVE_data_version ;
    @JsonProperty
    private List<Node> nodes ;
}
