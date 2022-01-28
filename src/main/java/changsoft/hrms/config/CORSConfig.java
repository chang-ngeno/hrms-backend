package changsoft.hrms.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CORSConfig {

    Logger logger = LoggerFactory.getLogger(CORSConfig.class);

    @Value("${cors.origin}")
    private String url;
    
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        logger.info("WebMvcConfigurer :: corsConfigurer :: " + url);
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins(url);
            }
        };
    }

}