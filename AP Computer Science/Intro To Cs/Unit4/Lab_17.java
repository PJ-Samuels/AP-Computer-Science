/**
 * PJ Samuels
 * Part 1: The user will input a number 1 - 10 and the program will make an array with the length of the input,
 *      the program will the generate random numbers 1-20 for each array value and find the mean, the smallest number in  the array and its index
 * Part 2: The program wil generate  an array with a length of 100 and the user can input a number (1-20)
 *      and see what indexes have this value and how many times its occurs
 */
package Unit4;
import java.util.*;

public class Lab_17
{
    public static void main()
    {
       //Part 1
        Scanner kin = new Scanner(System.in);
        System.out.print("Please input a number 1-10: ");
        int input = kin.nextInt();
        /**
         * This while loop prevents the user from enter an inalid input and will ask again until the user enters a valid number
         */
        while(input <=0 || input > 10)
        {
            System.out.print("Please input a valid number: ");
            input = kin.nextInt();
        }
        int arr[] = new int [input];
        double sum = 0.0;
        /**
         * this for loop find the sum of all the numbers in th array in order to find the median(and also inputs random numbers 1-20 into the array)
         */
        for(int i = 0; i < arr.length; i++ )
        {
            arr[i] = (int)(Math.random()*20+1);
            sum += arr[i];
        }
        System.out.println("Array = " +Arrays.toString(arr));
        System.out.println("The mean is "+ (sum/input));

        if (arr.length == 0)
            return;
        int small = arr[0];
        int index = 0;
        /**
         * the for loop finds the smallest number in the array and figures out its index as well
         */
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < small)
            {
                small = arr[i];
                index = i;
            }
        System.out.println("The smallest number is " + small);
        System.out.println("Its index is  " +(index+1) );
       // Part 2
        
    }
    public static void main2()
    {
       Scanner kin = new Scanner(System.in);
       int arr2[] = new int[100];
       int sum = 0; 
        /**
         * the for loop generates random numbers 1-20 for each array index value
         */
       for(int i = 0; i < arr2.length; i++ )
       {
            arr2[i] = (int)(Math.random()*20+1);
       }
        System.out.println("Array = " +Arrays.toString(arr2));
        System.out.print("Please enter a number(1-20):" );
        int userInput = kin.nextInt();
       while(userInput <=0 || userInput > 20)
       {
            System.out.print("Please input a valid number: ");
            userInput = kin.nextInt();
       }
        int value = 0;
        /**
         * the for loop determines which indexes contain the number that the user inputs 
         */
       for ( int i =0; i < arr2.length;i++)
       {
            if (userInput==arr2[i])
            {
                System.out.println(userInput+" appeared at index "+ i);
                value ++;
            }
       }
       System.out.println(userInput +" apeared " + value + " times");
       
    }
}

