package com.dinesh.deloitte.code.exception;

/**
 * 
 */
public class ActivityHandlerException extends Exception {

    public ActivityHandlerException(String msg){
        super(msg);
    }

    public ActivityHandlerException(String msg, Throwable t){
        super(msg, t);
    }

}
