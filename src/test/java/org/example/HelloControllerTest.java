package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HelloControllerTest {

    private HelloController controller;

    @BeforeEach
    void setUp() {
        controller = new HelloController();
    }

    @Test
    @DisplayName("hello should return fixed greeting")
    void shouldReturnGreetingWhenHelloInvoked() {
        String result = controller.hello();

        assertThat(result).isEqualTo("Hello from Spring Boot... sonar scan");
    }

    @Test
    @DisplayName("hello should never return null")
    void shouldNotReturnNullWhenHelloInvoked() {
        String result = controller.hello();

        assertThat(result).isNotNull();
    }

    @Test
    @DisplayName("hello should return non-blank text")
    void shouldReturnNonBlankWhenHelloInvoked() {
        String result = controller.hello();

        assertThat(result).isNotBlank();
    }
}
