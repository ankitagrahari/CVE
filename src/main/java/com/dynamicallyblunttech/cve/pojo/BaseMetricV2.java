package com.dynamicallyblunttech.cve.pojo;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.*;
import java.lang.Boolean;


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

    public CvssV2 getCvssV2() {
        return cvssV2;
    }

    public void setCvssV2(CvssV2 cvssV2) {
        this.cvssV2 = cvssV2;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public double getExploitabilityScore() {
        return exploitabilityScore;
    }

    public void setExploitabilityScore(double exploitabilityScore) {
        this.exploitabilityScore = exploitabilityScore;
    }

    public double getImpactScore() {
        return impactScore;
    }

    public void setImpactScore(double impactScore) {
        this.impactScore = impactScore;
    }

    public boolean isAcInsufInfo() {
        return acInsufInfo;
    }

    public void setAcInsufInfo(boolean acInsufInfo) {
        this.acInsufInfo = acInsufInfo;
    }

    public boolean isObtainAllPrivilege() {
        return obtainAllPrivilege;
    }

    public void setObtainAllPrivilege(boolean obtainAllPrivilege) {
        this.obtainAllPrivilege = obtainAllPrivilege;
    }

    public boolean isObtainUserPrivilege() {
        return obtainUserPrivilege;
    }

    public void setObtainUserPrivilege(boolean obtainUserPrivilege) {
        this.obtainUserPrivilege = obtainUserPrivilege;
    }

    public boolean isObtainOtherPrivilege() {
        return obtainOtherPrivilege;
    }

    public void setObtainOtherPrivilege(boolean obtainOtherPrivilege) {
        this.obtainOtherPrivilege = obtainOtherPrivilege;
    }

    public boolean isUserInteractionRequired() {
        return userInteractionRequired;
    }

    public void setUserInteractionRequired(boolean userInteractionRequired) {
        this.userInteractionRequired = userInteractionRequired;
    }
}
