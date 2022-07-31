package statements;
/* Number of Days In Month
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
otherwise return false.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
Example of input/Output:
● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
● isLeapYear(1600); should return true since 1600 is a leap year
● isLeapYear(2017); should return false since 2017 is not a leap year
● isLeapYear(2000);should return true because 2000 is a leap year
Write another method getDaysInMonth with two parameter month and year. Both of type
int.
If parameter month is < 1 or >12 return -1.
If parameter year is <1 or >9999 than return -1.
This method needs to return the number of days in the month. Be careful about leap years
they have 29 days in month 2 (February).
You should check if the year is a leap year using the method isLeapYear describe above.Example of input/Output:
● getDaysInMonth(1, 2020); should return 31 since January has 31 days.
● getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap
 year.
● getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and
 2018 is not a leap year.
● getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
● getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to
 9999
HINT: Use the switch statement.
NOTE: Methods isLeapYear and getDaysInMonth need to be public static          */

public class Prg4_Leapyear {

    public static boolean isLeapYear(int year) {   //Create method with a parameter
        boolean isLeap = false;
        if(year >= 1 && year <= 9999 && year % 4 == 0){       //Leap year formula using if else statement
            if( year % 100 == 0){
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }else
                isLeap = true;
        }else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");          //output print statement
        else
            System.out.println(year + " is not a Leap Year.");      //output print statement
        return isLeap;
    }
    public static int getDaysInMonth(int month, int year) {         //Create static method with two parameter
        if (month < 1 || month > 12) {
            return -1;
        } else if (year < 1 || year > 9999) {
            return -1;
        } else {
            switch (month) {                                        //finding days of month using switch statement
                case 1:
                    System.out.println("January has 31 days.");
                    break;
                case 3:
                    System.out.println("March has 31 days.");
                    break;
                case 5:
                    System.out.println("May has 31 days.");
                    break;
                case 7:
                    System.out.println("July has 31 days.");
                    break;
                case 8:
                    System.out.println("August has 31 days.");
                    break;
                case 10:
                    System.out.println("October has 31 days.");
                    break;
                case 12:
                    System.out.println("December has 31 days.");
                    break;

                case 2: {
                    if (isLeapYear(year)) {
                        System.out.println("February has 29 days " + year + " is a Leap Year");
                        return 29;
                    } else {
                        System.out.println("February has 28 days " + year + " is not a Leap Year");
                        return 28;
                    }
                }

                case 4:
                    System.out.println("April has 30 days.");
                    break;
                    case 6:
                        System.out.println("June has 30 days.");
                        break;
                case 9:
                    System.out.println("September has 30 days.");
                    break;
                case 11:
                    System.out.println("November has 30 days.");
                    break;

                default:
                    System.out.println("The parameter month is invalid");
                    return -1;
            }
        }
        return month;
    }
    public static void main(String[] args) {        //Main method
        Prg4_Leapyear.isLeapYear(-1600);            //Call static method via Class name
        Prg4_Leapyear.getDaysInMonth(2,2300);   //Call static method via Class name
    }
}
