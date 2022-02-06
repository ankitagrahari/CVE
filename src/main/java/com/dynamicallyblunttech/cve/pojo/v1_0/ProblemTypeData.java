package com.dynamicallyblunttech.cve.pojo.v1_0;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProblemTypeData {

    @JsonProperty(value = "description")
    private List<Description> description;

}
