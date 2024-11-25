package com.gl.CompleteUT.exception;

public class CloudVendorNotFoundException extends RuntimeException {
    public CloudVendorNotFoundException(String message) {
        super(message);
    }
}
