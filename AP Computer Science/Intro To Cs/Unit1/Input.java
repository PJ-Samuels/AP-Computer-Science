package Unit1;

import java.util.*;
/**
 * This inport brings in everything from the utility library
 * including the Scanner class
 */

public class Input
{
    public static void main()
    {
        //contructs a scanner object called kin
        //kin is a variable that will alllow us to get input from the user
        
        // int a = kin.nextInt(); - causes issues if we do this without doing a print first
        Scanner kin = new Scanner(System.in);
        
        //lets make our program user friendly
        System.out.print("Please enter in a whole number: ");
        int x;
        //this will take from the user and store the result in x
        x = kin.nextInt();
        
        //lets printout to demonstrate it worked
        System.out.println("x =" + x);
        
        
        System.out.print("Please input a number:");
        double y;
        y = kin.nextDouble();
        System.out.println ("y = " + y);
        
        
        
        
        
        
        
        
    }
}
