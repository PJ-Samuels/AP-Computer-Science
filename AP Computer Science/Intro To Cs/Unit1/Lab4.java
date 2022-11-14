/**
 * PJ Samuels
 * The user inputs a two numerators and denominators of fractions, in order to calculate the addition, subtraction, multiplication, and division results.
 * Extended challenge: The program takes the numerator and the denominator of the first fraction and ^ by the numerator of the second fraction
 */
package Unit1;

import java.util.*;

public class Lab4
{
    public static void main()
    {
        Scanner kin = new Scanner(System.in);
        System.out.print("Please input a number for the first fractions numerator:");
        double firstNum = kin.nextDouble();//firstNum = first numerator
        System.out.print("Please input a number for the first fractions denominator:");
        double firstDen = kin.nextDouble();//firstDen = first denominator
        System.out.print("Please input a number for the second fractions numerator:");
        double secondNum = kin.nextDouble();//secondNum = second numerator
        System.out.print("Please input a number for the second fractions denominator:");
        double secondDen = kin.nextDouble();// secondDen = second denominator
        
        System.out.println("Addition result is (" + (firstNum*secondDen + secondNum*firstDen)+"/" + (firstDen*secondDen)+ ")");
        System.out.println("Subtraction result is (" + (firstNum*secondDen - secondNum*firstDen) + "/" + (firstDen*secondDen) + ")");
        System.out.println("Multiplication result is(" + (firstNum*secondNum)+ "/" + (firstDen*secondDen)+")");
        System.out.println("Division result is ("+ firstNum*secondDen +"/" + firstDen*secondNum + ")" );
        
        //Extended Challenge:
        double num1 = firstNum, num2= firstDen;
        for (int x = 1; x < secondNum ;x++)
        {
            num1 *= firstNum;
            num2 *= firstDen;
        }
        System.out.println("The fraction raised to the power of the second fractions numerator is "+ num1 + "/" + num2 + "."); 
        
    }
}
