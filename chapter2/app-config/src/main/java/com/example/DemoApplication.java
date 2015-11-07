package com.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableConfigurationProperties
public class DemoApplication {

    Log logger = LogFactory.getLog(DemoApplication.class);

    @Value("${configuration.projectName}")
    private void propertyFromConfiguration(String propertyName) {
        logger.info("\n\n setting project name : " + propertyName + " \n\n");
    }

    @Autowired
    private void setEnvironment(Environment environment) {
        logger.info("\n\n setting environment : " + environment.getProperty("configuration.projectName") + "\n\n");
    }

    //injecting a pojo with properties
    @Autowired
    private void setConfigurationProjectProperties(ConfigurationProjectPropertiesMapping configurationProjectProperties) {
        logger.info("\n\n setting pojo mapped with project name : " + configurationProjectProperties.getProjectName() + "\n");
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

/**
 * This pojo is used to map properties.
 */

@Component //to enable bean injection
@ConfigurationProperties("configuration")
class ConfigurationProjectPropertiesMapping {

    private String projectName;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}

