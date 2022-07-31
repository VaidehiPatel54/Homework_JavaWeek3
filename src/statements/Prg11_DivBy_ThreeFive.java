package statements;

/*Write a java program to print the numbers between 1 to 100 which can be divided by 3
and 5 separately.*/

public class Prg11_DivBy_ThreeFive {

    static void div(){              //Create static method

        System.out.println("\nDivided by 3: ");
        for (int i=1; i<100; i++) {                     //for loop
            if (i%3==0)
                System.out.print(i +", ");
        }

        System.out.println("\n\nDivided by 5: ");
        for (int i=1; i<100; i++) {                     //for loop
            if (i%5==0) System.out.print(i +", ");
        }

        System.out.println("\n\nDivided by 3 & 5: ");
        for (int i=1; i<100; i++) {                     //for loop
            if (i%3==0 && i%5==0) System.out.print(i +", ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {   //main method
        Prg11_DivBy_ThreeFive.div();            //Call static method via Program name.
    }
}
