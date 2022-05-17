package co.simplon.whatstream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CustomWebMvcConfigurer implements WebMvcConfigurer {

    @Value("${whatstream.cors.allowed-origins}")
    private String[] allowedOrigins;

    @Value("${whatstream.cors.allowed-methods}")
    private String[] allowedMethods;

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
	configurer.setUseTrailingSlashMatch(false);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
	registry.addMapping("/**").allowedOrigins(allowedOrigins).allowedMethods(allowedMethods);
    }
}
