package statements;
/*1.  Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)  */

import java.util.Scanner;

public class Prg1_OddEven_TenaryOperator {  //Create Class
    //Declare the Main method
    public static void main(String[] args) {

        Prg1_OddEven_TenaryOperator.getOddEven();   //Call static method via Program name.
    }

    static void getOddEven(){                       //Create static Method
        int num;                                    //Declare Local variable
        Scanner sc =new Scanner(System.in);         //import Scanner class and create a scanner object
        System.out.print("Enter any number : ");    //print statement for input value
        num = sc.nextInt();                         // Read user input

        String evenodd = (num%2==0)? "even" : "odd";  //formulla of find Odd and Even Number using ternary operator (? :)
        System.out.println(num+ " is " +evenodd+ "number"); //Output Print Statement
    }
}
