package com.dynamicallyblunttech.cve.controller;

import com.dynamicallyblunttech.cve.OutputCVEJson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CveControllerTest {

    @Autowired
    CveController cveController;

    public void contextLoads(){
        assertNotNull(cveController);
    }

    @Test
    void getCVEData() {
    }

    @Test
    void convertJsonToObjectWithJsonFile() {
//        Map<String, List<OutputCVEJson>> map = cveController.convertJsonToObjectWithJsonFile(
//                2022, "microsoft", Arrays.asList(new String[]{"windows"}));
    }
}
