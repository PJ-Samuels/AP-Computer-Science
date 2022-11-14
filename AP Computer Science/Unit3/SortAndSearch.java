package Unit3;
import java.util.*;
//Lab 13
public class SortAndSearch
{
    /**
     * arraySwap
     * the method swaps two given indexes in an array
     */
    public static void arraySwap( int arr[] , int pos1 , int pos2 )
    {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
        System.out.println(Arrays.toString(arr));
    }
    /**
     * bubbleSort   
     * The method sorts an array by travesing teh array and using the switch method, it results in the smallest to largest number
     */
    public static void bubbleSort( int arr[] )
    {
        for(int i = 0; i < arr.length ; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                if(arr[i] < arr[j])
                    arraySwap(arr, i , j);
                
            }
        }
        System.out.println(Arrays.toString(arr));
    }    
    /**
     * recurBubbleSort
     * the method recursively sorts the array from smallest int to largest int
     */
    public static void recurBubbleSort( int arr[],int index1, int index2 ) //index 1 and two must both start at 0
    { 
        
        if(arr.length == index1)
        {
            return;
        }
        if(index2 < arr.length-1)
        {
            if(arr[index2]>arr[index2+1])
                arraySwap(arr,index2,index2+1);
            recurBubbleSort(arr, index1, index2+1);
            
        }
        else
            recurBubbleSort(arr,index1+1,0);
    }
    /**
     * recurFindSmallest
     * the method recursivly finds the smallest value in the array and returns that number
     * @return      int         the smallest number in the array
     */
    public static int recurFindSmallest( int arr[]  , int index , int smallestIndex) // index and smallestIndex starts with 0
    {
        if(index == arr.length )
            return smallestIndex;
        else 
        {
            if(arr[index] < arr[smallestIndex])
            {
                smallestIndex = index;
            }
            return recurFindSmallest(arr, index+1, smallestIndex);
        }
    }
    /**
     * arraySort
     * the method sorts an array using the recurFindSmallest method 
     */
    public static void arraySort( int arr[] , int index)//index starts at 0
    {
        int temp;
        for(int i = index; i < arr.length; i++)
        {
            arraySwap(arr,recurFindSmallest(arr,index,0), index);
            
            
        }
        System.out.println(Arrays.toString(arr));
    }
}

