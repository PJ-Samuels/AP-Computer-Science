package Unit3;
import java.util.*;
/**
 * PJ Samuels
 */
public class ArrayListMethodsB
{
    public static void clientMain()
    {
        ArrayList<Integer> arr = new ArrayList(10);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        // part 1 arrayIndex
        int x = 2;
        int start = 1;
        int ans =  arrayIndex(arr, x,start);
        System.out.println(ans); 
        // indexOf
        ArrayList<Integer> m2 = new ArrayList<Integer> (0);
        indexOf("Hello World", 'l', 0, m2);
        
        //rotate
        ArrayList<Integer> arr2 = rotate(arr);
        System.out.println(arr2);
        // insert
        ArrayList<Integer> arr3 = new ArrayList<Integer>(6);
        arr3.add(1);
        arr3.add(2);
        arr3.add(3);
        arr3.add(4);
        arr3.add(5);
        arr3.add(6);
        insert(arr3,2);          
        
    }
    /**
     * arrayIndex
     * the method will traverse an ArrayList look for a specified int but starting from a specific index
     *      the method returns the index of the first occurance of the number
     * @param   arr     is the arrayList being travesed for the given int
     * @param   x       is the int being look for in the input ArrayList
     * @param   start   is the index where the program will start to traverse the ArrayList
     * @return  int     returns the -1 or a number between the start and arr size -1 
     */
    public static int arrayIndex(ArrayList<Integer> arr , int x , int start )
    {
        if(start == arr.size())
            return -1;
        else
        {
            if(arr.get(start) == x)
                return start;
            else
                return arrayIndex(arr,x, start+1);                
        }      
    }
    /**
     * indexOf
     * the method recursivly travsers a string an looks for all the instances of a target
     *      and returns those indexes in the arrayList 
     * @param   s   is the String being recursivly  traversed 
     * @param   target   is the char that is being searched for in the String 
     * @param   sIndex   is the index that the method will search of the char at
     * @param   a        is the ArrayList that will hold the index values of the chars in the String
     */
    public static void indexOf( String s , char target , int sIndex , ArrayList<Integer> a)
    {
        if(sIndex == s.length())
            System.out.println("index Of method a = "+ a);
        else
        {
           if(s.charAt(sIndex) == target )
           { 
               a.add(sIndex);
               indexOf(s,target,sIndex+1,a);
               
               
           }
           else
                indexOf(s, target, sIndex+1, a);          
        }
        
    }
    
    /**
     * rotate
     * the method will move the first integer of the ArrayList an move it to the back of the Array
     * @param   arr     the ArrayList that will have its first value moved to the back
     * @return  ArrayList<Integet>      returns the rotated ArrayList 
     */
    public static ArrayList<Integer> rotate(ArrayList<Integer> arr)
    {
        int temp = arr.get(0);
        arr.remove(0);
        arr.add(temp);
        return arr;
    }
    /**
     * insert
     * the method will insert a variable in the correct numeric place into a sorted ArrayList
     * @param   a   is the array being travesed and added to
     * @param   x   is the int being add into the Array in order
     */
    public static void insert (ArrayList<Integer> a, int x)
    {
        for(int index = 0; index < a.size()-1; index++)
        {
            if(x < a.get(index))
            {
                a.add(index,x);
                break;
            }
        }
        System.out.println(a);
    }

}
