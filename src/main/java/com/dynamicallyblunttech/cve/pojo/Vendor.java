package com.example.cve.cvepojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Vendor {

    @JsonProperty
    private List<VendorData> vendor_data ;

    public List<VendorData> getVendor_data() {
        return vendor_data;
    }

    public void setVendor_data(List<VendorData> vendor_data) {
        this.vendor_data = vendor_data;
    }
}
