package com.shopcar.config;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Hincu Andrei (andreih1981@gmail.com)on 30.06.2018.
 * @version $Id$.
 * @since 0.1.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private static final Logger LOG = LogManager.getLogger(SecurityConfig.class);

    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers(
                "/");
    }
}
