package statements;

//Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;

public class Prg12_NumAlphaSymbol {

    static void checkValue(){               //Create static method

        char ch;
        Scanner scanner = new Scanner(System.in);           //import Scanner class and create a scanner object

        System.out.println(" Enter any Value : " );         //print statement for input value
        ch = scanner.next().charAt(0);                      // Read user input value

        //if elseif else statemet
        if(ch>= '0' && ch<= '9')
        {
            System.out.println(ch + "  is a Number.");      //output print statement
        }

        else if((ch>= 'a' && ch<= 'z') || (ch>= 'A' && ch<= 'Z'))
        {
            System.out.println(ch + "  is an Alphabet.");       //output print statement
        }
        else
        {
            System.out.println(ch + "  is a Symbol.");          //output print statement
        }
    }

    public static void main(String[] args) {                //Main method
        Prg12_NumAlphaSymbol.checkValue();                  //Call static method via Program name.
    }

}
