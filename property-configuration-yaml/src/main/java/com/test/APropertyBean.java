package com.test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by udoluweera on 1/9/16.
 */
@Component
@ConfigurationProperties("PropForBean")
public class APropertyBean {

    private String propertyOne;
    private String propertyTwo;
    private String propertyThree;

    public String getPropertyOne() {
        return propertyOne;
    }

    public void setPropertyOne(String propertyOne) {
        this.propertyOne = propertyOne;
    }

    public String getPropertyTwo() {
        return propertyTwo;
    }

    public void setPropertyTwo(String propertyTwo) {
        this.propertyTwo = propertyTwo;
    }

    public String getPropertyThree() {
        return propertyThree;
    }

    public void setPropertyThree(String propertyThree) {
        this.propertyThree = propertyThree;
    }
}
