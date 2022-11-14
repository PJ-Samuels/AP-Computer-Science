package Unit2;
import java.util.*;
public class TailRecursionOperationsLab
{
     /**
     * factorial 
     * this method takes the all procceeding numbers before the input and multiplies them togethor
     * @return      int     sum of the all numbers before and including the input multiplied by eachother
     */
    public static int factorial( int n , int ans)//ans must equal 1
    {
        if(n == 1)
            return ans*n;
        else
            return factorial(n-1, ans*n);
    }
     /**
     * ab_plus_c
     * the method will recursivly multiply a*b and then add c when the recursion is concluded
     * @return      int     the sum of a*b+c
     */
    public static int ab_plus_c( int a , int b , int c  , int ans)// ans must equal 0
    {
        if(b == 1)
            return ans+a+c;
        else
            return ab_plus_c(a , b-1, c, ans+a);
    }    
    /**
     * recursiveLooperPositive
     * this method will add all the numbers leading up to the input, postive or negative(ex. 4 = 1+2+3+4)
     * @return      int         returns the interger value of the sum of all numbers leading up the input
     */
    public static int recursiveLooperPositive( int x , int ant) //ant must equal 
    {
        if(x == 0)
            return ant+x;
        else
            return recursiveLooperPositive(x-1,ant+x);
    }  
    /**
     * recursivePower
     * this method will recursively find the result of the problem x^y
     * @return      double      returns the int result of x^y
     */
    public static double recursivePower( int x , int y , double ans )//ans must equal 0
    {
        if(y == 1)
            return ans*x;
        else    
            return recursivePower(x, y-1, ans*x);
    }
    /**
     * recursiceStringtoInt
     * the method will turn a string of numbers into an int 
     * @return      int     the interger value of the number within the string
     */
    public static int recursiveStringtoInt( String str , int ans)// ans must be 0
    {
        if( str.length() == 0)
            return ans+0;
        else
            return recursiveStringtoInt(str.substring(1,str.length()), ans+(int)Math.pow(10,str.length()-1) *Integer.valueOf(str.substring(0,1)));
    }
    /**
     * printOperationsN
     * this method will find out if the number is even or odd and if even it will divide by 2 and add 1 until it reaches zero or multiply by 3 if it is odd    
     *      and then it will determine if it is odd or even again while printing out the result with a space
     * @return      String      the a String of spaces and numbers showing the results of muiltplying by 3 or dividing
     */
     public static String printOperationsN( int n  , String ans)// ans must be 0
    {
        if(n == 1)
            return ans + " 1";
        else
        {
            if(n%2==0)
            {
                return printOperationsN(n/2,ans+" "+n);
            }
            else 
            {
                return printOperationsN(3*n+1,ans+" "+n ); 
            }
        }
    }
 }
