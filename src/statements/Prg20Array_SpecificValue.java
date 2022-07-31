package statements;

//Write a Java program to test if an array contains a specific value


public class Prg20Array_SpecificValue {

    static void getValue() {                //Create static method

        int[] array = {10, 20, 30, 40, 50};     //Declare Varaible using array
        int num = 50;
        for (int i = 0; i < array.length; i++) {        //for loop
            if (num == array[i]) {
                System.out.println(num + " Value of Array contains the given element");      //Output print statement
            }
        }
    }
    public static void main(String[] args) {       //Main method

        Prg20Array_SpecificValue.getValue();        //Call static method via Program name.

    }
}
