package com.dynamicallyblunttech.cve.pojo.v1_0;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseMetricV3 {

    @JsonProperty
    private CvssV3 cvssV3 ;
    @JsonProperty
    private double exploitabilityScore ;
    @JsonProperty
    private double impactScore ;
}
