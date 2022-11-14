package Unit2;
import java.util.*;
public class RecursionOperations
{  
    /**
     * factorial 
     * this method takes the all procceeding numbers before the input and multiplies them togethor
     * @return      int     sum of the all numbers before and including the input multiplied by eachother
     */
    public static int factorial( int n )
    {
        if(n == 0)
        {
            return 1;
        }
        else 
        {
            if(n > 0)
                return n*factorial(n-1);
            else 
                return n*factorial(n+1);
        }        
    }
    /**
     * ab_plus_c
     * the method will recursivly multiply a*b and then add c when the recursion is concluded
     * @return      int     the sum of a*b+c
     */
    public static int ab_plus_c( int a , int b , int c  )
    {
        int sum = 0;   
        if( b == 1 )
        {
            return sum = a+c;
        }
        else
        {   
            return sum = a + ab_plus_c(a,b-1,c);   
        }
    }  
    /**
     * recursiveLoopPositive
     * this method will add all the numbers leading up to the input, postive or negative(ex. 4 = 1+2+3+4)
     * @return      int         returns the interger value of the sum of all numbers leading up the input
     */
    public static int recursiveLooperPositive( int x )
    {
        if(x == 0)
        {
            return 0;
        }
        else 
        {
            if(x > 0)
                return x+recursiveLooperPositive(x-1);
            else 
                return x+recursiveLooperPositive(x+1);
        }
    }
    /**
     * recursivePower
     * this method will recursively find the result of the problem x^y
     * @return      double      returns the int result of x^y
     */
    public static double recursivePower( int x , int y )
    { 
        if(y == 0)
            return 1;
        else  
            return  x * recursivePower(x,y-1);
    }  
    /**
     * recursiceStringtoInt
     * the method will turn a string of numbers into an int 
     * @return      int     the interger value of the number within the string
     */
    public static int recursiveStringtoInt( String str )
    {       
        if( str.length() == 0)
            return 0;
        else
            return (int)recursivePower(10,str.length()-1)*Integer.valueOf(str.substring(0,1)) + recursiveStringtoInt(str.substring(1,str.length())); 
        
    }
    /**
     * printOperationsN
     * this method will find out if the number is even or odd and if even it will divide by 2 and add 1 until it reaches zero or multiply by 3 if it is odd    
     *      and then it will determine if it is odd or even again while printing out the result with a space
     * @return      String      the a String of spaces and numbers showing the results of muiltplying by 3 or dividing
     */
    public static String printOperationsN( int n  )
    {
        String s1;
        if(n == 1)
            return " 1";
        else
        {
            if(n%2==0)
            {
                return s1 = n+" "+printOperationsN(n/2);
            }
            else 
            {
                return s1 =n+" "+printOperationsN(3*n+1); 
            }
        }
    } 
}
