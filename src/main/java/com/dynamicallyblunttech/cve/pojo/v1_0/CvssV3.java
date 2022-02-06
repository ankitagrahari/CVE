package com.dynamicallyblunttech.cve.pojo.v1_0;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
