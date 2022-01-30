package com.dynamicallyblunttech.cve.pojo;

public class CvssV2 {

    private String version ;
    private String vectorString ;
    private String accessVector ;
    private String accessComplexity ;
    private String authentication ;
    private String confidentialityImpact ;
    private String integrityImpact ;
    private String availabilityImpact ;
    private double baseScore ;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVectorString() {
        return vectorString;
    }

    public void setVectorString(String vectorString) {
        this.vectorString = vectorString;
    }

    public String getAccessVector() {
        return accessVector;
    }

    public void setAccessVector(String accessVector) {
        this.accessVector = accessVector;
    }

    public String getAccessComplexity() {
        return accessComplexity;
    }

    public void setAccessComplexity(String accessComplexity) {
        this.accessComplexity = accessComplexity;
    }

    public String getAuthentication() {
        return authentication;
    }

    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    public String getConfidentialityImpact() {
        return confidentialityImpact;
    }

    public void setConfidentialityImpact(String confidentialityImpact) {
        this.confidentialityImpact = confidentialityImpact;
    }

    public String getIntegrityImpact() {
        return integrityImpact;
    }

    public void setIntegrityImpact(String integrityImpact) {
        this.integrityImpact = integrityImpact;
    }

    public String getAvailabilityImpact() {
        return availabilityImpact;
    }

    public void setAvailabilityImpact(String availabilityImpact) {
        this.availabilityImpact = availabilityImpact;
    }

    public double getBaseScore() {
        return baseScore;
    }

    public void setBaseScore(double baseScore) {
        this.baseScore = baseScore;
    }
}
