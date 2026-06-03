package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PeachController.class)
class PeachControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getPeach_shouldReturnCatchPhrase() throws Exception {
        //TODO: Implement test
        mockMvc.perform(get("/peach"))
                .andExpect(status().isOk())
                .andExpect(content().string("I'm Princess Peach!"));
    }

    @Test
    void postPeach_shouldReturnWeirdPostPhrase() throws Exception {
        mockMvc.perform(post("/peach"))
                .andExpect(status().isOk())
                .andExpect(content().string("I'm posting peaches!"));
    }
}
