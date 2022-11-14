/**
 * PJ Samuels
 * Part A: The user inputs a value for X and Y and values for both variables are switched.
 * Part B: The user inputs a value for a, b, and c of a quadratic equation, the program then finds the roots of the equation by using the quadratic formula/equation.
 * Extra Credit: The program generates two random numbers and tells the user if they are =,<, or > to each others
 */
package Unit1;

import java.util.*;

public class Lab5_A
{
    public static void main()
    {
        // Part A
        Scanner kin = new Scanner(System.in);
        
        System.out.print("Please input a value for X:");
        double X = kin.nextDouble();
        
        System.out.print("Please input a value for Y:");
        double Y = kin.nextDouble();
        
        X = X+Y;
        Y = X-Y;
        X = X-Y;
        System.out.println("The new value of X is "+X);
        System.out.println("The new value of Y is "+Y);
        
        //Part B
        
        System.out.print("Please input a value for a:");
        double a = kin.nextDouble();
        System.out.print("Please input a value for b:");
        double b = kin.nextDouble();
        System.out.print("Please input a value for c:");
        double c = kin.nextDouble();
        
        
        //Note: quadratic equation = (-b +/- route(b^2 - 4ac))/2
        
        double plus = ((-b + Math.sqrt(Math.pow(b,2.0) - (4.0*a*c)))/(2*a));
        //plus signifies the part of the equation that is plus instead of minus
        double minus = ((-b - Math.sqrt(Math.pow(b,2.0) - (4.0*a*c)))/(2*a));
        // minus signifies the part of the equation that is minus instead of plus
        
        System.out.println("The first solution is " + plus + ".");
        System.out.println("The second solution is " + minus + ".");
       
        //Extended Challenge
        
        double k = (int)(Math.random()*10+1);
        double z = (int)(Math.random()*10+1);
        System.out.println("The program will print out two random numbers.");
        System.out.println("The first random number is " + k);
        System.out.println("The second random number is " + z);
        if (z<k){
            System.out.println(z + " is less than " +k + ".");
        }
        if (z>k){
            System.out.println(z + " is more than " + k +".");
        }
        if (z==k){
            System.out.println(z + " is equal to " + k + ".");
        }
    }
}


