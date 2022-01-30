package com.dynamicallyblunttech.cve.pojo;

public class CvssV3 {

    private String version ;
    private String vectorString ;
    private String attackVector ;
    private String attackComplexity ;
    private String privilegesRequired ;
    private String userInteraction ;
    private String scope ;
    private String confidentialityImpact ;
    private String integrityImpact ;
    private String availabilityImpact ;
    private double baseScore ;
    private String baseSeverity ;

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

    public String getAttackVector() {
        return attackVector;
    }

    public void setAttackVector(String attackVector) {
        this.attackVector = attackVector;
    }

    public String getAttackComplexity() {
        return attackComplexity;
    }

    public void setAttackComplexity(String attackComplexity) {
        this.attackComplexity = attackComplexity;
    }

    public String getPrivilegesRequired() {
        return privilegesRequired;
    }

    public void setPrivilegesRequired(String privilegesRequired) {
        this.privilegesRequired = privilegesRequired;
    }

    public String getUserInteraction() {
        return userInteraction;
    }

    public void setUserInteraction(String userInteraction) {
        this.userInteraction = userInteraction;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
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

    public String getBaseSeverity() {
        return baseSeverity;
    }

    public void setBaseSeverity(String baseSeverity) {
        this.baseSeverity = baseSeverity;
    }
}
