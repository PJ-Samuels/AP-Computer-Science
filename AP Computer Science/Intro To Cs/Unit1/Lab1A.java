/**
 * PJ Samuels
 * Allow the user to convert a number to degrees in Fahrenheit and Celsius and show both the results for that number
 * Extra Credit: if the user inputs a number and its conversion is the lower than the freezing point in Fahrenheit or Celsius,
 or higher than the boiling point in Fahrenheit, it will be shown to the user.
 */
package Unit1;

import java.util.*;

public class Lab1A
{
    public static void main()
    {
        Scanner kin = new Scanner(System.in);
        System.out.print("Please input a number:");
        double Inumber = kin.nextDouble();
       //Inumber = (I)input number 
       // could also give farenheit and celsius variables and then input
        System.out.println(Inumber + " degrees Fahrenheit converts to " + (9.0/5.0*(Inumber))+32);
        System.out.println(Inumber + " degrees Celsius converts to " + (5.0/9.0 *((Inumber)-32)));
        if (Inumber > 212)
            System.out.println("It is greater than the boiling point of water in Fahrenheit");
        if (Inumber < 32 )
            System.out.println("It is less than the freezing point of water in Fahrenheit");
        if (Inumber > 100)
            System.out.println("It is greater than the boiling of water in Celsius");
        if (Inumber < 0)
            System.out.println("It is less than the freezing point of water in Celsius");
               
        //Fahrenheit = 9/5 *x + 32
        //Celsius = 5/9*(x-32)
        // degrees F converts to _ degrees Celsius
        // degrees C converts to _ degrees Fahrenheit
    }
}
