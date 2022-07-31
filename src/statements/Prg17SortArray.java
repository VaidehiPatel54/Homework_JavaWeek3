package statements;

//Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class Prg17SortArray {

    static void getSortArray(){                     //Create static method
        int[] numeric_array = {60,21,8,20,89,54,23,7,86,25,20};   //declare int variable using array

        String[] string_array = {"Vaidehi","Prishiv","Nidhi","Kishan","Gaurang","Jayati","Foram","Jyoti","Bhoomi","Vrajesh"};
        System.out.println("Original numeric array : "+ Arrays.toString(numeric_array));
        Arrays.sort(numeric_array);                                 //Predefined method to sort
        System.out.println("Sorted numeric array : "+Arrays.toString(numeric_array));

        System.out.println("Original string array : "+Arrays.toString(string_array));
        Arrays.sort(string_array);                                  //Predefined method to sort
        System.out.println("Sorted string array : "+Arrays.toString(string_array));
    }

    public static void main(String[] args) {         //Main method
        Prg17SortArray.getSortArray();              //Call static method via Program name.
    }
}
