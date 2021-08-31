package com.galvanize;

public class IceCreamException extends Exception{
    public IceCreamException(String Message){
        super(Message);
    }
    void run(String flavor) throws IceCreamException{
        throw new IceCreamException("Sorry, no vanilla left.");
    }
}
}
