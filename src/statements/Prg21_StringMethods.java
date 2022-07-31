package statements;

public class Prg21_StringMethods {

    //Main method
    public static void main(String[] args) {

        String name = "Java is a High-level Language.";
        String name1 = "Java is secure.";

        System.out.println("Length of String is : " +name.length());        //find length of the String
        System.out.println("Index value of : " +name.charAt(3));            //return char at given index number
        System.out.println("Concating String : " +name.concat(name1));      //combines specified string
        System.out.println("String contains : " +name1.contains("v"));      //return true if chars are found
        System.out.println("String Starts with : " +name.startsWith("Ja")); //checks if this string starts with given prefix
        System.out.println("String Ends with : " +name.endsWith("Lan"));  //checks if this string ends with given suffix
        System.out.println("Both String are equal : " +name.equals(name1));//compare two given Strings
        System.out.println("Index of given Character is : " +name1.indexOf("c"));//return index of given character value
        System.out.println("Is this String empty = "+name1.isEmpty()); //check if this string is empty
        System.out.println("String replacing with old character to new character : " +name1.replace('s','d'));// returns a string replacing all the old char to new char
        System.out.println("substring is :" +name.substring(4)); //returns a part of the string
        System.out.println("String into character array is : " +name1.toCharArray());// converts this string into character array
        System.out.println("String into Lower case is : " +name1.toLowerCase()); //returns the string in lowercase letter
        System.out.println("String into Upper case is : " +name.toUpperCase());//returns the string in uppercase letter
        System.out.println("string triming : " +name1.trim()+ "simple"); //eliminates leading and trailing spaces


    }
}
