package com.galvanize;

import javax.xml.stream.events.Namespace;
import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Fruit Banana = new Fruit("medium","Yellow", "Banana");
        System.out.println(Banana.getColor());

        Constructors blah = new Constructors("Edward Carter", 23423);
        System.out.println(blah);

        String [] names = new String[4];
        names[0] = "Carter";
        names[1] = "Nthabiseng";
        names[2] = "Kenako";
        names[3] = "Kelesego";

        //Print out a specific name in the array
        System.out.println(names[3]);

        //Print out all the names in the array
        for(String name : names){
            System.out.println(name);
        }

        //Create ArrayList from Array and print out each entry
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        for(String name : nameList){
            System.out.println(name);
        }

        //Sort ArrayList Alphabetically and print return
        nameList.sort(null);

        System.out.println(nameList);


        //names.sortArray();





    }
    public ArrayList<String> sortArray(String[] inputArray) {
     //Convert array into ArrayList
        ArrayList<String> test = new ArrayList<>(Arrays.asList(inputArray));

        test.sort(null);
        return test;

    }
}



