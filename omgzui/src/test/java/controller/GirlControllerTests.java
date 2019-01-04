package controller;

import com.example.omgzui.OmgzuiApplication;
import com.example.omgzui.properties.GirlProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OmgzuiApplication.class)
@AutoConfigureMockMvc
@EnableConfigurationProperties(GirlProperties.class)
public class GirlControllerTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testGirl() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/girl/detail/4"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json("{\n" +
                        "id: 4,\n" +
                        "cupSize: \"B\",\n" +
                        "age: 15,\n" +
                        "money: 900\n" +
                        "}"));
    }
}
