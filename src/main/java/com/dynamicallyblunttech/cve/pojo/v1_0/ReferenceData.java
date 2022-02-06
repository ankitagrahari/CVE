package com.dynamicallyblunttech.cve.pojo.v1_0;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReferenceData {

    @JsonProperty(value = "refsource")
    private String refSource ;

    @JsonProperty(value = "tags")
    private List<String> tags ;

    @JsonProperty(value = "url")
    private String url ;

    @JsonProperty(value = "name")
    private String name ;
}
