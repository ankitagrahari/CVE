package com.dynamicallyblunttech.cve.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CVEDataMeta {

    @JsonProperty
    private String ID ;
    @JsonProperty
    private String ASSIGNER ;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getASSIGNER() {
        return ASSIGNER;
    }

    public void setASSIGNER(String ASSIGNER) {
        this.ASSIGNER = ASSIGNER;
    }
}
