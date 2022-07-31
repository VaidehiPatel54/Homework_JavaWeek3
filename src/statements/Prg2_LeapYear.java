package statements;
/* 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
not? */
//Leap Years Are 2004,2008,2012,2016,2020,2024 and so on..
import java.util.Scanner;

public class Prg2_LeapYear {

    static void leap() {                         //Create static Method
        Scanner sc = new Scanner(System.in);     //import Scanner class and create a scanner object
        System.out.println("Enter any year :");  //print statement for input value
        int year = sc.nextInt();                 // Read user input


        //Formula of finding Leap year using if else statement
        if (year != 0) {
            if ((year % 4 == 0)&& (year%100!=0)||(year%400==0))
                System.out.println(year + " is a Leap Year");
            else
                System.out.println(year + " is not a Leap Year");
        } else {
                System.out.println("Year zero does not exist");
            }
        }
        //Declare the Main method
        public static void main(String[] args) {
            Prg2_LeapYear.leap();               //Call static method via Program name.
    }
}