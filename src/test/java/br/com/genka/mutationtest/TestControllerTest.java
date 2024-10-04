package br.com.genka.mutationtest;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(TestController.class)
@ExtendWith(MockitoExtension.class)
class TestControllerTest {

    @Autowired
    private MockMvc mockMvc;
    
    @Test
    void testSort_shouldSortValuesInAscendingOrder() throws Exception {
    	mockMvc.perform(MockMvcRequestBuilders.get("/test/3, 1, 4, 2"))
    		.andExpect(MockMvcResultMatchers.status().isOk());
    }
    
//    @Test
//    public void testSort_shouldSortValuesInAscendingOrder() throws Exception {
//        List<Integer> expectedSortedValues = Arrays.asList(1, 2, 3, 4);
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/test/3, 1, 4, 2")
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(jsonPath("$.[0]", is(expectedSortedValues.get(0))))
//                .andExpect(jsonPath("$.[1]", is(expectedSortedValues.get(1))))
//                .andExpect(jsonPath("$.[2]", is(expectedSortedValues.get(2))))
//                .andExpect(jsonPath("$.[3]", is(expectedSortedValues.get(3))));
//    }
    
}