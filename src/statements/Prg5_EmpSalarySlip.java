package statements;
/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
| Salary Slip                  |
|______________________________|
| Employee Id : 2564           |
| Employee Name : Jay          |
|______________________________|
| Basic Salary : 25000.0       |
| HRA 10% : 2500.0             |
| TA 8% : 2250.0               |
| DA 9% : 2000.0               |
| PF - 20& : 5000.0            |
|______________________________|
| Gross Salary : 26750.0       |
|===========================|
 */
import java.util.Scanner;

public class Prg5_EmpSalarySlip {

    static void calculatesal(){             //Create static Method

        //Declare the local Variables
        int emp_Id;
        String emp_Name;
        float b_Sal,hra,ta,da,pf,g_Sal;

        Scanner employee = new Scanner(System.in);          //import Scanner class and create a scanner object
        System.out.print("Enter the Employee Id : ");       //print statement for input Employee id
        emp_Id = employee.nextInt();                        // Read user input
        System.out.print("Enter the Employee Name : ");     //print statement for input Employee Name
        emp_Name = employee.next();                         // Read user input
        System.out.print("Enter the Basic Salary : ");      //print statement for input Salary
        b_Sal = employee.nextFloat();                       // Read user input


        //formula
        hra = (b_Sal*10)/100;
        da = (b_Sal*8)/100;
        ta = (b_Sal*9)/100;
        pf = (b_Sal*20)/100;
        g_Sal = b_Sal+hra+ta+da-pf;

        //Output print Statements
        System.out.println("_______________________________");
        System.out.println("| Salary Slip                  |");
        System.out.println("|______________________________|");
        System.out.println("| Employee Id : "  +emp_Id+ "  |");
        System.out.println("| Employee Name : "+emp_Name+" |");
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary : "+b_Sal+"     |");
        System.out.println("| HRA 10% : "+hra+"            |");
        System.out.println("| TA 8% :"+ta+"                |");
        System.out.println("| DA 9% : "+da+"               |");
        System.out.println("| PF - 20& : "+pf+"            |");
        System.out.println("|______________________________|");
        System.out.println("| Gross Salary : "+g_Sal+"     |");
        System.out.println("|===========================|");
    }

    //Main method
    public static void main(String[] args) {
        Prg5_EmpSalarySlip.calculatesal();      //Call static method via Program name.
    }
}

