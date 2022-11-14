/**
 * PJ Samuels
 * The user inputs a pyacode. The program then deteremines what type of worker they are
 * (Manager, pieceworker, hourly worker, and commissions worker). Depending on the paycode, 
 * the program will then ask the user more information about their time and salray to determine their pay
 */
package Unit2;
import java.util.*;

public class Lab_9
{
    public static void main ()
    {
        Scanner kin = new Scanner(System.in);
        System.out.print("Please input a paycode(1-4): ");
        
        int paycode = kin.nextInt();
        /**
         * The if statement declares the type of worker has just enter their code
         */
        if (paycode == 1)
        {
            System.out.println("Hello Manager");
        } 
        else if (paycode == 2)
        {
            System.out.println("Hello Hourly worker");
        } 
        else if (paycode == 3)
        {
            System.out.println("Hello Commision worker");
        } 
        else if  (paycode == 4)
        {
            System.out.println("Hello Piece worker");
        } 
        
        /**
         * The switch statement will take the workers paycode and tell them their salary 
         * Manager - must enter a positive number of weeks,
         *      if positive the number of weeks will be multiplyed by 400 dollars
         * Hourly worker - The program will ask for a positive number of hours and salary and will 
         *      only continue if both are positive. 
         *      -if the hours are more than 40 the program will multiply all extra hours by 15 
         *      and add it to 400
         *      -if the hours are 0<hours<40 the program will multiply hours by salary(10 dollars)
         * Commisions worker - if the salary is less than zero than the program will not continue
         *      -else the program will multiply the salary * 5.7 + 250
         * Piece worker- the user must enter a positive amount of items, the number of items is negative
         *      then the program will not work, else the number items will be multiply by 1.5
         */
        switch(paycode)
        {
            
            case 1://manager
                System.out.print("Please enter an amount of weeks: ");
                int weeks = kin.nextInt();
                System.out.println("Your total pay is " + (400*weeks) + " dollars");
                break;
            case 2:// hourly workers
                System.out.print("Please enter an amount of hours: " );
                double hours = kin.nextDouble();
                if (hours>40)//if the hours are more than 40 than the worker will get extra money
                {
                    System.out.println("Please enter salary:");
                    double salary = (int)kin.nextDouble();
                    if(salary<0)
                    {
                     System.out.println("Salary must be even");
                        
                    }
                    
                    else
                    {
                        double results =((hours - 40.0) * 15.0) + (40.0*10.0);
                        System.out.println("You total pay is: " + salary + " dollars");
                    }
                }
                else if(hours>0)
                {
                    System.out.println("Hours must be even");
                }
                else if (hours<= 40)
                {
                    double salary = hours*10 ;
                    System.out.println("Your total pay is: " + salary + " dollars");
                }
                break;
            case 3://commission workers
                System.out.print("Please enter your weekly sales: ");
                double sales = (int)kin.nextDouble();
                if (sales<0)
                {
                    System.out.println("Error, sales must be positive");
                }
                else   
                {
                 System.out.println("Your salary is " +(250+sales*5.7)+" dollars");
                 break;
                }
                break;
            case 4://piece workers
                System.out.print("Enter the number of items you make each work week: " );
                int items = kin.nextInt();
                if(items<0)//will be an error if the items aren't positive
                {
                 System.out.println("Error, items must be positive");
                }
                else 
                {
                 System.out.println("Your salary(per week) is "+ (items*1.5)+ " dollars");
                }
                break;
            default:
                System.out.println("You paycode must be between 1-4");
                break;
            
        }
    }
}