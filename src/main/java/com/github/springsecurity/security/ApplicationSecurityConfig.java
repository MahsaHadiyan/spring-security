package com.github.springsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * Created by M.Hadiyan
 * Date: 7/4/2023
 * Time: 7:42 AM
 **/
@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

//    private final PasswordEncoder passwordEncoder;


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/", "index", "/css/*", "/js/*").permitAll().anyRequest().authenticated().and().httpBasic();

    }

    @Override
    @Bean
    public UserDetailsService userDetailsServiceBean() {
        UserDetails mahsaUser = User.builder().username("mahsa").password("password").roles("STUDENTS").build();
        return new InMemoryUserDetailsManager(mahsaUser);
    }
}
