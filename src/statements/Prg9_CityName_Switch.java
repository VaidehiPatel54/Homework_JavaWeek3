package statements;

//Same as above program-8 using switch statement.

import java.util.Scanner;

public class Prg9_CityName_Switch {

    static void cities1() {                     //Create static method
        Scanner sc = new Scanner(System.in);    //import Scanner class and create a scanner object
        System.out.println("Enter any alphabet from a to f : ");        //print statement for input alphabet
        char city = sc.next().charAt(0);                                // Read user input


        //swich statement
        switch (city){
            case'a': case 'A':
                System.out.println("Ahmedabad");            //output print statement
                break;
            case'b': case 'B':
                System.out.println("Baroda");              //output print statement
                break;
            case'c': case 'C':
                System.out.println("Chandigadh");           //output print statement
                break;
            case'd': case 'D':
                System.out.println("Delhi");                //output print statement
                break;
            case'e': case 'E':
                System.out.println("Etava");                //output print statement
                break;
            case'f': case 'F':
                System.out.println("Faridabad");            //output print statement
                break;
            default:
                System.out.println("Invalid Entry");         //output print statement
        }
    }

    public static void main(String[] args) {            //Main method
        Prg9_CityName_Switch.cities1();                 //Call static method via Program name.
    }
}
