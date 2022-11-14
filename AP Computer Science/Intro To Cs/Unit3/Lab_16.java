/**
 * PJ Samuels
 * Part 1: The program will anticipate how long it will take a student who studies 10% of a notebook     
 *      that they haven't already learned
 * Part 2: The program will determine if a number is a perfect square by using the given sequence    
 *      (b + (b+2) + (b+4) etc..) and the program will say whether it is or isn't
 * Part 3: The user will input a number and the program will input that many rows of Stars
 *      in the form of a pyramid
 * Part 4: The user will input a number and the program will invert the digits(ex. 12 becomes 21)
 */
package Unit3;
import java.util.*;
public class Lab_16
{
    public static void main()
    {
       Scanner kin = new Scanner (System.in);
       //Part 1
       double unknown= 100.0 ;
       int month = 0;
       double progress = 0;
       /**
        * The do while loop will find the amount of months that a student will need to learn 100% 
        *       of the information he needs for a test, taking 10% if the information that he doesn't 
        *       know(this number will be 10% of of what they have left to learn
        */
       do 
       {
           progress = progress  + unknown *.1;
           unknown = unknown - unknown *.1;
           ++month;
       }
       while(progress <= 95 );
       System.out.println(month);
       //Part 2
       System.out.print("Please input a number: ");
       int input = kin.nextInt();
       int sequence = 1;
       int result = 1;
       int square = 0;
       /**
        * The for loop will prevent the user from inputting a negative number
        */
       for(int i = 1; i==1;i++)
       {
            if(input <= 0)
            {
                System.out.println("Invalid entry,input must be positive");
                --i;
                System.out.print("Please re-enter the amount you have: ");
                input = kin.nextInt();
            }
            else
                i++;
       }
       /**
        * The while loop will determine if a number is a perfect square 
        */
       while(sequence < input)
       {
                progress = progress;   
                sequence = sequence + 2 ;
                result = result + sequence ;
                square++;
       }
       if( sequence == input)
       { 
           System.out.println("This is a perfect square");
                
       }
       else if(sequence < input || sequence > input )
       {
           System.out.println("This is not a perfect square");
       }
       //Part 3
       System.out.print("Please input a number: ");
       int number = 0;
       int input2 =kin.nextInt();
       int d = input2;
       /**
        * The for loop will prevent the user from inputting a negative number
        */
       for(int i = 1; i==1;i++)
       {
            if(input2 <= 0)
            {
                System.out.println("Invalid entry,input must be positive");
                --i;
                System.out.print("Please re-enter the amount you have: ");
                input = kin.nextInt();
            }
            else
                i++;
       }
       /**
        * The for loop will determine how many rows that the program will print by using the user's input
        */
       for ( int row = 1 ; row <= input2 ; row++ )
       {

            /**
            * The for loop will determine how many spaces will be between stars and the start of a line
            */ 
            for (int space = 1 ; space < d ; space++ )
                System.out.print(" ");
            d--;
            /**
             * The for loop will determine how may stars will be in each row 
             */
            for ( int star = 1 ; star <= 2*row - 1 ; star++ )
                System.out.print("*");
            System.out.println("");
           
       }
       //Part 4
       System.out.print("Please input a number:");
       int input3 = kin.nextInt();
       int reverseinput = 0;
       /**
        * The while loop will reverse the digits of a number that the users inputs
        */
       while( input3 != 0 )
       {
          reverseinput = reverseinput * 10;
          reverseinput = reverseinput + input3%10;
          input3 = input3/10;
       }
       System.out.println("The reverse of  the input is: "+reverseinput);
     }
}

