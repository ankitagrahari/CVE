package com.dynamicallyblunttech.cve.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class References {

    @JsonProperty
    private List<ReferenceData> reference_data ;

    public List<ReferenceData> getReference_data() {
        return reference_data;
    }

    public void setReference_data(List<ReferenceData> reference_data) {
        this.reference_data = reference_data;
    }
}
