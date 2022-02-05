package com.dynamicallyblunttech.cve.pojo.v1_0;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Description2 {

    @JsonProperty(value = "description_data")
    private List<DescriptionData> descriptionData ;
}
