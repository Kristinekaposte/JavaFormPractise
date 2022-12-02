package com.example.javaformpractice.exceptions;

import java.security.PublicKey;

public class SdaException extends RuntimeException{ //  we call our own special exceptions

    public  SdaException (final String message, final Throwable cause){
        super(message, cause);
    }
}
