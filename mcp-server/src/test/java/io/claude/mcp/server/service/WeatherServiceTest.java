package io.claude.mcp.server.service;

import io.claude.mcp.server.config.WeatherServiceConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = WeatherServiceConfiguration.class)
public class WeatherServiceTest {

    @Autowired
    private WeatherService service;

    @Test
    public void test1() {
        Assertions.assertNotNull(service.getAlerts("Ohio"));
    }
}
