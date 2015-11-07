package com.example;

import org.apache.catalina.startup.Tomcat;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Created by udoluweera on 11/8/15.
 */

@Configuration
@ConditionalOnClass(Tomcat.class)
//The following property can be set to on off this in a property file
@ConditionalOnProperty(name = "log-tomcat-version", matchIfMissing = true)
public class MyFirstAutoConfiguration {

    private static Log logger = LogFactory.getLog(MyFirstAutoConfiguration.class);

    /**
     * This will displays the tomcat version.
     * This auto configuration has to be added in the META-INF/spring.factories file.
     */

    @PostConstruct
    public void logTomcatVersion() {

        logger.info("\n\n\n\n tomcat version " + Tomcat.class.getPackage().getImplementationVersion() + "\n\n\n");
    }





}
