package Unit2;
import Unit1.*;

public class RecursionTailNotes
{
    // precondition: ans = 0
    public static int recursiveSum( int x , int ans)
    {
        if( x <= 0 )
            return ans;
        else
            return recursiveSum( x - 1 , x + ans );
    }
        
    /** 
     * This method will only multiple odd numbers 1 - x
     * if x is even, it will make it the odd number x-1
     * precondition: ans = 1
     */
    public static int multiplyOdds( int x ) 
    {
        return multiplyOdds( x , 1 );
    }    
    private static int multiplyOdds( int x , int ans) 
    {
        if( x % 2 == 0 ) 
            x--;
        if( x <= 1 ) 
            return ans;
        else
            return multiplyOdds( x - 2 , ans * x) ;        
    }
    
    
    
    /**
     * sumFactorsTo
     * This recursive method will find the sum of all the factors of num
     * @param   num   This is an int, and it is looking for its factors
     * @param   max   This is an int, and it is a number smaller than num
     * @return  Will return an int, that is the sum of all the factors of num
     */
    public static int sumFactorsTo(int num) 
    {
        return sumFactorsTo( num , num , 0 ) ;
    }
    private static int sumFactorsTo(int num, int max, int ans) 
    {
        if(max == 0)
            return ans;
        else 
        {
            if(num % max == 0) 
                ans += max;
            return sumFactorsTo(num, max - 1 , ans);            
        }
    }  
    
    
    
    /**
     * This method will return as a String, only the even index letters
     * "Hello World"  returns "HloWrd"
     * H + "llo World"
     * l + "o World"
     * o + "World"
     * W + "rld" 
     * r + "d"
     * d
     */   
    public static String evenIndexLetters( String str ) 
    {
        return evenIndexLetters( str , "" );
    }
    // precondition: ans = ""
    private static String evenIndexLetters( String str , String ans) 
    {
        if( str.length() <= 1 ) 
            return ans + str ;
        else
        {
            ans += str.charAt( 0 ) ;
            return evenIndexLetters( str.substring( 2 ) , ans ) ;
        }
    }
    
    // precondition:   index = 0 
    public static String evenIndexLettersV2( String str  ) 
    {
        return evenIndexLettersV2( str , 0 , "" );
    }
    private static String evenIndexLettersV2( String str , int index , String ans ) 
    {
        // remember index starts at zero, so we want this to end
        // when its no longer < length
        if( index >= str.length() )
            return ans;
        else
        {
            ans += str.charAt(index);
            return evenIndexLettersV2(str , index+2 , ans );
        }
    }
    
    
    
    
    
    /**
     * backwards
     * This recursive method will reverse the letters in a String
     * @param   s   This is a String with a number of letters in it
     * @return  Will return a String that is backwards of the original String
     */
    public static String backwards( String s ) 
    {
        return backwards( s , "" );
    }
    private static String backwards( String s , String ans ) 
    {
        // base case, will stop when s.length() <= 1, returning s
        // else: will return the last letter + a call to backwards
        if( s.length() <= 0 )
            return ans ;
        else
        {
            ans += s.charAt( s.length() - 1 ); 
            return backwards( s.substring( 0 , s.length() - 1 ) , ans);   
        }
    }
       
    
    public static String reverse( String s )
    {
        return reverse( s , s.length()-1 , "" );
    }
    
    private static String reverse( String s , int index , String ans )
    {
        if( index < 0 ) 
            return ans;
        else
        {
            ans += s.charAt(index);
            return reverse( s , index-1 , ans );
        }
    }
   
    /**
     * It will count up how many words there are in a String
     * Precondition: No leading or trailing spaces.  Only one space between words
     * Precondition: Index = 0 on first call
     */
    public static int wordCount( String str )
    {
        return wordCount( str , 0 , 0 );
    }
    private static int wordCount( String str , int index, int ans)
    {
        if( index == -1 )
            return ans;
        // so if it is not negative 1, we have a word
        // so return 1 + recursion
        // The recursion method we send it str
        // and the index of the next space 
        // if there is no next space, it will return 1 
        return wordCount( str , str.indexOf( " "  , index+1 ) , ans+1 );
    }
    
}