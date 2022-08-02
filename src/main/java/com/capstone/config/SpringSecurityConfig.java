package com.capstone.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User
          .withUsername("a")
          .password(encoder().encode("a"))
          .roles("USER").build());
        manager.createUser(User
                .withUsername("b")
                .password(encoder().encode("b"))
                .roles("USER").build());
        manager.createUser(User
                .withUsername("501361697")
                .password(encoder().encode("Test@1234"))
                .roles("USER").build());
        manager.createUser(User
                .withUsername("501493526")
                .password(encoder().encode("Test@1234"))
                .roles("USER").build());
        manager.createUser(User
                .withUsername("501743128")
                .password(encoder().encode("Test@1234"))
                .roles("USER").build());
        manager.createUser(User
                .withUsername("501979437")
                .password(encoder().encode("Test@1234"))
                .roles("USER").build());
        manager.createUser(User
                .withUsername("600016105")
                .password(encoder().encode("Test@1234"))
                .roles("USER").build());
        manager.createUser(User
                .withUsername("600016951")
                .password(encoder().encode("Test@1234"))
                .roles("USER").build());
        manager.createUser(User
                .withUsername("600028988")
                .password(encoder().encode("Test@1234"))
                .roles("USER").build());
        manager.createUser(User
                .withUsername("600117930")
                .password(encoder().encode("Test@1234"))
                .roles("USER").build());
        manager.createUser(User
                .withUsername("600121429")
                .password(encoder().encode("Test@1234"))
                .roles("USER").build());
        manager.createUser(User
                .withUsername("600139301")
                .password(encoder().encode("Test@1234"))
                .roles("USER").build());
        manager.createUser(User
                .withUsername("600149559")
                .password(encoder().encode("Test@1234"))
                .roles("USER").build());
        manager.createUser(User
                .withUsername("600158488")
                .password(encoder().encode("Test@1234"))
                .roles("USER").build());
        return manager;
    }
    
    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/**").permitAll().anyRequest()
				.authenticated().and()
				// .formLogin().and()
				.httpBasic();
	}
            
	
}
