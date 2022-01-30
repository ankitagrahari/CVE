package com.dynamicallyblunttech.cve.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CVEItem {

    @JsonProperty
    private Cve cve;
//    @JsonProperty
//    private Configurations configurations;
//    @JsonProperty
    private Impact impact;
    @JsonProperty
//    private String publishedDate;
//    @JsonProperty
//    private String lastModifiedDate;

    public Cve getCve() {
        return cve;
    }

    public void setCve(Cve cve) {
        this.cve = cve;
    }

//    public Configurations getConfigurations() {
//        return configurations;
//    }
//
//    public void setConfigurations(Configurations configurations) {
//        this.configurations = configurations;
//    }
//
    public Impact getImpact() {
        return impact;
    }

    public void setImpact(Impact impact) {
        this.impact = impact;
    }
//
//    public String getPublishedDate() {
//        return publishedDate;
//    }
//
//    public void setPublishedDate(String publishedDate) {
//        this.publishedDate = publishedDate;
//    }
//
//    public String getLastModifiedDate() {
//        return lastModifiedDate;
//    }
//
//    public void setLastModifiedDate(String lastModifiedDate) {
//        this.lastModifiedDate = lastModifiedDate;
//    }

}
