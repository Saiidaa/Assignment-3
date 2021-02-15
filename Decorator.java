package com.company;

public class Decorator implements Data{
    private final Data wrappee;

    Decorator(Data source) {
        this.wrappee = source;
    }
    
    @Override
    public void send() {
        wrappee.send();

    }
}
