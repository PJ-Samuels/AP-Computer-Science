package Unit2;

import java.util.*;

public class IfNotesContinued
{
    public static void main()
    {
        /**
         * We can create what are called nested if statements
         * Its an if statement inside of another if statement
         * 
         * if( condition 1 )
         * {
         *     code;
         *     if( condition 2 ) 
         *     {
         *         code;
         *     }
         *     code;
         * }
         */
        
        int x = (int)(Math.random()*10 + 1 ) ;
        System.out.println("x = " + x );
        if( x > 5 ) 
        {
            System.out.println("x > 5");
            if( x > 8 ) 
                System.out.println("x > 8");
            x -= 2;
            
        }
        else
            x += 3;
        System.out.println("x = " + x );
        
        
        int a = (int)(Math.random()*10 + 1 ) ;
        if( a > 5 ) 
        {
            int b = 10;
            // scope - where a variable exists
            // here since b is declared inside these { }  
            //    it only exists there
            
        }
        // thus this line gives us an error
        // this is outside of the scope of b
        
        int b = 5;
        System.out.println("b =  " + b ) ;
        
        
        /**
         * We can string together a series of if/else statements
         * 
         * if( condition 1 ) 
         *      code;
         * else if( condition 2 ) 
         *      code;
         * else if( condition 3 ) 
         *      code;
         * else
         *      code;
         */
        
        x = (int)(Math.random()*4 + 1 ) ;
        System.out.println("x = " + x ) ;
        if( x == 1 ) 
            System.out.println("You win");
        else if( x == 2 ) 
            System.out.println("You won the consolation prize");
        else if( x == 3 ) 
            System.out.println("You lost");
        else
            System.out.println("Play again?");
        
        if( x == 1 ) 
            System.out.println("You win");
        else 
        {
            // code
            // code
            if( x == 2 ) 
                System.out.println("You won the consolation prize");
            else 
            {
                // code
                // code
                if( x == 3 ) 
                    System.out.println("You lost");
                else
                    System.out.println("Play again?");
            }
        }
                
        
        
 
        
    }
}

