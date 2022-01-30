package com.example.cve.cvepojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Description2 {

    @JsonProperty
    private List<DescriptionData> description_data ;

    public List<DescriptionData> getDescription_data() {
        return description_data;
    }

    public void setDescription_data(List<DescriptionData> description_data) {
        this.description_data = description_data;
    }
}
