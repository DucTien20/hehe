package com.example.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurity {
   @Bean
    public SecurityFilterChain securityFilterChain(
            HttpSecurity http
    ) throws Exception{
       http.authorizeHttpRequests(
               auth -> auth.requestMatchers("/no-auth")
                       .permitAll().
               auth.reques
       );
        return http.build();
    }
}
