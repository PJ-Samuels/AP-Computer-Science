/**
 * PJ Samuels 
 * The user enters a number into the program and the program will add or subtract(depending on the number ) all the whole numbers leading up to it together
 * Extended challenge: the program multiplies all the numbers leading up to users input
 */
package Unit3;
import java.util.*;
public class Lab_11
{
    public static void main()
    {
        Scanner kin = new Scanner (System.in);
        System.out.print("Please Input an number:");
        int number = kin.nextInt();
        int i ;
        int sum = 0;       
        if (number<0)//negative
        {
            /**
             * The for loop steps down one and subtracts all numbers leading up to the input
             */
            for( i = 0; i>= number;i--)
            {
                if(i==number)
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(i);
                }
                sum +=i;
            }
            System.out.println(" = " + sum);
        }
        else if(number>0)//positive
        {
            /**
             * the for loop step up one each time and adds all unmbers leading up the input
             */
            for( i = 0; i<= number;i++)
            {
                if(i==number)
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(i + " + ");
                }
                sum += i;
            }
            System.out.print(" = "+ sum);
        }
        else if (number==0)//result = 0
        {
            System.out.println("The answer is 0");
        }
        //Extended Challenge
        
        if (number==0)//result =0
        {
            System.out.println("The answer is 0");
        }
        else
        {
            /** 
             * both for loops mulitply togethor all numbers leading up to the input
             */
            if(number>0)//positive
            {
                sum = 1;
                System.out.print(number +" != ");
                
                for( i = 1; i<= number;i++)
                {
                    if(i==number)
                    {
                        System.out.print(i);
                    }
                    else
                    {
                        System.out.print(i+" * ");
                    }
                    sum *= i;
                }   
                System.out.print(" = " + sum);
            }
            else //negative
            {
                sum = 1;
                System.out.print(number +" != ");
                for( i = -1; i>= number;i--)
                {
                    if(i==number)
                    {
                        System.out.print(i);
                    }
                    else
                    {
                        System.out.print(i+" * ");
                    }
                    sum *= i;
                }
                System.out.print(" = " + sum);
            }
        }
    }
}
