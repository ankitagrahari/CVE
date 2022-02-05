package com.dynamicallyblunttech.cve.pojo.v1_1;

import com.dynamicallyblunttech.cve.pojo.v1_0.Impact;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CVEItems {

    private CVEData cve;
    private Configurations configurations;
    private Impact impact;
    private String publishedDate;
    private String lastModifiedDate;
}
