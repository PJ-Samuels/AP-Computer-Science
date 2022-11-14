package Unit3;
import java.util.*;
//Lab 12a
public class ArrayMethods
{ 
    /**
     * inArray
     * the method will traverse an array and return a true or false depending on whether the given number occurs in the method 
     * @return      boolean     returns whether a given number is in the array
     */
    public static boolean inArray( int arr[] , int x )
    {
        for(int value: arr)
        {
            if( value == x)
                return true;
        }
        return false;
        /*
         * for( int i = 0; i< arr.lengt;i++)
         *  if(arr[i] == x
         */
    }
    /**
     * arrayAverage
     * given an array with all positive numbers, the method will sum all the numbers in the array and return that value
     * @return      double      returns the sum of all numbers in the array
     */
    public static double arrayAverage( int arr[] )
    {
        int value = 0;
        for( int i = 0; i < arr.length ; i++)
        {
            value += arr[i]; 
            
        }
        return value;
    }
    /**
     * arraySmallest
     * the method traverses a given method and finds the smallest number in the array
     * @return      int     returns the smallest number in the array
     */
    public static int arraySmallest( int arr[] )
    {
        int ans = arr[0];
        for( int i = 0; i < arr.length; i++ )
        {
            if(ans > arr[i])
                ans = arr[i];            
        } 
        return ans;
    }
    /**
     * randomArray
     * the method will create an array from the given size in the input and fill each index with numbers ranging from 0 to the range input
     * @return      int[]       returns an array of random numbers 0-range
     */
    public static int[] randomArray( int size , int range )
    {
         int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random() * range + 1); 
        }
        
        return arr;
    }
    /**
     * arrayIndex
     * the method will traverse the input string and find the first instance of x returning that index
     * @return      int     returns the index of the first instance of x in the array
     */
    public static int arrayIndex( int arr[] , int x )
    {
        int index = -1;
        for(int i = 0 ; i < arr.length; i++)
        {
            if(arr[i] == x)
                return index = i;
        }
        return index;
    }

}

