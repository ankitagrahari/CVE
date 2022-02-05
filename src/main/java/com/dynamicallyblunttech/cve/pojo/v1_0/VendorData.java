package com.dynamicallyblunttech.cve.pojo.v1_0;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class VendorData {

    @JsonProperty
    private String vendor_name ;
    @JsonProperty
    private Product product ;
}
