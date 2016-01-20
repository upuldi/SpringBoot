package com.test;

/**
 * Created by udoluweera on 1/9/16.
 */
public class ServiceError {

    private boolean hasErrors = Boolean.FALSE;


    private String somerError;
    private String anotherError;
    private String someOtherError;

    public boolean isHasErrors() {
        return hasErrors;
    }

    public void setHasErrors(boolean hasErrors) {
        this.hasErrors = hasErrors;
    }

    public String getSomerError() {
        return somerError;
    }

    public void setSomerError(String somerError) {
        this.somerError = somerError;
    }

    public String getAnotherError() {
        return anotherError;
    }

    public void setAnotherError(String anotherError) {
        this.anotherError = anotherError;
    }

    public String getSomeOtherError() {
        return someOtherError;
    }

    public void setSomeOtherError(String someOtherError) {
        this.someOtherError = someOtherError;
    }
}
