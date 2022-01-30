package com.dynamicallyblunttech.cve.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CpeMatch {

    @JsonProperty
    private Boolean vulnerable ;
    @JsonProperty
    private String cpe23Uri ;

    public Boolean getVulnerable() {
        return vulnerable;
    }

    public void setVulnerable(Boolean vulnerable) {
        this.vulnerable = vulnerable;
    }

    public String getCpe23Uri() {
        return cpe23Uri;
    }

    public void setCpe23Uri(String cpe23Uri) {
        this.cpe23Uri = cpe23Uri;
    }

}
