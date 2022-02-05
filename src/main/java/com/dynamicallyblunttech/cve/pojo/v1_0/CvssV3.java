package com.dynamicallyblunttech.cve.pojo.v1_0;

import lombok.Data;

@Data
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
}
