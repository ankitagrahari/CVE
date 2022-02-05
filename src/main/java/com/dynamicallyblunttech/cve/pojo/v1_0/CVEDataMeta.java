package com.dynamicallyblunttech.cve.pojo.v1_0;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CVEDataMeta {

    @JsonProperty
    private String ID ;
    @JsonProperty
    private String ASSIGNER ;
}
