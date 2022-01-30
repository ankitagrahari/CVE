package com.dynamicallyblunttech.cve.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Affects {

    @JsonProperty
    public Vendor vendor ;

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }
}
