package com.hng.stagezeroapi;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.Instant;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/info")
    public ApiResponse getInfo() {
        ApiResponse response = new ApiResponse();
        response.setEmail("kibsnick@ymail.com"); 
        response.setCurrentDatetime(Instant.now().toString()); 
        response.setGithubUrl("https://github.com/nixonkingori/hng-stage-zero-api.git");
        return response;
    }

    // CORS Configuration
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**").allowedOrigins("*");
            }
        };
    }

    // Inner class for the API response
    static class ApiResponse {
        private String email;
        private String currentDatetime;
        private String githubUrl;

        // Getters and Setters
        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getCurrentDatetime() {
            return currentDatetime;
        }

        public void setCurrentDatetime(String currentDatetime) {
            this.currentDatetime = currentDatetime;
        }

        public String getGithubUrl() {
            return githubUrl;
        }

        public void setGithubUrl(String githubUrl) {
            this.githubUrl = githubUrl;
        }
    }
}