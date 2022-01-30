package com.dynamicallyblunttech.cve.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class References {

    @JsonProperty
    private List<ReferenceData> reference_data ;
}
