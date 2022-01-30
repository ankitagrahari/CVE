package com.dynamicallyblunttech.cve.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Impact {

    @JsonProperty
    private BaseMetricV3 baseMetricV3;
    @JsonProperty
    private BaseMetricV2 baseMetricV2 ;
}

