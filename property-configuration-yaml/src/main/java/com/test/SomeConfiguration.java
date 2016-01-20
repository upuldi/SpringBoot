package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Created by udoluweera on 1/10/16.
 */

@Configuration
public class SomeConfiguration {

    @Autowired
    private Environment environment;


    @Bean
    public String someBeanCreation() {

        String value = environment.getProperty("configuration.projectName");

        return null;
    }

}
