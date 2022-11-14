package Unit2;
import java.util.*;
import Unit2.RecursionOperations.*;
//Lab 10
public class AdvancedRecursion
{   
    /**
     * Remove
     * the method will remove all duplicate letters coming after one letter is used but only the ones that come before a different letter
     *      it then returns the string of without all the duplicate letters
     * @return      String      returns the new string without the duplicate letters
     */
    public static String Remove ( String str,  String ans)//string must be empty
    {
        if( str.length() == 1)
        {
            return ans+str.charAt(0);
        }
        else
        {
            if( str.charAt(0) == str.charAt(1))
            {
                return Remove(str.substring(1,str.length()), ans);
            }
            else
                return Remove(str.substring(1,str.length()),ans+str.charAt(0));   
        }        
    }    
    /**
     * totalPrimes
     * the method recursivly finds how many prime numbers are from 1 to the input number
     * @return      int        returns the how many prime numbers are from 1 to the input
     */
    public static int totalPrimes( int x )     
    {
        int count = 0;
        int primeSum = 0;
        if(count == x)
            return primeSum;
        else
        {
            count++;
            if((RecursionOperations.factorial(x-1)+ 1 )% x == 0)
            {
                primeSum++;
                return primeSum + totalPrimes(x-1);
            }
            else 
                return primeSum + totalPrimes(x-1);
        }
    }
}
