package com.dynamicallyblunttech.cve.pojo.v1_1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CVEDataMeta {

    @JsonProperty(value = "ID")
    private String id;

    @JsonProperty(value = "ASSIGNER")
    private String assigner;
}
