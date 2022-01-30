package com.dynamicallyblunttech.cve.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Product {

    @JsonProperty
    private List<ProductData> product_data ;

    public List<ProductData> getProduct_data() {
        return product_data;
    }

    public void setProduct_data(List<ProductData> product_data) {
        this.product_data = product_data;
    }
}
