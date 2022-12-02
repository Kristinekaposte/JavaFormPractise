package com.example.javaformpractice.exceptions;

public class ExceptionsPractise {
    RuntimeException runtimeException; //  unchecked exception
    Exception exception; //checked exceptions

    public static void main (String [] args){
        Throwable throwable = new Throwable();
        SdaException sdaException = new SdaException("smth went wrong", throwable);

        IllegalAddressException illegalAddressException = new IllegalAddressException("999 #$%");
      //  throw  sdaException;
        throw illegalAddressException;
    }




}
