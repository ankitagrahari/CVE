package com.dynamicallyblunttech.cve.pojo.v1_1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Configurations {

    @JsonProperty(value = "CVE_data_version")
    private String dataVersion ;
    @JsonProperty
    private List<Node> nodes ;
}
