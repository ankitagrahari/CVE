package com.dynamicallyblunttech.cve.pojo.v1_0;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseMetricV2 {
    @JsonProperty
    private CvssV2 cvssV2 ;
    @JsonProperty
    private String severity ;
    @JsonProperty
    private double exploitabilityScore ;
    @JsonProperty
    private double impactScore ;
    @JsonProperty
    private boolean acInsufInfo ;
    @JsonProperty
    private boolean obtainAllPrivilege ;
    @JsonProperty
    private boolean obtainUserPrivilege ;
    @JsonProperty
    private boolean obtainOtherPrivilege ;
    @JsonProperty
    private boolean userInteractionRequired ;
}
