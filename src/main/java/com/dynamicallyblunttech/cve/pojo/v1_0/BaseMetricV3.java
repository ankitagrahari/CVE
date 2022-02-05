package com.dynamicallyblunttech.cve.pojo.v1_0;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BaseMetricV3 {

    @JsonProperty
    private CvssV3 cvssV3 ;
    @JsonProperty
    private double exploitabilityScore ;
    @JsonProperty
    private double impactScore ;
}
