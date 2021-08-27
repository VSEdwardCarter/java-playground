package com.galvanize;
import com.galvanize.DataStructuresAndAlgorithms;


public class ApplicationDataStructure {
    public static void main(String[] args) {
        ApplicationDataStructure app = new ApplicationDataStructure();
        String[] fruit = {"Apple", "Banana", "Starfruit", "Peach", "Mango", "Pineapple"};

        System.out.println(app.toSentence(fruit));
        System.out.println(app.Setence2(fruit));

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


   public String Setence2(String[] input){
        String output = "";
        for (int i = 0; i < input.length; i++) {
            output += input;
            if(i == input.length -2){
                output += " and ";
            }else if (i < input.length -2){
                output += ", ";}

            }
        return output;
        }
    }
