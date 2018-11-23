package com.kolema.infrabbitmq.rest.controller;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestControllerTest {

    @Resource
    private TestController testController;

    private MockMvc mvc;

    @Autowired
    protected WebApplicationContext wac;

    @Test
    public void testProduce() throws Exception {

        mvc.perform(MockMvcRequestBuilders.get("/test/produce")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .param("lat", "123.123").param("lon", "456.456")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("SUCCESS")));

    }

    @Before()
    public void setup() {
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();  //初始化MockMvc对象
    }


}