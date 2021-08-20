package com.galvanize;

import java.time.LocalDateTime;

public class Constructors {
    private String orderNumber;
    private String name;
    private java.time.LocalDateTime createdDate;

    //your code goes here, do not change any existing code
    public Constructors(String whom, String ordnum){
        name = whom;
        orderNumber = ordnum;
        createdDate = LocalDateTime.now() ;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }
}

