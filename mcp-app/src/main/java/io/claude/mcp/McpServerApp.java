package io.claude.mcp;

import io.claude.mcp.server.config.WeatherServiceConfiguration;
import io.claude.mcp.server.service.WeatherService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackageClasses = {WeatherServiceConfiguration.class})
public class McpServerApp {

    public static void main(String[] args) {
        SpringApplication.run(McpServerApp.class, args);
    }

}