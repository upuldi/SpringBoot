package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by udoluweera on 11/7/15.
 */
@RestController
public class SampleController {

    @RequestMapping("/")
    public String testMapping() {

        return "Hello World Spring Boot Application";
    }

}
