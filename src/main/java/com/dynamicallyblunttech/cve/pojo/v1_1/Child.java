package com.dynamicallyblunttech.cve.pojo.v1_1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(ignoreUnknown = true)
public class Child {

    private String operator;

    @JsonProperty(value = "children")
    private List<Dummy> dummy;

    @JsonProperty(value = "cpe_match")
    private List<CPEMatch> cpeMatch;
}
