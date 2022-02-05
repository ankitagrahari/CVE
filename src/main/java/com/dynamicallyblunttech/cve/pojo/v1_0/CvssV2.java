package com.dynamicallyblunttech.cve.pojo.v1_0;

import lombok.Data;

@Data
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
}
