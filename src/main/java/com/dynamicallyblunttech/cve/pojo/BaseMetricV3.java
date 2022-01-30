package com.dynamicallyblunttech.cve.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseMetricV3 {

    @JsonProperty
    private CvssV3 cvssV3 ;
    @JsonProperty
    private double exploitabilityScore ;
    @JsonProperty
    private double impactScore ;

    public CvssV3 getCvssV3() {
        return cvssV3;
    }

    public void setCvssV3(CvssV3 cvssV3) {
        this.cvssV3 = cvssV3;
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
}
