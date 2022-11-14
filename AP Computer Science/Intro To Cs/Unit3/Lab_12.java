/**
 * PJ Samuels
 * The user entters a number of years and the program will find the population of mexico from 1990 plus those years.
 * Each year from 1990 the population increases by 2.3%
 */
package Unit3;
import java.util.*;
public class Lab_12
{
    public static void main()
    {
        Scanner kin = new Scanner (System.in);
        System.out.println("The population of Mexico is 1990 is 89.2  million");
        System.out.print("Please enter a number of years:");
        int numberYears = kin.nextInt();
        int i;
        double population = 89.2;
        /**
         * The number of years input by the is positive the population of mexico will increase, if negative it will decrease,
         * if the number of yearsis equal to zeero the population will stay the same 
         */
        if (numberYears>0)
        {
            /**
             * The for loop will increase the population by 2.3% each year(everytime it goes through the loop)
             */
            for(i=1;i<=numberYears;i++)
            {
                population = population + (population*0.023);
                
            }
            System.out.println("The population of mexico in"+(population + numberYears)+"is"+population);
        }
        else if (numberYears<0)
        {
            /**
             * The for loop will decrease the population by 2.3% each year(everytime it goes through the loop)
             */
            for(i=-1;i>=numberYears;i--)
            {
                population = population - (population*0.023);
                
            }
            System.out.println("The population of mexico in"+(population + numberYears)+"is"+population);
        }
        else 
        {
            System.out.println("the population is 89.2");
        }
    }
}

