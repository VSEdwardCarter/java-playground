package com.galvanize;

import java.time.LocalDateTime;

public class Constructors {
    private int orderNumber;
    private String name;
    private java.time.LocalDateTime createdDate;

    //your code goes here, do not change any existing code
    public Constructors(String whom, int ordnum){
        name = whom;
        orderNumber = ordnum;
        createdDate = LocalDateTime.now() ;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    @Override
    public String toString() {
        return "Constructors{" +
                "orderNumber=" + orderNumber +
                ", name='" + name + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}


