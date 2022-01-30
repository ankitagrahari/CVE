package com.dynamicallyblunttech.cve;

public class OutputCVEJson {

    private String cveId;
    private String description;
    private String baseMetricV3score;
    private String baseMetricV2score;

    public String getCveId() {
        return cveId;
    }

    public void setCveId(String cveId) {
        this.cveId = cveId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBaseMetricV3score() {
        return baseMetricV3score;
    }

    public void setBaseMetricV3score(String baseMetricV3score) {
        this.baseMetricV3score = baseMetricV3score;
    }

    public String getBaseMetricV2score() {
        return baseMetricV2score;
    }

    public void setBaseMetricV2score(String baseMetricV2score) {
        this.baseMetricV2score = baseMetricV2score;
    }
}
