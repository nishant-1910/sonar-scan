//package org.example;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//@WebMvcTest(HelloController.class)
//class HelloControllerWebMvcTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    @DisplayName("GET / returns 200 and greeting body")
//    void shouldReturnOkAndGreetingForRootPath() throws Exception {
//        mockMvc
//                .perform(get("/").accept(MediaType.TEXT_PLAIN))
//                .andExpect(status().isOk())
//                .andExpect(content().string("Hello from Spring Boot"));
//    }
//
//    @ParameterizedTest
//    @ValueSource(strings = {"/unknown", "/api/missing", "/health/deep"})
//    @DisplayName("GET unknown paths return 404")
//    void shouldReturnNotFoundForUnknownPaths(String path) throws Exception {
//        mockMvc.perform(get(path)).andExpect(status().isNotFound());
//    }
//
//    @Test
//    @DisplayName("GET / accepts application/json and still returns greeting")
//    void shouldReturnGreetingWhenJsonAccepted() throws Exception {
//        mockMvc
//                .perform(get("/").accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content().string("Hello from Spring Boot"));
//    }
//}
