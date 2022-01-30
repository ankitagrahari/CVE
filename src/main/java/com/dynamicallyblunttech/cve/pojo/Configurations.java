package com.dynamicallyblunttech.cve.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Configurations {

    @JsonProperty
    private String CVE_data_version ;
    @JsonProperty
    private List<Node> nodes ;

    public String getCVE_data_version() {
        return CVE_data_version;
    }

    public void setCVE_data_version(String CVE_data_version) {
        this.CVE_data_version = CVE_data_version;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }
}
