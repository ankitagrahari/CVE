package com.dynamicallyblunttech.cve.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ReferenceData {

    @JsonProperty
    private String refsource ;
    @JsonProperty
    private List<String> tags ;
    @JsonProperty
    private String url ;
    @JsonProperty
    private String name ;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRefsource() {
        return refsource;
    }

    public void setRefsource(String refsource) {
        this.refsource = refsource;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
