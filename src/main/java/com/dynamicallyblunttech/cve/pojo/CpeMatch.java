package com.dynamicallyblunttech.cve.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CpeMatch {

    @JsonProperty
    private Boolean vulnerable ;
    @JsonProperty
    private String cpe23Uri ;

}
