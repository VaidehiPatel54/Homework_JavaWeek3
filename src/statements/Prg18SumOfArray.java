package statements;

//Write a Java program to sum values of an array.

import java.util.Scanner;

public class Prg18SumOfArray {

    void getSum() {              //Create instance method
        int n, sum = 0;

        Scanner s = new Scanner(System.in);                          //import Scanner class and create a scanner object

        System.out.print("Enter no. of elements you want in array:"); //print statement for input element
        n = s.nextInt();                                                // Read user input

        int a[] = new int[n];
        System.out.println("Enter all the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("The sum is " + sum);            //output print statement
    }
    public static void main(String[] args) {                //Main method
        Prg18SumOfArray obj = new Prg18SumOfArray();        //Create object to call instance method to static method
        obj.getSum();                                       //call instance method via object name
    }
}

