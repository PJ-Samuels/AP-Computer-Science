//Lab 15a
package Unit3;
import java.util.ArrayList;
/**
 * PJ Samuels
 */
public class ArrayListMethods
{
    /**
     * inArray
     * the program will traverse an ArrayList looking for an occurance of an int if their is none it will return false
     * @param   arr     the ArrayList being traversed
     * @param   x   the int being looked for the ArrayList
     * @return ans   boolean    returns if the int is in the ArrayList
     */
    public static boolean inArray(ArrayList<Integer> arr , int x )
    {
        boolean ans = false;
        for(int i = 0; i < arr.size(); i++)
        {
            if(arr.get(i) == x)
                ans = true;                
        }
        
        return ans;                
    }
    /**
     * arrayAverage
     * the program traverses an ArrayList and Finds the smallest integer value, and returns this value
     * @param   arr     is the ArrayList that you traverse
     * @return  double    returns the avegare of the sum of all the numbers in the array
     */
    public static double arrayAverage(ArrayList<Integer> arr)
    {
        double sum = 0;
        double divisor = 0;
        for(int i  = 0; i < arr.size(); i++)
        {
            sum += arr.get(i);
            divisor++;
        }// just use size
        return sum/divisor;
    }
    /**
     * arraySmallest
     * the method will traverse and Arraylist searching for the smallest value and return it
     * @param   arr   is the ArrayList 
     * @return  int   returns the smallest value in the ArrayList
     */
    public static int arraySmallest(ArrayList<Integer> arr)
    {
        int smallest = arr.get(0);
        for(int i  = 0; i < arr.size(); i++)
        {
            if( arr.get(i) <= smallest)
                smallest = arr.get(i);
        }
        return smallest;
    }
    /**
     * randomArray
     * the method will create a method of the size of the variable size and will it with 
     *      random numbers from 0 to the range
     * @param   range   is the range of random number that will be filled into the ArrayList
     * @param   size    is the size of the ArrayList
     * @return  ArrayList<Integer>   is the Arraylist of random size fill this random numbers
     */
    public static ArrayList<Integer>  randomArray( int size , int range )
    {      
        ArrayList<Integer> arr = new ArrayList<Integer>(size); // dont use arr.size() JUST USE SIZE
        int i = 0;
        while(i < size)
        {
             arr.add((int)(Math.random()*range+1));
             i++;
        }
        System.out.println(arr);
        return arr;
    } 
    /**
     * arrayIndex
     * the method will traverse an ArrayList and look for the first occurance of x and return that index, 
     *      if it doesn't have that x it will return -1
     * @param   arr     is the Array list beiing traverse for x
     * @param   x       is the variable being searched for in the ArrayLsit
     * @return   int    is the index of the first occurance of x(will return -1 if there is none)
     */
    public static int arrayIndex(ArrayList<Integer> arr, int x )
    {
        // return arr.indexOf(x); can be done like this but I don't know if you wanted us to do it like this 
        for(int i = 0; i < arr.size(); i++)
        {
            if(arr.get(i) == x)
                return i;
        }
        return -1;
    }
    /**
     * longestRun   
     * the method traverses an array looking for the longest sequence of an int object 
     * @param   arr     is the ArrayList that is traverse looking for the longest run
     * @return  int     returns the longest sequence of numbers in the array
     */
    public static int longestRun(ArrayList<Integer> arr)
    {
        int ans = 0;//current longest
        int j = 0;//longest
        for(int i = 1; i < arr.size(); i++)// do this instead for(int i  = 0; i< arr.size-1; i++)
        {
            if(arr.get(i-1) == arr.get(i))// if (arr.get(i) == arr.get(i+1))
            {
                j++;
                if(ans < j)
                    ans = j;           
            }
            else          
                j = 0;
            // add an if statement for if the length of the ArrayList is 1(cause the loop won't run)
            //also add if statement for if the longest sequence is 1
        }
        return ans+1;
    }
}
