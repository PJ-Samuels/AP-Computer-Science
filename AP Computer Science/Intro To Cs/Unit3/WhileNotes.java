package Unit3;

import java.util.*;

public class WhileNotes
{
    public static void main()
    {
        /**
         * While condition is true, code will keep running 
         * While (condition)
         * {
         *     code;
         * }
         */
        int x = 0;
        // this will stop once x == 1
        // this will generate random numbers and print out
        
        while (x != 1)
        {
            x = (int)(Math.random()*6+1);//random 1-6
            System.out.println("x = " + x);
        }
        /**
         * So in a for loop we are summing some code x number of times
         * If I want to run something an unknown amount of times,
         *       a while starts to make sense
         * A while loop might run 100 times might run 0 times
         *       Runs however many times it needs to run 
         */
         System.out.println("Run second Loop");
         x = (int)(Math.random()*6+1);//random 1 - 6
        while (x != 1)
        {
            System.out.println("x = " + x);
            x = (int)(Math.random()*6+1);//random 1 - 6
        }
        
        
        
        x = 10;
        int i = 0 ;
        while( x >= i)
        {
            System.out.println(x + " " + i);
            x-=2;
            i++;
        }
        
        /**
         * do
         * {
         *     code;
         * }
         * while( condition );
         */
        do
        {
            x = (int)(Math.random()*6+1);//random 1-6 
            System.out.println("x = " + x);
        }
        while(x!=1);
        
        
        Scanner kin = new Scanner(System.in);
        //loop runs until user enters in a positive number 
        do
        {
            System.out.print("Please enter in a positive number:");
            x = kin.nextInt();
            if (x<=0)
                System.out.println("Error, number must be positive");
        }
        while(x<=0);
        
        /**
         * break - causes your program to leave the loop/switch
         *      if in a nested loop leaves the inside, not the outside loop
         * continue - causes your program to immediatly go back to the top of the loop to check the next iteration
         *      of the inside loop and runs through he program again
         *      
         * 
         */
        //while(condition)
       // {
         //   code;
           // code;
            //if(condition2)
            //{
              //  continue;
            //}
            //code;
            //code;
            
        //}
    }
}
