package com.dynamicallyblunttech.cve.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Description2 {

    @JsonProperty
    private List<DescriptionData> description_data ;
}
