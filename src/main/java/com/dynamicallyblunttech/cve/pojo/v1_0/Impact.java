package com.dynamicallyblunttech.cve.pojo.v1_0;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Impact {

    @JsonProperty
    private BaseMetricV3 baseMetricV3;
    @JsonProperty
    private BaseMetricV2 baseMetricV2 ;
}

