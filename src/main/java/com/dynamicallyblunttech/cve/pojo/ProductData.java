package com.dynamicallyblunttech.cve.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProductData {

    @JsonProperty
    private String product_name ;
    @JsonProperty
    private Version version ;
}
