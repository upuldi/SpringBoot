package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by udoluweera on 1/9/16.
 */
@RestController()
public class RootController {

    @Autowired
    private ServiceManager serviceManager;

    @RequestMapping("/someAction")
    public String someMethod(){
        return "Success";
    }

    @RequestMapping("/serviceErrorException")
    public String someException() throws ServiceErrorException {

        ServiceError serviceErrors = new ServiceError();
        String response = serviceManager.someBusinessLogicMethod(serviceErrors);
        if (serviceErrors.isHasErrors()) {
            ServiceErrorException serviceErrorException = new ServiceErrorException();
            serviceErrorException.setServiceError(serviceErrors);
            throw serviceErrorException;
        }
        return response;
    }


}
