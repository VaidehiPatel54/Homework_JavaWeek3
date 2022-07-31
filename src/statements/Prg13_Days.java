package statements;

import java.util.Scanner;
/* . Write a Java program which input any number between 1 to 7 and it print The Days
name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 NOTE: if number is out of selection Print message “Week contains 1 to 7 days”  */
public class Prg13_Days {

    static void days1(){            //Create static method
        int day;                    //Declare local variable
        Scanner scanner = new Scanner(System.in);       //import Scanner class and create a scanner object

        System.out.print ("Input any number between 1 to 7  : " );    //print statement for input value
        day = scanner.nextInt();                                      // Read user input value

        //switch statement
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
    }

    public static void main(String[] args) {            //Main method
        Prg13_Days.days1();                         //Call static method via Program name.
    }
}
