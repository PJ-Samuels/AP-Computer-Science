/**
 * PJ Samuels
 * The user will input different postive numbers into the program to determin the mean of all the inputs, to find the mean of all inputs the user must press -1.
 */
package Unit3;
import java.util.*;
public class Lab_14
{
    public static void main()
    {
        Scanner kin = new Scanner(System.in);
        System.out.println("The program will add up all of your inputs and find the mean");
        int input;
        double sum = 0;
        double divisor = 0.0;
        /**
         * Thw do whie loop will repeat and allow the user to keep inputing positive numbers to find the mean of these numbers
         *  The loop will repeat as long as the input doesn't equal -1
         */
        do 
        {
            System.out.print("Please enter a number(enter -1 to end):");
            input = kin.nextInt();
            /**
             * The if statemnt determines whether the users input is valid or not 
             * if the user inputs anything but -1 pr a postive number the code will say it must be positive
             * if the input is -1 the code will end
             */
            if (input>0)
            {
                sum = (int)sum + input;
                divisor= ++divisor;
                
            }
            else if (input <=-2 || input==0)
            {
                System.out.println("Error, invalid entry");
            }
            else if (input==-1)
            {
                break;
            } 
        }
        while(input !=-1);
        System.out.println("Median = " + (sum/divisor));
        
    }
}