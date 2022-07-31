package statements;

//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”.

import java.util.Scanner;

public class Prg16PosNegZero {

    void getnum(){          //Create instance method

        int num;            //declare local variable

        Scanner scanner = new Scanner(System.in);       //import Scanner class and create a scanner object
        System.out.print("Enter Value : " );            //print statement for input value
        num =scanner.nextInt();                         // Read user input value

        //if else statement
        if(num>0)
        {
            System.out.println(num+ " is a Positive number ");      //output print statement
        }
        else if (num<0)
        {
            System.out.println(num+ " is a Negative number ");      //output print statement
        }
        else
        {
            System.out.println(num+ " is a Zero");                  //output print statement
        }

    }

    public static void main(String[] args) {            //Main method
        Prg16PosNegZero sc =new Prg16PosNegZero();      //Create object to call instance method to static method
        sc.getnum();                                    //call instance method via object name
    }
}
