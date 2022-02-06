package com.dynamicallyblunttech.cve.pojo.v1_1;

import com.dynamicallyblunttech.cve.pojo.v1_0.Description2;
import com.dynamicallyblunttech.cve.pojo.v1_0.ProblemType;
import com.dynamicallyblunttech.cve.pojo.v1_0.References;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@JsonIgnoreProperties(ignoreUnknown = true)
public class CVEData {

    @JsonProperty(value = "data_type")
    private String dataType;

    @JsonProperty(value = "data_format")
    private String dataFormat;

    @JsonProperty(value = "data_version")
    private String dataVersion;

    @JsonProperty(value = "CVE_data_meta")
    private CVEDataMeta cveMetaData;

    @JsonProperty(value = "problemtype")
    private ProblemType problemType;

    @JsonProperty(value = "references")
    private References references;

    @JsonProperty(value = "description")
    private Description2 description;
}
