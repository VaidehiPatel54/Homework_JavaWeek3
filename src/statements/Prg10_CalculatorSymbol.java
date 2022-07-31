package statements;
/*Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)  */
import java.util.Scanner;

public class Prg10_CalculatorSymbol {

    static void symbolcalci(){              //Create static method

        //declare Local Variable
        int a,b,ans;
        char ch;
        Scanner scanner = new Scanner(System.in);       //import Scanner class and create a scanner object
        System.out.print("Enter Number 1 :  "  );       //print statement for input number 1
        a = scanner.nextInt();                          // Read user input number1

        System.out.print("Enter Number 2 :  "  );       //print statement for input number 1
        b = scanner.nextInt();                          // Read user input num 2

        System.out.print("Enter Symbol +,-,*,/  :  " );     //print statement for input symbols
        ch = scanner.next().charAt(0);                      // Read user input symbol


        //Nested if else statements
        if(ch == '+')
        {
            ans = a + b;                //formula for add
            System.out.println("Answer is = " +ans);        //Output print statement
        }
        else if(ch == '-')
        {
            ans = a - b;               //formula for sub
            System.out.println("Answer is = " +ans);        //Output print statement
        }
        else if(ch == '*')
        {
            ans = a * b;                //formula for multi
            System.out.println("Answer is = " +ans);        //Output print statement
        }
        else if(ch == '/')
        {
            ans = a / b;                //formula for div
            System.out.println("Answer is = " +ans);        //Output print statement
        }
        else
        {
            System.out.println("You Select Wrong Symbol..");        //Output print statement
        }
    }

    public static void main(String[] args) {            //Main method
        Prg10_CalculatorSymbol.symbolcalci();           //Call static method via Program name.
    }
}
