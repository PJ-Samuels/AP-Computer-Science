package Unit4;
import java.util.*;
public class Lab8
{
    public static void main()
    {
        //Lab 8
        int arr1[] = new int [3];
        arr1[0] =(int)(Math.random()*10+1);
        arr1[1] =(int)(Math.random()*10+1);
        arr1[2] =(int)(Math.random()*10+1);
        for( int i = 0; i<arr1.length; i++)
        {
            arr1[i] = (int)(Math.random()*10+1);
        }
        System.out.println("arr1 = " + Arrays.toString(arr1));
        // to sort an array easily , we can use a method from the arrays lubrary
        Arrays.sort(arr1);
        System.out.println("arr1 =" + Arrays.toString(arr1));
        
        //Lab 14
        System.out.println("Lab14");
        /**
         * limit my numbes to 1-100, and do itrandom instead of user input
         * 
         */
        int arr2[] = new int[100];
        // create an array length 100, and I will use this to total 
        // how many times  certain number was input
        //create 500 randomnumbers 
        for ( int i = 1; i <=500;i++)
        {
            int x = (int)(Math.random()*20+1);//1-20
            arr2[x-1]++;
        }
        System.out.println("Arr2 =" + Arrays.toString(arr2));
        int largest = 0; // think of this number as a index
        for(int i = 0; i < arr2.length;i++)
        {
            // if the element at index largest is smaller than the element ar index i
            //    - than set largest equal to i 
            if (arr2[largest] < arr2[i])
                largest = i;
        }
        System.out.println("mode  = " +(largest +1));
        System.out.println("It occured " + arr2[largest] + " times");
        //this creates a copyofthe array,store that copy into
        //a new array called original
        int original[] = Arrays.copyOf(arr2, arr2.length);
        // int original [] = arr2;  -- this creates another refrence 
        
        Arrays.sort(arr2); // sort the data in ascendind order
        // I now know the last index contained the largest number
        
        largest = arr2[19]; //I know this is the largest element
        for(int i = 0 ; i < arr2.length; i++)
        {
            if(original[i] == largest)
                System.out.println("mode = " + (i+1));
        }
        
    }
}