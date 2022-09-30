package com.example.springsecurityex.securityconfig;

import com.example.springsecurityex.service.jwt.CustomAuthorizationFilter;
import com.example.springsecurityex.service.jwt.CustomAuthenticationFilter;
import com.example.springsecurityex.model.ApplicationUserPermission;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;



@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ApplicationSecurityConfig {



    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }


    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().authorizeRequests()
                .antMatchers("/hr-trainee").hasAnyAuthority(ApplicationUserPermission.HR_TRAINEE.getPermission())
                .antMatchers("/hr").hasAnyAuthority(ApplicationUserPermission.HR.getPermission())
                .antMatchers("/login").permitAll()
                .antMatchers("/").permitAll()
                .antMatchers(HttpMethod.GET,"/api/**")
                    .hasAnyAuthority(ApplicationUserPermission.HR.getPermission()).anyRequest().authenticated().and()
                .addFilter(new CustomAuthenticationFilter(authenticationManager(http.getSharedObject(AuthenticationConfiguration.class))))
                .addFilterBefore(new CustomAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class).authorizeRequests();
        return http.build();
    }


    public UserDetailsService userDetailsService() {
        return new AuthenticationUserConfig();
    }
}
