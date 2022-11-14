package Unit2;

import java.util.*;

public class SwitchNotes
{
    public static void main()
    {
        /**
         * a switch allows us to conditionally go into multiple different paths at the same time
         * 
         * if allowws two paths true and false
         * 
         * a switch can only work on ints, chars, Strings
         * 
         * each branch is created using a case
         */
        int die= (int)(Math.random()*6+1);//random 6-1
        /**
         * 6 = win
         * 4-5 = tie
         * 1-3 = lose
         */
        System.out.println("Die =" + die); 
        switch(die)
        {
            case 6:// note thats a colon,not a semi conol
                System.out.println("You win");
                break;
            case 5:
            case 4:
                System.out.println("You tie");
                break;
            default://handles everything else not handled by the cases
                System.out.println("You lose");
                break;
        }
        
        if (die==6)
        {
            System.out.println("You win");
           
        }
        else if(die==5||die==4)
        {
            System.out.println("You tie");
        }
        else
        {
            System.out.println("You lose");
        }
        /**
         * No reason the deafualt has o be last it can be anywhere
         * 
         * we don't have to break after each case ends
         * 
         */
        switch(die)
        {
            default:
                System.out.println("you lose");
                break;
            case 6: 
                System.out.println("You win");
                break;
            case 5:
                System.out.println("You almost won but");
            case 4:
                System.out.println("You tied");
            
        }
        if(die==6)
        {
            System.out.println("You win");
            
        }
        else if(die==5||die==4)
        {
            if(die==5)
            {System.out.println("You almost won but");
            }
            System.out.println("you tie");
        }
        else
        {
            System.out.println("You lose");
        }
        
        /**
         * Craps
         * 2 dice
         * 7 or 11 = win
         * 2,3 or 7 = lose 
         * all others = tie
         */
        int die1 = (int)(Math.random()*6+1);
        int die2 = (int)(Math.random()*6+1);
        int result= die1+die2;
        switch(result)
        {
            case 11:
            case 7:
                System.out.println("you win");
                break;
            case 2:
            case 3:
            case 12:
                System.out.println("you lose");
                break;
            default:
                System.out.println("you tie");
                break;
            
        }
    }
}
