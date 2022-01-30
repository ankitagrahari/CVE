package com.example.cve.cvepojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VersionData {

    @JsonProperty
    private String version_value ;
    @JsonProperty
    private String version_affected ;

    public String getVersion_value() {
        return version_value;
    }

    public void setVersion_value(String version_value) {
        this.version_value = version_value;
    }

    public String getVersion_affected() {
        return version_affected;
    }

    public void setVersion_affected(String version_affected) {
        this.version_affected = version_affected;
    }
}
