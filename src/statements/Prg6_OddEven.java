package statements;

import java.util.Scanner;
//Write a java program to input any number and find out if it’s odd or even.
public class Prg6_OddEven {

    static void getnum(){                       //Create static Method

        Scanner scanner = new Scanner(System.in);           //import Scanner class and create a scanner object
        System.out.println("Enter the Number :");           //print statement for input number
        int a = scanner.nextInt();                          // Read user input number

        //if else statement
        if (a%2==0)
        {
            System.out.println(a+ " is an Even Number");
        } else {
            System.out.println(a+ " is an Odd Number");
        }
    }

    //Main method
    public static void main(String[] args) {
        Prg6_OddEven.getnum();                  //Call static method via Program name.
    }
}
