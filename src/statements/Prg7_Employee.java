package statements;
/* Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%      */


import java.util.Scanner;

public class Prg7_Employee {
    static void emp() {             //Create static Method

        //Declare local Variables
        int sales_id;
        String seller_name;
        double sales_amt, b_sal, sales_comm = 0;

        Scanner sales = new Scanner(System.in);         //import Scanner class and create a scanner object
        System.out.print("Enter the Sales Id :");       //print statement for input id
        sales_id = sales.nextInt();                      // Read user input id
        System.out.print("Enter the Seller's Name :");    //print statement for input name
        seller_name = sales.next();                         //Read user input name
        System.out.print("Enter the Sales Amount :");       //print statement for input sales amt
        sales_amt = sales.nextDouble();                     //Read user input sales amount
        System.out.print("Enter the Salary Basic :");       //print statement for input salary
        b_sal = sales.nextDouble();                          // Read user input salary

        //Nested if else statement
        if (sales_amt >= 50000) 
        {
            sales_comm = sales_amt * 0.35;
        } 
        else if (sales_amt >= 30000)
        {
            sales_comm = sales_amt * 0.20;
        } 
        else if (sales_amt >= 10000) 
        {
            sales_comm = sales_amt * 0.5;
        } 
        else if (sales_amt < 10000) 
        {
            sales_comm = sales_amt * 0.2;
        }
        System.out.println("Sales Commission is  :"  +sales_comm );         //output print statement
    }
    //main method
    public static void main(String[] args) {
        Prg7_Employee.emp();                    //Call static method via Program name.

    }
}
