package Unit3;
import java.util.*;
//12b
public class ArrayMethodsB
{
    /**
     * arrayIndex
     * the method will travese the int[] looking from the specified start point to the end of the array and return the index
     * @return      int     returns the index of number if it is in the array
     */
    public static int arrayIndex( int arr[] , int x , int start)//returns the index
    {     
        if(start == arr.length)
            return -1;
        else
        {
            if(arr[start] == x)
                return start;
            else 
                return arrayIndex(arr, x, start+1);
        }      
    }
    /**
     * indexOf
     * the method will find all the index of a specificed char at return an array of those indexes
     * @return      int[]      returns a string of the indexes of all chars that the user is looking for
     */
    public static void  indexOf( String s , char target , int sIndex , int array[] , int aIndex )//aIndex must start at 0
    {
        if(sIndex == s.length()-1)
        {
            for(int i = aIndex; i < array.length; i ++)
            {
                array[i] = -1;
                    
            }
            System.out.println(Arrays.toString(array));
        }
        else
        {
            if(s.charAt(sIndex) == target)
            {
                array[aIndex] = sIndex;
                indexOf(s,target,sIndex+1,array,aIndex+1);
            }
            else
                indexOf(s,target,sIndex+1,array,aIndex);
        }
    }        
    /**
     * charAtIndex
     * the method will take the certain chars at different index and return only those in one string
     * @return      String      returns a string of the specificed chars at of the users inputs
     */
    public static String charAtIndex(String s,int cIndex[])
    {
        String newString = "";
        for(int i = 0; i < cIndex.length; i++)
        {
            newString += s.charAt(cIndex[i]);
        }
        return newString;
    }
    /**
     * rotate
     * the method takes a specified index ans changes index according to what the user wants the to be shifted around
     * @return      int[]       returns the new shifted/ modified array 
     */
    public static int[] rotate(int temp, int arr[])
    {
        temp = arr[0];
        for(int i = 0; i < arr.length - 1; i++)
        {
            arr[i] = arr[i+1];
            
        }
        arr[arr.length-1] = temp;
        return arr;
        
    }   
    /**
     *insert
     * the method returns a new array with the number the user wanted input into the specificed index
     *@return       int[]       returns an array with the new input value
     */
    public static int[] insert(int[]arr, int add)
    {
        int[] ans = new int[arr.length+1];
        int temp;
        for(int i = 0; i < ans.length-1; i++)
        {
            if(arr[i] >= add)
            {
                temp = arr[i];
                ans[i] = add;
                add = temp;
            }
            else 
                ans[i] = arr[i];
        }        
        ans[ans.length-1] = add;    
        return ans;
    }
}
