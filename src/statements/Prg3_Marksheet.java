package statements;
//2. Re write the student mark sheet programme using if else and while loop.
import java.util.Scanner;

public class Prg3_Marksheet {

    public static void main(String[] args) {

        int rollno, maths = 0, sci = 0, eng = 0, total;
        float per;
        Scanner sc = new Scanner(System.in);                //import Scanner class and create a scanner object
        System.out.print("Enter Student's Name : \t");       //print statement for input Student name
        String name = sc.nextLine();                        // Read user input
        System.out.print("Enter Roll number : \t");          //print statement for input Student Roll no
        rollno = sc.nextInt();                              // Read user input
        System.out.print("Enter Marks of Maths :\t");       //print statement for input Marks of Maths
        maths = sc.nextInt();                               // Read user input
        while (maths < 0 || maths > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.print("Please Enter Correct Marks : \t");
            maths = sc.nextInt();
        }
        System.out.print("Enter Marks of Science : \t");      //print statement for input Marks of Science
        sci = sc.nextInt();                                   // Read user input
            while (sci < 0 || sci > 100) {
                System.out.println("Invalid Input, Marks should between 0 to 100");
                System.out.print("Please Enter Correct Marks : \t");
                sci = sc.nextInt();      ;
            }
        System.out.print("Enter Marks of English : \t");      //print statement for input Marks of English
        eng = sc.nextInt();                                 // Read user input
           while (eng < 0 || eng > 100) {
               System.out.println("Invalid Input, Marks should between 0 to 100");
               System.out.print("Please Enter Correct Marks : \t");
               eng = sc.nextInt();
           }

                total = maths + sci + eng;              //formula of find total
                per = (total * 100) / 300;              //percentage formula
                String grade = "";
                String result = "";

                // if((maths>=0 && maths<=100) || (sci>=0 && sci<=100) || (eng>=0 && eng<=100 ))

                if (per >= 80) {                    //Nested if else statement
                    grade = "A+";
                    result = "Pass";
                } else if (per >= 60) {
                    grade = "A";
                    result = "Pass";
                } else if (per >= 50) {
                    grade = "B";
                    result = "Pass";
                } else if (per >= 35) {
                    grade = "C";
                    result = "Pass";
                } else {
                    result = "fail";
                }

                if((maths<=34) || (sci<=34) || (eng<=34)){
                    result = "Fail";
                }
                //Output Print Statement
                System.out.println("________________________________");
                System.out.println("|                                |");
                System.out.println("| Mark Sheet                     |");
                System.out.println("________________________________");
                System.out.println("| Name :   " + name + "              |");
                System.out.println("| Roll No: " + rollno + "            |");
                System.out.println("________________________________");
                System.out.println("| Subjects : Marks               |");
                System.out.println("________________________________");
                System.out.println("| Math :    " + maths + "           |");
                System.out.println("| Science : " + sci + "             |");
                System.out.println("| English : " + eng + "              |");
                System.out.println("_________________________________");

                System.out.println("Total :     " + total + "            |");
                System.out.println("_________________________________");

                System.out.println("| Percentage : " + per + "           |");

                System.out.println("| Result :    " + result + "         |");
                System.out.println("| Grade :    " + grade + "           |");
                System.out.println("________________________________");

            }
        }