package Unit2;
import java.util.*;
import Unit1.*;
public class RecursionNotes
{
    public static void main()
    {
        int x = (int)(Math.random()*20 + 1 ) ;  // 1-20
        int sum = 0;
        System.out.println("x = " + x );
        for( int i = 1 ; i <= x ; i++ )
            sum += i;
        System.out.println("sum = " + sum );
        
        System.out.println("recursive sum = " + recursiveSum( x ) );
        
        
        
        
        
        
        
        
        
    }
    
    
    public static int recursiveSum( int x )
    {
        /**
         * The base case prevents the recursive method from being infinite
         *  - this is where the method will be able to stop
         *  - could be a simple return
         *  - or even doesn't do anything when its reached
         *  
         * When we call the recursive method, we need to modify the value
         *  we are sending it
         */
        if( x <= 1 )
            return x;
        else
            return x + recursiveSum( x - 1 );
    }
    
    /**
     * What is returned by recursiveSum( 1 ) ?  --> 1
     * 
     * recursiveSum( 2 )?  --> 3
     * 
     * recursiveSum( 3 )?  --> 6
     * 
     *  return 3 + rs(2) 
     *              returns 2 + rs(1)
     *                          returns 1
     * 
     */
    
    /** 
     * This method will only multiple odd numbers 1 - x
     * if x is even, it will make it the odd number x-1
     */
    public static int multiplyOdds( int x ) 
    {
        if( x % 2 == 0 ) 
            x--;
        if( x <= 1 ) 
            return 1;
        else
            return x * multiplyOdds( x - 2 ) ;        
    }
    
    
    /**
     * fib
     * This recursive method will find the x number in the fibinnaci sequence
     * @param   x   This is an int, and it is used to find the xth fibinnaci number
     * @return  Will return an int, that is the sum of all the numbers in the 
     *          fibinnaci sequence
     */
    public static int fib( int x ) 
    {
        // base case, will stop when x <= 1 
        // else: will return fib( x-1 ) + fib( x-2)
        //   This means that the return will happen after the method that was called, 
        //   returns its value.
        if(x <= 1) 
            return x;
        else 
            return fib(x - 1) + fib(x - 2);
    }
    /**
     * fib(5) --> f(4) + f(3)   ---> 3 + 2 = 5
     * fib(4) --> f(3) + f(2)   ---> 2 + 1 = 3
     * fib(3) --> f(2) + f(1)   ---> 1 + 1 = 2
     * fib(2) --> f(1) + f(0)   ---> 1 + 0 = 1
     * fib(1) --> 1
     */
    
    /**
     * sumFactorsTo
     * This recursive method will find the sum of all the factors of num
     * @param   num   This is an int, and it is looking for its factors
     * @param   max   This is an int, and it is a number smaller than num
     * @return  Will return an int, that is the sum of all the factors of num
     */
    public static int sumFactorsTo(int num, int max) 
    {
        int sub;
        if(max == 0)
            return 0;
        else 
        {
            sub = sumFactorsTo(num, max - 1);
            if(num % max == 0) 
                sub += max;
        }
        return sub;
    }  
    /**
     * Let us create a simplify method for a fraction object 
     * preconditition: factor is equal to num
     * precondition: num and den are not equal to 0
     */
    public static Fraction simplify (int num, int den , int factor)
    {
        if(factor == 1)
        {
            return new Fraction( num ,den);
        }
        if( num%factor == 0 && den%factor == 0 )
        {
            return new Fraction(num/factor,den/factor);
        }
        else
            return simplify(num, den, factor - 1);
        
    }
    
    /** 
     * for( int i = 0 ; i < s1.length() ; i++ )
        {
            String f = s1.substring( 0 , i ) ;      // 0 - i-1
            String m = s1.substring( i , i + 1 ) ;  // i - i
            String b = s1.substring( i + 1 );       // i+1 - end
            System.out.println( f + " " + m + " " + b );
        }
        
        Lets reimplement this as a recursive method
     */    
    public static void printString( String s1 , int index )
    {
        // base case is index is beyond the length of the String
        if( index >= s1.length() )
            return;
        String f = s1.substring( 0 , index ) ;      // 0 - i-1
        String m = s1.substring( index , index + 1 ) ;  // i - i
        String b = s1.substring( index + 1 );       // i+1 - end
        System.out.println( f + " " + m + " " + b );
        printString( s1 , index + 1 );
    }
    
    
    /**
     * This method will return as a String, only the even index letters
     * "Hello World"  returns "HloWrd"
     */    
    public static String evenIndexLetters( String str ) 
    {
        if( str.length() <= 1 ) 
            return str;
        else
            return str.substring( 0 , 1 ) + evenIndexLetters( str.substring( 2 ) ) ;
    }
    
    //index starts at 0
    //don't change str
    public static String evenIndexLetters(String str, int index)
    {
        if( index >= str.length())
        {
            return "";
            
        }
        else 
            return str.substring(index, index+1) + evenIndexLetters(str,index+2);       
        
    }
    
    
    /**
     * backwards
     * This recursive method will reverse the letters in a String
     * @param   s   This is a String with a number of letters in it
     * @return  Will return a String that is backwards of the original String
     */
    public static String backwards( String s ) 
    {
        // base case, will stop when s.length() <= 1, returning s
        // else: will return the last letter + a call to backwards
        if( s.length() <= 1 )
            return s;
        else
            return s.substring( s.length() - 1 ) + 
                    backwards( s.substring( 0 , s.length() - 1 ) );            
    }
       
    /**
    * Helper Recursive methods
    * We put forth a public interface, with parameters that are 
    *   needed by other classes
    * 
    * reverse - String to be reversed
    * 
    * we can write a private helper method that we call from our public method
    * We can then add additional parameters to make our lives easier
    * index values to keep track of what index we are working with
    */
    
    public static String reverse( String s )
    {
        return reverse( s , s.length()-1 );
    }
    
    private static String reverse( String s , int index )
    {
        if( index < 0 ) 
            return "";
        return s.charAt(index) + reverse( s , index-1 );
    }
    
    
    /**
     * printAnagrams
     * This recursive method will print all the anagrams of a given String
     * @param   prefix
     * @param   word
     */
    public static void printAnagrams(String prefix, String word) 
    {
        if(word.length() <= 1) 
            System.out.println(prefix + word);
        else 
        {
            for(int i = 0; i < word.length(); i++) 
            {
                   String cur = word.substring(i, i + 1);
                   String before = word.substring(0, i); 
                   String after = word.substring(i + 1);
                   printAnagrams(prefix + cur, before + after);
            }
        }
    }
    /**
     * It will count up how many words there are in a string
     * Precondition: No leading or trailing spaces. Only one space between words
     * precondition: Index = 0 on first call
     */
    public static int wordCount ( String str , int index)
    {
        if(index == -1)
            return 1;
        return 1 + wordCount(str, str.indexOf(" ", index + 1));
    }
    
}