package com.dynamicallyblunttech.cve.pojo.v1_1;

import com.dynamicallyblunttech.cve.pojo.v1_0.Impact;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@JsonIgnoreProperties(ignoreUnknown = true)
public class CVEItems {

    @JsonProperty(value = "cve")
    private CVEData cve;

    @JsonProperty(value = "configurations")
    private Configurations configurations;

    @JsonProperty(value = "impact")
    private Impact impact;

    @JsonProperty(value = "publishedDate")
    private String publishedDate;

    @JsonProperty(value = "lastModifiedDate")
    private String lastModifiedDate;
}
