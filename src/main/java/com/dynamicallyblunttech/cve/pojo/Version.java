package com.dynamicallyblunttech.cve.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Version {

    @JsonProperty
    private List<VersionData> version_data;

    public List<VersionData> getVersion_data() {
        return version_data;
    }

    public void setVersion_data(List<VersionData> version_data) {
        this.version_data = version_data;
    }
}
