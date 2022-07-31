package statements;

//  Write a Java program to calculate the average value of array elements.

import java.util.Scanner;

public class Prg19AverageOFArrays {
    static void getAvg() {                              //Create static method
        int n, sum = 0;
        float avg;
        Scanner s = new Scanner(System.in);                          //import Scanner class and create a scanner object
        System.out.print("Enter no. of elements you want in array:"); //print statement for input element
        n = s.nextInt();                                              // Read user input
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        avg = (float)sum / n;                         //Calculate average
        System.out.println("Average value of the array elements is : " + avg); //Print statement
    }

        public static void main (String[]args){       //Main method
            Prg19AverageOFArrays.getAvg();          //Call static method via Program name.
        }
    }
