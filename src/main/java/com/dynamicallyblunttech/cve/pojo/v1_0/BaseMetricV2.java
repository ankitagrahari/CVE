package com.dynamicallyblunttech.cve.pojo.v1_0;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.lang.*;

@Data
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
