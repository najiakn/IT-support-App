package com.example.support_back.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import static org.springframework.http.HttpMethod.GET;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {


    private final  JwtAuthenticationFilter jwtAuthFilter;

    private final AuthenticationProvider authenticationProvider;


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/**").permitAll()
                    //    .requestMatchers( "/api/v1/auth/authenticate/**","/api/v1/auth/registerAdmin/**").permitAll()
                      //  .requestMatchers("/api/tickets/**","/api/equipements/**").hasAuthority("ADMIN")
                        //.requestMatchers("/api/pannes/**").hasAuthority("ADMIN")
                        //.requestMatchers("/api/equipements/all","/api/utilisateur/**").hasAuthority("UTILISATEUR")

                        //.requestMatchers("/api/pannes/**","/api/equipements/**").hasAuthority("TECHNICIEN")
                        .anyRequest()
                        .authenticated()
                )
                .sessionManagement(session -> session
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )
                .authenticationProvider(authenticationProvider)
                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }
}