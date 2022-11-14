package Unit2;

import java.util.Scanner;

public class LoopNotes
{
    public static void main()
    {
        /**
         * 
         *  for( start ; stop ; step ) - the stop is just a condition
         *  
         *  for( int i = 0 ; i < 10 ; i++ )
         *  
         *  run one line of code like an if statement unless you have braces
         *  
         * 
         *  
         *  If you want a series of number to go up
         *      start < stop
         *      stop <  or <=   number
         *      step has to positive
         *  
         *  for( int i = 10 ; i <  100 ; i += 3 ) 
         *  
         *  
         *  If you want a series of numbers to go down
         *      start > stop
         *      stop > or >=  number
         *      step has to be negative
         *      
         *  for( int i = 10 ; i >= 0 ; i-=2 )    
         *  
         *  
         *  
         *  
         *  
         *  Also remember that the stop is just a condition and 
         *    doesn't have to be tied to the start / step values
         *  
         *  for( int i = 0 ; x < 20 ; i += 2 )
         *  
         *  
         *  
         *  while and do while loops are just a conditon
         *  
         *  while( condition )  - might not run
         *  {
         *      
         *  }
         *  
         *  
         *  do          - always runs at least once
         *  {
         *      
         *  }
         *  while( condition ) ;
         *         
         *  
         *  to leave a loop structure early requires a - break
         *  
         *  to cause the loop structure to go to the next step (for) 
         *    or check condition and possibily start the loop again
         *     - continue
         *     
         */    
        
        // for( start ; stop ; step ) 
        // we want to add up 1-100
        int total = 0;
        // start at 1, end when i is no longer <= 100
        // increase by 1 each step
        for( int i = 1 ; i <= 100 ; i++ ) 
        {
            total += i;   // total is inceased by i each step
                          // total = 1 + 2 + 3 + .... + 99 + 100
        }
        System.out.println("Total = " + total );
        
        total = 0;
        // 50 - 250
        // to go up by two, we change the step
        for( int i = 51 ; i <= 250 ; i+=2 ) 
        {
            total += i;   
        }
        System.out.println("Total = " + total );
        
        
        
        
        //Nested Loops
        for( int i = 1 ; i <= 10 ; i++ )
        {
            System.out.println("i = " + i );
            // now when making for loops, the typical letter is i
            // nested then follow a standard pattern of j, k , l, ....
            for( int j = 1 ; j <= i ; j++ )
            {
                System.out.print("j = " + j );
            }
            System.out.println();
        }
        
        
        
        int x = 0;
        
        // this will stop once x == 1
        // This will generate random numbers and print out
        while( x != 1 ) 
        {
            x = (int)(Math.random()*6 +1 ) ;   // random 1 - 6
            System.out.println("x = " + x ) ;
        }
        
        
        
        Scanner kin = new Scanner(System.in);
        
        // loop runs until user enters in a positive number
        do
        {
            System.out.print("Please enter in a positive number:");
            x = kin.nextInt();
            if( x <= 0 ) 
                System.out.println("Entry must be positive");
        }
        while( x <= 0 );
        
        
        /**
         *  break - causes your program to leave the loop/switch
         *          if in a nexsted loop, leaves the inside, 
         *              not the outside loop
         *              
         *  continue - causes your program to immediately go back 
         *              to the top of the loop to check the next
         *              iteration
         *             if in a nested loop, goes to the next iteration
         *              of the inside loop, not the outside loop
         *  
         */
        
        /**
        while( condition )
        {
            code;
            code;
            if( condition2 )
            {
                continue;    // or maybe break
            }
            code;
            code;
        }
        */
    }
}
