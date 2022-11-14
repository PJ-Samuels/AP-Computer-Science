package Unit2;
import java.util.*;
/**
 * PJ Samuels
 */
public class LoopOperations
{
    // This method will return the sum of all integers from 0 to x using a for loop
    // x can be negative, so return the values properly
    /**
     * forLooper
     * This method,Using a for loop, will take every number coming before the input(and including the input) and adds them togethor to find the sum
     * @return      int     this is the sum of all the collective numbers coming before the input
     */
    public static int forLooper( int x )
    {
        int sum = 0;
        //determines if the number is poistive or negative
        if( x > 0 )
        {
            //adds all prior values and input togethor
            for(int i = 0; i <= x; i+= 1)
            {
                sum = sum + i;
            }
        }
        else if( x < 0 )
        {
            //adds all prior values and input togethor to find the sum
            for(int i = 0; i >= x; i-= 1)
            {
                sum = sum+ i;
            }
        }
        return sum;
    }
 
    // This method will return the sum of all integers from 0 to x using a while loop
    // x can be negative, so return the values properly
    /**
     * whileLooper
     * This method, using a while loop, will find the sum of all numbers preceeding and including the input
     * @return      int     this is the sum of all the numbers preceding(and including)the input
     */
    public static int whileLooper( int x )
    {
        int i = 0;
        int sum = 0;
        //determines if the input/number is postive or negative
        if( x > 0 )
        {
            //finds the sum of all the prior values 
            while( i <= x )
            {
                sum = sum + i;
                i++;
            }
        }
        else if( x<0)
        {
            //finds the sum of all prior values
            while( i >= x )
            {
                sum = sum + i;
                i--;
            }
        }
        return sum;
    }
 
    // This method will return the sum of all integers from 0 to x using a do while loop
    // x can be negative, so return the values properly
    /**
     * doWhileLooper
     * This method,using a do while loop, will find the sum of all the numbers preceeding and including the input
     * @return      int     this will return the sum of all the numbers <= the input
     */
    public static int doWhileLooper( int x )
    {
        int i = 0;
        int sum = 0;
        //determines if the value is positive or negative
        if(x > 0)
        {
            //finds the sum of all numbers <= the input
            do
            {
                sum = sum + i;
                i++;
            }
            while(i <= x);
        }
        else if(x < 0)
        {
            // finds the summ all numbers <= the input
            do
            {
                sum = sum + i;
                i--;
            }
            while(i >= x);
        }
        return sum;
    }
 
    // This method will return xy
    // x & y can be negative or zero, so return the values properly
    // Which loop structure you use is up to you, for, while, do while
    /**
     * power
     * this Method will find x to the power y of without using any Math functions
     * @return      double      this will return the double of x to the power of y is 
     */
    public static double power( int x , int y )
    {
        double value = 1;
        int arr[] = new int[Math.abs(y)];
        // finds out if y is positive or negative
        if( y > 0)
        {
            // Both for loops put the same values into array that is y's lengths than multiples the value by the array as many times as needed
            for( int i = 0; i < y; i++)
            {
                arr[i] = x;
                
            
            }
            for(int i = 0; i< y; i++)
            {
                value = value * (double)arr[i];
            }
        }
        else if(y < 0)
        {
            y = Math.abs(y);
            // Both for loops put the same values into array that is y's lengths than divides the value by the array as many times as needed
            for( int i = 0; i < y; i++)
            {
                arr[i] = x;
                
            
            }
            for(int i = 0; i < y; i++)
            {
                value = value * (double)arr[i];
            }
            value = 1/value;
        }
        else if(y == 0)
        {
            value = 1;
        }
        return value;
    }
    
    // precondition: x is a positive whole number
    // This method will determine if x is a self divisor
    // 123 is not a self divisor.  Divisible by 1 and 3, but not 2
    // 4180 will return false because you can’t divide by 0
    // 124 is a self divisor.  Divisible by 1, 2 and 4
    // you may use any loop technique you want. 
    // Hint:   %10  & /10 are your friends
    /**
     * selfdivisor
     * the method will find out if all the digit of a given number/input are able to divid into the number/inout
     * @return      boolean     this will return whether the number is a selfdivisor
     */
    public static boolean selfDivisor( int x )
    {
        boolean result = true;
        int xOriginalVal = x;
        int value;
        //if the input % its first digit you know it isnt a self divisor else it will use the other lines of code 
        if(x%10 == 0)
        {
            result = false;
        }
        else 
        {
            //as long as the value doesn't = 0 it will contiue running and finding all the digits
            while (x > 0) 
            {
                value =  x % 10;
                //if the remainder is zero it will store a true result to the result variable
                if(xOriginalVal%value == 0)
                {
                    result = true;
                }
                else
                {
                    result = false;
                    break;
                }
                // if the value variable is ever 0 it will return a false
                if(value == 0)
                {
                    result = false;
                    break;
                }
                x = x / 10;                
            }
        }
        return result;
    }
}
