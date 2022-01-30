package com.dynamicallyblunttech.cve.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cve {

    @JsonProperty
    private String data_type;
    @JsonProperty
    private String data_format;
    @JsonProperty
    private String data_version;
    @JsonProperty
    private CVEDataMeta CVE_data_meta;
    @JsonProperty
    private Affects affects;
//    @JsonProperty
//    private Problemtype problemtype;
//    @JsonProperty
//    private References references;
    @JsonProperty
    private Description2 description;

    public String getData_type() {
        return data_type;
    }

    public void setData_type(String data_type) {
        this.data_type = data_type;
    }

    public String getData_format() {
        return data_format;
    }

    public void setData_format(String data_format) {
        this.data_format = data_format;
    }

    public String getData_version() {
        return data_version;
    }

    public void setData_version(String data_version) {
        this.data_version = data_version;
    }

    public CVEDataMeta getCVE_data_meta() {
        return CVE_data_meta;
    }

    public void setCVE_data_meta(CVEDataMeta CVE_data_meta) {
        this.CVE_data_meta = CVE_data_meta;
    }

    public Affects getAffects() {
        return affects;
    }

    public void setAffects(Affects affects) {
        this.affects = affects;
    }

//    public Problemtype getProblemtype() {
//        return problemtype;
//    }
//
//    public void setProblemtype(Problemtype problemtype) {
//        this.problemtype = problemtype;
//    }
//
//    public References getReferences() {
//        return references;
//    }
//
//    public void setReferences(References references) {
//        this.references = references;
//    }
//
    public Description2 getDescription() {
        return description;
    }

    public void setDescription(Description2 description) {
        this.description = description;
    }
}
