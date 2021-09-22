package com.PureIntegration.PureIntegration;

import com.PureIntegration.PureIntegration.Service.BreedsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.awt.*;

@WebMvcTest
public class BreedsControllerTest {
@MockBean
    BreedsService breedsService;
    @Autowired
    MockMvc mockMvc;
    @Test

    public void getBreedsTest() throws  Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/api/breeds/list/all"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
    }
}
