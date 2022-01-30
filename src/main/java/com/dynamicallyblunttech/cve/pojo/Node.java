package com.example.cve.cvepojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Node {

    @JsonProperty
    private String operator;
    @JsonProperty
    private List<CpeMatch> cpe_match ;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public List<CpeMatch> getCpe_match() {
        return cpe_match;
    }

    public void setCpe_match(List<CpeMatch> cpe_match) {
        this.cpe_match = cpe_match;
    }
}
