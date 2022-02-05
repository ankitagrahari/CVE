package com.dynamicallyblunttech.cve.pojo.v1_0;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class VersionData {

    @JsonProperty
    private String version_value ;
    @JsonProperty
    private String version_affected ;
}
