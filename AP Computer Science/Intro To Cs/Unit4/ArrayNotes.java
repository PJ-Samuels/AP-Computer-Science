package Unit4;
import java.util.*; // this imports everything from the utility library

/**
 * import java.util.Scanner; // Scanner library input
 * import java.util.Arrays;  //we need this library to do somethings with arrays
 */

public class ArrayNotes
{
    public static void main()
    {
        /**
         * Arrays are a collection 
         * -a single variable that can hold multiple pieces of 
         *      daata at the same time
         * 
         * int x = 10 - thats all it can hold, single piece of data
         * 
         * Arrays all have a length - that can't be changed
         * Length -  how much data an Array  can hold and cannot be changed
         * 
         */
        int x; //delcared but not iniztalized 
                 //will give an error if we try to use it 
        int x2 = 5; // delcared and initialized
        int y[]; //array is delcared but not initliazied
                 //will give an error if we tryto use it
                 //this array has not length
        int [] y2; //another way to delcare an array
        
        //a, b, d, are ints
        //c is an array of ints
        int a, b , c[],d;
        
        // e, f, g, h are an array of ints - all indivudial int arrays
        int [] e, f, g, h;
        
        // to initialize an array we need to give it a length
        
        int z1[] = new int[10];  //length = 10 can hold 10 ints
                                 // this has 10 zeros in it
        
                                 
        System.out.println("z1 = " + Arrays.toString(z1));
        
        int z2 [] = { 3, -5, 14 , -7, 0, 24, 13};
        //this gives it a lnegth and data tofll it with
        
        System.out.println("z2 = " + Arrays.toString(z2));
        
        /**
         * Arrays have two piece of information
         * index - this is where the data is stored
         * element - this is the data
         * 
         * Index and length are related
         * length = 10
         * index = 0 - 9   (always starts at zero)
         * 
         * to access the elemet at an index
         * x[ index]    -- that index is a positive whole number 
         */
        
        int z3 [] = { 3, -5, 14 , -7, 0, 24, 13};
        System.out.println("Element index 4 = " + z3[4]);
        z3[1] = 20;
        z3[5]+= 3;
        z3[0] -=z3[2];
        System.out.println(Arrays.toString(z3));
        
        /**
         * Its not always super useful to look at a single element
         *      at a time
         * Its better to be able to traverse the array
         * Traverse means looking at every element in the array
         * - Staring at the front going through all elements
         * - starting at the back, going toward the front
         * - staring in the middle going toward the front/back
         */
        
        
        
        //z3.length gives us the length of the array
        // if length = 10, look indexs 0-9
        for (int i = 0 ; i<z3.length; i++)
        {
            // lets print out all the positive values in the array
            if(z3[i]>0)
                System.out.println(z3[i]);
        }
        int sum = 0;
        for (int i = 0; i < z3.length; i++)
        {
            sum += z3[i];
            
        }
        System.out.println("sum = " + sum);
        System.out.println("average = " + ((double)sum / z3.length));
        
        for (int i = 0;  i <z3.length; i++)
        {
            z3[i]+=10;
        }
        System.out.println(Arrays.toString(z3));
        
        
    }
}