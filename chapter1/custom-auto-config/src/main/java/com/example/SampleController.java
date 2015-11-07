package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by udoluweera on 11/8/15.
 */
@RestController
public class SampleController {

    @RequestMapping
    public String someControllerMethod() {
        return "Simple Spring Web MVC Application";
    }

}
