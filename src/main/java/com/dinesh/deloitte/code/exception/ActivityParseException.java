package com.dinesh.deloitte.code.exception;

/**
 *
 */
public class ActivityParseException extends RuntimeException{


    public ActivityParseException(String msg){
        super(msg);
    }

    public ActivityParseException(String msg, Throwable t){
        super(msg, t);
    }

}
