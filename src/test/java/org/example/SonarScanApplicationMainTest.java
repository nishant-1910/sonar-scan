//package org.example;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.ArgumentMatchers.eq;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.mockStatic;
//import static org.mockito.Mockito.times;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.mockito.MockedStatic;
//import org.springframework.boot.SpringApplication;
//import org.springframework.context.ConfigurableApplicationContext;
//
//class SonarScanApplicationMainTest {
//
//    @Test
//    @DisplayName("main delegates to SpringApplication.run with same arguments")
//    void shouldInvokeSpringApplicationRunWithApplicationClassAndArgs() {
//        ConfigurableApplicationContext context = mock(ConfigurableApplicationContext.class);
//        String[] args = new String[] {"--spring.main.banner-mode=off"};
//
//        try (MockedStatic<SpringApplication> spring = mockStatic(SpringApplication.class)) {
//            spring.when(() -> SpringApplication.run(eq(SonarScanApplication.class), any(String[].class)))
//                    .thenReturn(context);
//
//            SonarScanApplication.main(args);
//
//            spring.verify(
//                    () -> SpringApplication.run(eq(SonarScanApplication.class), any(String[].class)),
//                    times(1));
//        }
//    }
//
//    @Test
//    @DisplayName("main accepts empty args array")
//    void shouldInvokeSpringApplicationRunWithEmptyArgs() {
//        ConfigurableApplicationContext context = mock(ConfigurableApplicationContext.class);
//        String[] args = new String[0];
//
//        try (MockedStatic<SpringApplication> spring = mockStatic(SpringApplication.class)) {
//            spring.when(() -> SpringApplication.run(eq(SonarScanApplication.class), any(String[].class)))
//                    .thenReturn(context);
//
//            SonarScanApplication.main(args);
//
//            spring.verify(
//                    () -> SpringApplication.run(eq(SonarScanApplication.class), any(String[].class)),
//                    times(1));
//        }
//    }
//}
