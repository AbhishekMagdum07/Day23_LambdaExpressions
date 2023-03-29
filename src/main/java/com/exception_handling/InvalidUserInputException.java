package com.exception_handling;
public class InvalidUserInputException extends RuntimeException{
    public  InvalidUserInputException(String msg) { // created one exception.
        super(msg);           // passing massage to parent class of exception i.e- default exception handlar.
    }
}
