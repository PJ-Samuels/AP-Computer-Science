/**
 * PJ Samuels
 * The program will generate 3 random numbers between 1-10 and will show them from smallest to largest
 * Extended Challege: The program will use an array to show the random numbers in acendding order.
 */
package Unit2;
import java.util.*;

public class Lab8
{
    public static void main ()
    {
        System.out.println("The program will generate Three random numbers");
        int number1 = (int)(Math.random()*10+1);
        int number2 = (int)(Math.random()*10+1);
        int number3 = (int)(Math.random()*10+1);

        System.out.println("The first number is:" + number1);
        System.out.println("The second number is:" +number2);
        System.out.println("The third number is:" + number3);
        
        boolean test1 = (number1<=number2)&&(number2<=number3);
        boolean test2 = (number1<=number3)&&(number3<=number2);
        boolean test3 = (number2<number1)&&(number1<=number3);
        boolean test4 = (number2<=number3)&&(number3<=number1);
        boolean test5 = (number3<=number2)&&(number2<=number1);
        boolean test6 = (number3<=number1)&&(number1<=number2);
    
        if (test1)
        {   
                System.out.println(number1+ "<=" + number2 + "<=" +number3);
        }
        else if(test2) 
        {
                System.out.println(number1+ "<=" + number3 + "<=" +number2);
        }
        else if (test3)
        {
                System.out.println(number2+ "<=" + number1 + "<=" +number3);
        }
        else if (test4)
        {
                System.out.println(number2+ "<=" + number3 + "<=" +number1);
        }
        else if (test5)
        {
                System.out.println(number3+ "<=" + number2 + "<=" + number1);
        }
        else if (test6)
        {
                System.out.println(number3+ "<=" + number1 + "<=" + number2);
        }
        int number[]= new int[3];
        number[0]= number1;
        number[1]=number2;
        number[2]=number3;
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
    }
}