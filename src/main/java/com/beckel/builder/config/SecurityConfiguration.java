package com.beckel.builder.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by Beckel on 5/16/2017.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity
@Order(2)


public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .exceptionHandling().and()
                .anonymous().and()
                .servletApi().and().authorizeRequests()

                //Allow access to API explorer temporarily
                .antMatchers("/api-docs").permitAll()
                .antMatchers("/swagger-ui.html").permitAll()
                .antMatchers("/webjars/**").permitAll()
                .antMatchers("/v2/**").permitAll()
                .antMatchers("/configuration/**").permitAll()
                .antMatchers("/swagger-resources").permitAll()
                .antMatchers("/actuator").permitAll()
                .anyRequest().permitAll().and()
                .csrf().disable()
                .headers().cacheControl();
    }
}
