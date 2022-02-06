package com.dynamicallyblunttech.cve.pojo.v1_1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Configurations {

    @JsonProperty(value = "CVE_data_version")
    private String dataVersion ;
    @JsonProperty(value = "nodes")
    private List<Node> nodes ;
}
