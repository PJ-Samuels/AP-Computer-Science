/**
 * PJ Samuels
 * The user inputs their hours and salary to get their total profit. The program will only function if the user gives positive hours and salary.
 */
package Unit2;
import java.util.*;

public class Lab_7
{
    public static void main()
    {
      Scanner kin = new Scanner (System.in);
      System.out.print("Please input your salary: ");
      double salary = kin.nextDouble();
      System.out.print("Please input a number of hours: ");

      if (salary<=0)//program won’t continue unless the salary is a positive number
      {
          System.out.println("Error,salary has to be positive");
          
      }
      else //the program will then ask the user there number of hours
      {
         System.out.print("Please input a number of hours: ");
         double hours = kin.nextDouble();
         if (hours <= 0)//program won’t continue if the hours aren’t a positive number
         {
             System.out.println("Error, hours must be positive");
               
         } 
         else//the program will multiply the number of hours by salary until the hours are>40 in which case the program will multiply the extra hours by 1.5 and add it to 40
         {
             double extra = (hours-40.0)*(salary*1.5) ;
             double dollars =(40*salary)+extra;
             System.out.println("You earned " + dollars + " dollars.");
         }
      }
    }
}


