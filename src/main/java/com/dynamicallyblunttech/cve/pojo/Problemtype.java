package com.dynamicallyblunttech.cve.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Problemtype {

    @JsonProperty
    private List<ProblemtypeData> problemtype_data;
}
