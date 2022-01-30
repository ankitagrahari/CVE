package com.dynamicallyblunttech.cve.pojo;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.lang.*;
import java.lang.Boolean;

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
