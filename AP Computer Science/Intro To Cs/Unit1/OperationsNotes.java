package Unit1;

import java.util.*;

public class OperationsNotes
{
    public static void main()
    {
    
     /**
     * modulo - %
     * 
     * x%y gives us the remainder of x/y
     * x%y if x is less than y result is x because y goes into x zero times
     * 
     * order of operations:
     * % same time as * / left to right
     * 
     * compound assignments
     *  -an assignment with an operation
     *   +=    -=
     *   *=    /=
     *   %=
     * 
     */    
     int x = 5;
     int y = 10;
     
     x = x + y; //take the current of x& y, assign to x
     System.out.println (x) ;
     
     x = x * (y-5); //15*(10-5) = 75
     
     System.out.println(x);
     
     x *= y-5; // x = x*(y-5);
     
     System.out.println (x);
     
     y-= y + 3 * x % (x+7);
     // y= y - (y+3*x%(x+7))
     
     x = 10;
     x = x + 1;
     x += 1; // x = x + (1);
     //I can use a pre and post incriments to achieve the *same* results
     x = 10;
     x++; //post
     System.out.println ( x );
     ++x; //pre
     System.out.println ( x );
     
     
     
     x= 10;
     System.out.println (x++); //doesnt incriment until x is input again
     System.out.println(x);
     x=10;
     System.out.println (++x); // incriments before input
     System.out.println(x);
     
     
     x=10;
     y=x++ + x++ + ++x;
     System.out.println (y);
     System.out.println (x);
     
    }
}
