package com.dynamicallyblunttech.cve.pojo.v1_1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CPEMatch {

    private String vulnerable;
    private String cpe23Uri;
    private String versionStartIncluding;
    private String versionEndExcluding;
}
