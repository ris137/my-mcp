/* (C)2025 */
package io.claude.mcp.server.app;

import io.claude.mcp.server.config.WeatherServiceConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {WeatherServiceConfiguration.class})
public class McpServerApp {

    public static void main(String[] args) {
        SpringApplication.run(McpServerApp.class, args);
    }
}
