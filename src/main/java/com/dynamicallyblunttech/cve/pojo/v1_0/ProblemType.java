package com.dynamicallyblunttech.cve.pojo.v1_0;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProblemType {

    @JsonProperty(value = "problemtype_data")
    private List<ProblemTypeData> problemTypeData;
}
