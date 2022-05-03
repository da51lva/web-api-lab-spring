package matt.thewizard.techreturners.apilab.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest
class HomeControllerTest {

    @Autowired
    private MockMvc mockMVCController;

    @Test
    public void testGetHome() throws Exception {

        String expectedConstant = "Welcome to the Drinks API!";

        this.mockMVCController.perform(
                    MockMvcRequestBuilders.get("/"))
                              .andExpect(MockMvcResultMatchers.status().isOk())
                              .andExpect(MockMvcResultMatchers.content().string(expectedConstant));
    }

}