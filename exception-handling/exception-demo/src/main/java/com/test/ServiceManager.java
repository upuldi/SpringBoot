package com.test;

import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by udoluweera on 1/9/16.
 */
@Service
public class ServiceManager {


    public String someBusinessLogicMethod(ServiceError serviceError) {


        Random random = new Random();
        int generatedValue = random.nextInt(3);
        System.out.println(" Generated value : " + generatedValue);

        switch (generatedValue) {

            case 1: {
                break;
            }
            case 2: {
                serviceError.setSomerError("Add error to business logic.....");
                serviceError.setHasErrors(true);
                break;
            }
            case 3: {
                throw new RuntimeException("Some runtime error occurred.....");
            }
            case 4: {
                throw new NullPointerException("Nullpointer exception....");
            }
        }

        return "Business logic executed";
    }
}
