package com.galvanize;

public class bankAccount {
    long balance = 0;
    void deposit(long cents){
        balance += cents;
    }
    void withdraw(long cents){
        balance -= cents;
    }
    long balance(){
        return balance;
    }
    boolean isOverDrawn(){
        if(balance < 0){
            return true;
        } else {
            return false;
        }
    }
}
