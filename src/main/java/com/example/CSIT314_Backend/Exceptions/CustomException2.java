package com.example.CSIT314_Backend.Exceptions;

public class CustomException2 extends RuntimeException{
    public CustomException2(String name) {
        super("Warning, " + name);
    }
}
