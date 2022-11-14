/**
 * PJ Samuels
 * enter you first name then your last name then your full name 
 */
package Unit1;

import java.util.*;

public class FullName
{
    public static void main()
    {
        System.out.print("What is your first name");
        Scanner kin = new Scanner(System.in);
        String firstName = kin.nextLine();
        System.out.println("Your first name is:" +firstName);
        System.out.print("What is your Last name");
        String lastName = kin.nextLine();
        System.out.println("Your last name is " +lastName + ".");
        System.out.print("What is your Full name ");
        String fullName = kin.nextLine();
        System.out.println ("Your last name is "+fullName);
        System.out.print("Your full name is"+firstName + lastName +".");
        
        
    }
}
