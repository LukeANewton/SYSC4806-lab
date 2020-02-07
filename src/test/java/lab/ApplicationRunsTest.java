package lab;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationRunsTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnAddressBook() throws Exception {
        mockMvc.perform(get("/buddies")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().json("{id:0, buddies:[{},{},{},{},{}]}"));
    }

    @Test
    public void createGetShouldReturnForm() throws Exception {
        mockMvc.perform(get("/create"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("<form")));
    }

    @Test
    public void deleteShouldRemoveBuddy() throws Exception {
        mockMvc.perform(get("/delete?id=1"))
                .andExpect(status().isOk());

        mockMvc.perform(get("/buddies")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().json("{id:0, buddies:[{},{},{},{}]}"));
    }
}

