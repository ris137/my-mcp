package io.claude.mcp.server.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

public class WeatherService {
    private final RestClient restClient = RestClient.builder()
            .baseUrl("https://api.weather.gov")
            .defaultHeader("Accept", "application/geo+json")
            .defaultHeader("User-Agent", "WeatherApiClient/1.0 (your@email.com)")
            .build();

//    @Tool(description = "Get weather forecast for a specific latitude/longitude")
//    public String getWeatherForecastByLocation(
//            double latitude,   // Latitude coordinate
//            double longitude   // Longitude coordinate
//    ) {
//        // Returns detailed forecast including:
//        // - Temperature and unit
//        // - Wind speed and direction
//        // - Detailed forecast description
//    }

    @Tool(description = "Get weather alerts for a US state")
    public String getAlerts(
            @ToolParam(description = "Two-letter US state code (e.g. CA, NY") String state) {
        return restClient.get().attribute("area", state).retrieve().body(String.class);
    }
}
