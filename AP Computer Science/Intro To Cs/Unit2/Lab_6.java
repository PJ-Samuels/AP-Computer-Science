/**
 * PJ Samuels
 * The program generates two random numbers 1-6, adds them up, if it equals 2,3,12,11, or 7 the user wins, anything else, and the user must try again
 * Extended Challenge: Make the program repeat itself until the user losses or wins
 */
package Unit2;

import java.util.*;

public class Lab_6
{ 
    public static void main()
    {
        System.out.println("The program will generate two dice");
        int dice1 = (int)(Math.random()*6+1);
        int dice2 = (int)(Math.random()*6+1);
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);
        int x = (int)(dice1 + dice2);
        boolean wrong = false;
        
       while(!wrong)
       {
        boolean y = (x==7)||(x==11);
        boolean z = (x==2)||(x==3)||(x==12);
        
       
       if (y)//when the player wins
        {
            System.out.println("The total is " + x);
            System.out.println("Congratulations, You Win.");
            wrong = true;
        }
        else if (z)//when the player losses
        {
            System.out.println("The total is " + x);
            System.out.println("Sorry, You Lose.");
            wrong = true;
        }
        else //When the results is neither win or loss
        {
            System.out.println("Please try again: ");
            dice1 = (int)(Math.random()*6+1);
            dice2 = (int)(Math.random()*6+1);
             x = (int)(dice1+dice2);
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
            System.out.println("The total is " + x);
            
        }
        }
    }
}