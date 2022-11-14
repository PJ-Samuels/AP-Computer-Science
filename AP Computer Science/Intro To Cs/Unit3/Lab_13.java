/**
 * PJ Samuels
 * The use inputs a number of times they want to roll a die, the program then sees which number occurs the most and tells the user 
 */
package Unit3;
import java.util.*;
public class Lab_13
{
    public static void main()
    {
        Scanner kin= new Scanner (System.in);
        System.out.print("Please input a number:");
        int input = kin.nextInt();
        int i ;
        int die6 =0,die5=0,die4=0,die3=0,die2=0,die1=0;
        /**
         * The for loop will generate a random number(1-6 a die) however many times the user inputs 
         */
        for (i = 0; i <=input;i++)
        {
            int die = (int)(Math.random()*6+1);
            System.out.println("Die = "+die);
            /**
             * the if statement will increase the value of how many times a certain die is rolled by one if it is repeated in the for loop
             */
            if (die == 6)
            {
                die6 = ++die6;
            }
            else if (die == 5)
            {
                die5 =  ++die5;
            }
            else if (die == 4)
            {
                die4 = ++die4;
            }
            else if (die == 3)
            {
                die3 = ++die3 ;
            }
            else if (die == 2)
            {
                die2 = ++die2;
            }
            else if (die == 1)
            {
                die1 = ++die1;
            } 
        }
        int c = Math.max(Math.max(die1,die2),Math.max(Math.max(die3,die4),Math.max(die5,die6)));
        /**
         * the if statement indicates if the die is equal to c, depending on the, the program will print out which number ocurred the most 
         */
         if (die6 == c)
        {
             System.out.println("The die that was rolled the most was 6 and was rolled " + c + "times");
        }
         else if (die5 == c)
        {
             System.out.println("The die the was rolled the most was 5 and was rolled " + c + "times");
        }
        else if (die4 == c)
        {
             System.out.println("The die that was rolled the most was 4 and was rolled " + c + "times");
        }
        else if(die3 == c)
        {
             System.out.println("The die that was rolled the most was 3 and was rolled " + c + "times");
        }
        else if(die2 == c)
        {
             System.out.println("The die that was rolled the most was 2 and was rolled " + c + "times");
        }
        else if (die1 == c)
        {
             System.out.println("The die that was rolled the most was 1 and was rolled " + c + "times");
        }
        

    }
}
