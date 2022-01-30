package com.example.cve.cvepojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Problemtype {

    @JsonProperty
    private List<ProblemtypeData> problemtype_data;

    public List<ProblemtypeData> getProblemtype_data() {
        return problemtype_data;
    }

    public void setProblemtype_data(List<ProblemtypeData> problemtype_data) {
        this.problemtype_data = problemtype_data;
    }
}
