package com.dynamicallyblunttech.cve;

import lombok.Data;

@Data
public class OutputCVEJson {

    private String cveId;
    private String description;
    private String baseMetricV3score;
    private String baseMetricV2score;
}
