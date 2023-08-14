package com.aptech.ProjectSem4.config;

import org.apache.catalina.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration
{
	
	  @Bean 
	  public WebSecurityCustomizer webSecurityCustomizer() { 
		  return (web) ->
		  web.ignoring().requestMatchers("/users", "/register"); 
	  }
	
	/*
	 * @Bean public InMemoryUserDetailsManager userDetailsService(PasswordEncoder
	 * passwordEncoder) { UserDetails user = User.withUsername("user")
	 * .password(passwordEncoder.encode("password")) .roles("USER") .build();
	 * 
	 * UserDetails admin = User.withUsername("admin")
	 * .password(passwordEncoder.encode("admin")) .roles("USER", "ADMIN") .build();
	 * 
	 * return new InMemoryUserDetailsManager(user, admin); }
	 */

	    @Bean
	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	        http.authorizeRequests()
	            .anyRequest()
	            .authenticated()
	            .and()
	            .formLogin().loginPage("/login").permitAll();
	        return http.build();
	    }

	    @Bean
	    public PasswordEncoder passwordEncoder() {
	        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
	        return encoder;
	    }
}
