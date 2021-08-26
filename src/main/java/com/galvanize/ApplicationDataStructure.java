package com.galvanize;
import com.galvanize.DataStructuresAndAlgorithms;


public class ApplicationDataStructure {
    public static void main(String[] args) {
        ApplicationDataStructure app = new ApplicationDataStructure();
        String[] fruit = {"Apple", "Banana", "Starfruit", "Peach", "Mango", "Pineapple"};

        System.out.println(app.toSentence(fruit));

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
            for (int i = 0; i < input.length -2; i++) {
                everyResult += input[i] + ", ";
            }
            everyResult = everyResult + input[input.length-2] + " and " + input[input.length-1];
        }
        return everyResult;
        }

    }

//           for(String fruit: input){
//                   everyResult += fruit +", ";