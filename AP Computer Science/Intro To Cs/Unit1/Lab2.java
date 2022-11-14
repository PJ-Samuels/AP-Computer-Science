/**
 * PJ Samuels
 * The user inputs a number of years into the program and is told the number of days, hours, minutes, and seconds in that number of years
 * Extra Credit: The user inputs a number of years into program as is told the number f days, hours, minutes, and seconds in that number of years including leap years
 */
package Unit1;
import java.util.*;

public class Lab2
{
    public static void main()
    {
        Scanner kin = new Scanner(System.in);
        System.out.print("Please input a number of years: ");
        double years = kin.nextDouble();//double years = the users input of years
        
        System.out.println(years + " years converts to " + (years*365)+ " days in " + years + " years.");
        System.out.println(years + " years converts to " + (years*8760)+ " hours in "+ years + " year.");
        System.out.println(years + " years converts to " + (years*525600)+ " minutes in "+ years + " year.");
        System.out.println(years + " years converts to " + (years*31540000)+ " seconds in "+ years +" year.");
        
        //including leap years into the program
        //could also multiply by 365.25
        
        System.out.println(years + " years converts to " + (((((years-years/4)*365 + (years/4 + (years/4*365))))+ " days in " + years + " years including leap years.")));
        System.out.println(years + " years converts to " + (((((years-years/4)*8760 + (years/4*24 + (years/4*8760))))+ " hours in " + years + " years including leap years.")));
        System.out.println(years + " years converts to " + (((((years-years/4)*525600 + (years/4*1440 + (years/4*525600))))+ " minutes in " + years + " years including leap years.")));
        System.out.println(years + " years converts to " + (((((years-years/4)*31540000 + (years/4*86400 +(years/4*31540000 ))))+ " seconds in " + years + " years including leap years.")));
        //3.1540000 = 3.154E7
    }
}