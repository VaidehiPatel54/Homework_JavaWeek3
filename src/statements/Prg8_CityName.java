package statements;
/* 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry

 */
import java.util.Scanner;

public class Prg8_CityName {

    static void cities() {                                   //Create static method
        Scanner sc = new Scanner(System.in);                //import Scanner class and create a scanner object
        System.out.println("Enter the Any Alphabet from A to F ");      //print statement for input alphabet
        char city = sc.next().charAt(0);                                // Read user input

        //Nested if else statement
        if (city == 'a' || city == 'A')
        {
            System.out.println("Ahmedabad");                //output print statement
        }
        else if (city == 'b' || city == 'B')
        {
            System.out.println("Baroda");                   //output print statement
        }
        else if (city == 'c' || city == 'C')
        {
            System.out.println("Chandigadh");               //output print statement
        }
        else if (city == 'd' || city == 'D')
        {
            System.out.println("Delhi");                    //output print statement
        }
        else if (city == 'e' || city == 'E')
        {
            System.out.println("Etavah");                   //output print statement
        }
        else if (city == 'f' || city == 'F')
        {
            System.out.println("Faridabad");               //output print statement
        }
        else
            {
                System.out.println("You entered Invalid Character");
        }
    }
    public static void main(String[] args) {            //Main method

        Prg8_CityName.cities();             //Call static method via Program name.

    }
}