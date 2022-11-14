/**
 * PJ Samuels
 * The user will input a number for how long they would like the array to be, the program will then generate random numbers for every value in the array,
 *      the program will the sort all the numbers from smallest to largest without using arra.sort
 * Extended Challenge: note how many times the numbers in the array swap
 */
package Unit4;
import java.util.*;
public class Lab_18
{
    public static void main()
    {
        Scanner kin = new Scanner(System.in);
        System.out.print("Please input a number 1-20: ");
        int input = kin.nextInt();
        /**
         * This while loop prevents the user from enter an inalid input and will ask again until the user enters a valid number
         */
        while(input <=0 || input > 20)
        {
            System.out.print("Please input a valid number: ");
            input = kin.nextInt();
        }
        int arr[] = new int[input];
        int variable = 0;
        /**
         * The for loop will assign a random number value 1-10 to all the values in the array 
         */
        for(int i = 0; i < arr.length; i++ )
        {
            arr[i] = (int)(Math.random()*10+1);
        }
        System.out.println("Array" + Arrays.toString(arr));
        int switchValue = 0;
        /**
         * This for loop will enable the nested loop to perform its function on every single number in the array, 
         *      swapping all numbers that are higher than those succeding it 
         */

        for(int i = 0; i < arr.length; i++ )
        {
            /**
             * The for loop will go test each array value and see if it is greater than the one succeding it, 
             *      if it is the array values will be swapped and so on until the loop is complete
             */
            for (int j = 0 ; j<(arr.length-1); j++)
            {
                if(arr[j] > arr[i])
                {
                    variable = arr[i];
                    arr[i] = arr[j];
                    arr[j] = variable;
                    System.out.println("Switch occured" + Arrays.toString(arr));
                    switchValue++;
                }
            }
        }
        System.out.println("Array" + Arrays.toString(arr));
        System.out.println(switchValue + " value swaps occured");
    }
}
