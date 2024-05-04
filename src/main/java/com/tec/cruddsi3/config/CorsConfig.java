package com.tec.cruddsi3.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.micrometer.common.lang.NonNull;
@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(@SuppressWarnings("null") @NonNull CorsRegistry registry){
        registry.addMapping("/**") 
         .allowedOrigins("*")//permitir solicitudes desde cualquier origen
         .allowedMethods("GET", "POST", "PUT", "DELETE");

    }
}
