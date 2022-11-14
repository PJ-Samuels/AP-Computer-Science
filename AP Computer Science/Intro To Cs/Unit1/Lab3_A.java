/**
 * PJ Samuels
 * The user inputs The values points on a graph into X1,X2,Y1 and Y2 to get the midpoint and distance of the graph
 * Extra credit: Display the slope intercept to the user aswell
 */
package Unit1;

import java.util.*;

public class Lab3_A
{
    public static void main ()
    {
        System.out.println("The _ represents the data you will enter, or will be the answer.");
        Scanner kin = new Scanner(System.in);
        
        System.out.print("Please input a value for X1:");
        double X1 = kin.nextDouble();
        
        System.out.print("Please input a value for X2:");
        double X2 = kin.nextDouble();
        
        System.out.print("Please input a value for Y1:");
        double Y1 = kin.nextDouble();
        
        System.out.print("Please input a value for Y2:");
        double Y2 = kin.nextDouble();
        
        double X = (X1 + X2)/2.0;
        double Y = (Y1 + Y2)/2.0;
        System.out.println("Midpoint is (" + X + "," + Y + ")");
        double distance = Math.sqrt(Math.pow(X2-X1,2.0) + Math.pow(Y2-Y1,2.0));
        System.out.println("Distance is " + distance);
        double m = (Y2-Y1)/(X2-X1);
        double b = Y1 - m*X1;
        System.out.print("The slope intercept form is y = " + (Y2-Y1)+"/" + (X2-X1) + "x + " + b );
    }
}

