package Unit1;

import java.util.*;

public class StringNotes
{
    public static void main()
    {
        
        /**
         * String is a class we create String objects
         * 
         * Strings can hold multiple letters at the same time
         * 
         * char - primitive data type- could only hold a single character
         * 
         * char c = 'h';
         * 
         * String s = "Hello world";
         * 
         */
        String s = "Hello World";
        System.out.println("s = " + s);
        //if we wanted to do input from the use 
        //int = kin.nextInt();
        //double = kin.nextDouble();
        //String = kin.nextLine();
        System.out.print("Please enter in the class name: ");
        Scanner kin = new Scanner (System.in);
        String className = kin.nextLine();
        
        System.out.println("the class is: "+ className);        
        
    }
}
