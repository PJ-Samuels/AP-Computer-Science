/**
 * PJ Samuels 
 * Part 1:The program will ask the user to input a number and will assign each digit value to an arrays index in that order 
 * Part 2:The program will generate a number 5-10 and assign that value to the first element of an array, 
 *      and increase each element index after by a value 0-10
 * Part 3: The program will combine both of the previous arrays lentgths and values and sort them from lowest to highest 
 */
package Unit4;
import java.util.*;
public class Lab_19
{
    public static void main()
    {
        //part 1
        Scanner kin = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int input = kin.nextInt();
        int i = 0;
        /**
         * The while loop prevents the user from inputing a negative number 
         */
        while( i == 0)
        {
            if(input <=0)//if the user inputs a valid entry it will ask for another valid input
            {
                System.out.println("Please input a valid entry:");
                input = kin.nextInt();
            }
            else//will break the loop
            {
                i++;
            }
        }
        int length = (int)(Math.log10(input)+1);
        System.out.println("length = " + length);
        int arr[] = new int[length];
        int times = 10;
        /**
         * The for loop will take the users input and will assign the value of ecah digit to an array element 
         */
        for( i = (length-1); i >=0 ; i--)
        {
            arr[i]= input%10;
            input/=10;
        }
        System.out.println("Array = " + Arrays.toString(arr));
        //Part 2
        int length2 = (int)(Math.random()*10+5);
        int arr2[] = new int [length2];
        int start = (int)(Math.random()*10+1);
        /**
         * the for loop will increase the value of the array element before it by a random number 1-10 and assign that to the next index value of the array
         */
        for(i = 0; i < arr2.length; i++)
        {
            arr2[i] = start;
            start+=(int)(Math.random()*10-1);
        }
        System.out.print("Array =" + Arrays.toString(arr2));
        int value = 0;
        /**
         * The for loop will determine if the array values have been increased by zero at anytime in the array starting at a value of 0(int i) 
         */
        for(i = 0; i < arr2.length; i++)
        {
            /**
             * The for loop will determine if the array values have been increased by zero at anytime in the array starting at a value of 1(int j)
             */
            for(int j = 1;  j<arr2.length; j++)
            {
                if(arr2[i] == arr2[j])// teh if statement wil increase the amount of times that values were the same or unchanging 
                    value++;
            }
        }
        if(value>0)//if value from the for loop is more than one the loop wasnt strickly increasing 
            System.out.print("and is not strictly increasing");
        else if (value==0)// if value is 0 the loop is stricly increasing 
            System.out.print("and is strictly increasing");
        //Part 3
        System.out.println("");
        int arr3[]= new int [arr2.length+ arr.length];     
        i = 0;
        int j =0;
        int k = 0;
        /**
         * The while loop will take the values of both pevious arrays and assign them to the index elements
         *      of the new array(which is the length of both previous arrays) in increasing order
         */
        while (i < arr.length && j< arr2.length)
        {
            if (arr[i]< arr2[j])// if the value of arr2 is greater than the value of arr, its input into the next iteration of the array value arr3[k] 
            {
                arr3[k]=arr[i];
                i++;
            }
            else // if the value of arr is greater than the value of arr2, its input into the next iteration of the array value arr3[k] 
            {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        /**
         * This while loop will be used if the i value is still less then the length of array arr
         */
        while (i < arr.length)
        {
            arr3[k] = arr[i];
            i++;
            k++;
        }
        /**
         * This while loop will be used if the j value is still less then the length of array arr2
         */
        while(j < arr2.length)
        {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println("Array 1 = " + Arrays.toString(arr));
        System.out.println("Array 2 = " + Arrays.toString(arr2));
        System.out.println("Array 1&2 combo = " + Arrays.toString(arr3));
    }
}                       