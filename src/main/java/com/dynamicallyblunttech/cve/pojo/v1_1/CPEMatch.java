package com.dynamicallyblunttech.cve.pojo.v1_1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@JsonIgnoreProperties(ignoreUnknown = true)
public class CPEMatch {

    private String vulnerable;
    private String cpe23Uri;
    private String versionStartIncluding;
    private String versionEndExcluding;

    @JsonProperty(value = "cpe_name")
    private List<Dummy> dummy;
}
