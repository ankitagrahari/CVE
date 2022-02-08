package com.dynamicallyblunttech.cve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class CveApplicationTests {

//    @Autowired
//    private MockMvc mockMvc;

    @Test
    void contextLoads() {}

//    @Test
//    public void readJsonDataFromFile() throws Exception {
//        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
//                .get("/cve/parse/2022/microsoft/windows"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andReturn();
//
//        System.out.println(result.getResponse().getContentAsString());
//    }

}
