package com.example.cve.cvepojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Impact {

    @JsonProperty
    private BaseMetricV3 baseMetricV3;
    @JsonProperty
    private BaseMetricV2 baseMetricV2 ;

    public BaseMetricV3 getBaseMetricV3() {
        return baseMetricV3;
    }

    public void setBaseMetricV3(BaseMetricV3 baseMetricV3) {
        this.baseMetricV3 = baseMetricV3;
    }

    public BaseMetricV2 getBaseMetricV2() {
        return baseMetricV2;
    }

    public void setBaseMetricV2(BaseMetricV2 baseMetricV2) {
        this.baseMetricV2 = baseMetricV2;
    }
}

