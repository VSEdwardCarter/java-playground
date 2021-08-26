package com.galvanize;

import java.util.HashMap;
import java.util.Map;

public class DataStructuresAndAlgorithms {

    //For The given Method signature, write and implementation that generates a HashMap, adds the following two items, and returns the HashMap
    //Create the method that takes now input
    public HashMap<Integer, String> genHashMap() {
        //Instantiating the HashMap
        HashMap< Integer, String> test = new HashMap<>();
        // Add the required to items
        test.put(747, "Airplane");
        test.put(10, "Laphroaig");
        //Return the HashMap
        return test;
    }
    public String toSentence(String[] input){
        String everyResult = "";

        if(input.length == 0 || input[0] == ""){

            return everyResult;
        }
        if(input.length == 1){
            everyResult = input[0];
        }else if(input.length == 2){
            everyResult = input[0] + " and "+input[1];
        }else {
            for (int i = 0; i < input.length; i++) {
            if(input.length > 0){
                everyResult = input[i] +", ";
            }

            }


        }return everyResult;

    }





}
