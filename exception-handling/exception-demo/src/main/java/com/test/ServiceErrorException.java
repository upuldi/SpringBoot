package com.test;

/**
 * Created by udoluweera on 1/9/16.
 */
public class ServiceErrorException extends Exception {

    private ServiceError serviceError;

    public ServiceError getServiceError() {
        return serviceError;
    }

    public void setServiceError(ServiceError serviceError) {
        this.serviceError = serviceError;
    }
}
