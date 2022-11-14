package Unit2;

import java.util.*;
public class Lesson9A
{
    public static void main()
   {
     int i = 10,j= 3;
     boolean true_false;
     true_false = (j>i);
     true_false = (i<j);
     true_false=(i==j);
     
     true_false= (j!=i);
     System.out.println(true_false);
     
     
     int m = 1;
    if (m<=44)
     {
         boolean b = true;
         System.out.println(b);
     }
     
     
    int r = 1;
    if (r>17)
     {
         boolean b = true;
         System.out.println(b);
     }
     
     String s1 = "school BUS";
     if (s1.equals("school bus"))
    {
        System.out.println("Equal");
    }
    else 
    {
        System.out.println("Not Equal");
    }
    int g = 1;
    if (g<34)
    {
        boolean b = false; 
    }
    else if (g>34)
    {
        boolean b = false;
    }
    else if(g==34)
    {
        boolean b = true;
    }
    int k= 1;
    if (k>0)
    {
        boolean b = true ;
    }
    else if(k<0)
    {
        boolean b = false ;
    }
    System.out.print("Enter your password: ");
    Scanner kin = new Scanner(System.in);
    String password = kin.nextLine();
    
    if (password.equals("XRay"))
    {
        System.out.println("Password entered successfully.");
    }
    else
    {
        System.out.println("Incorrect password.");
    }
   }
}
