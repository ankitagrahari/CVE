package com.dynamicallyblunttech.cve.pojo.v1_1;

import com.dynamicallyblunttech.cve.pojo.v1_0.Description2;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CVEData {

    private String dataType;
    private String dataFormat;
    private String dataVersion;

    @JsonProperty(value = "CVE_data_meta")
    private CVEDataMeta cveMetaData;
    private Description2 description;
}
