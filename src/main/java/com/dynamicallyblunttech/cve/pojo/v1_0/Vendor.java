package com.dynamicallyblunttech.cve.pojo.v1_0;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Vendor {

    @JsonProperty
    private List<VendorData> vendor_data ;
}
