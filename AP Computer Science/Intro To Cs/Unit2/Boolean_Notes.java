package Unit2;
import java.util.*;

public class Boolean_Notes
{
    public static void main()
    {
      /**
       * boolean is either true or false
       * boolean is a reserved word 
       */  
      
      boolean b = true;
      boolean b1 = false;
      
      System.out.println("b = " + b);
      
      //can I do it in caps?
      //boolean b2 = False; -NO
      
      //user input?
      Scanner kin = new Scanner(System.in);
      System.out.print("The sky is blue. (true/false): ");
      boolean answer = kin.nextBoolean();
      
      System.out.println("Your answer: "+ answer);
	 /**
	  * && - and - is only true if both are true
	  * ||- or is only false if both are false
	  * ! - not - switches true to false and vise verse
	  * 
	  * deMorgan's
	  * 
	  * !(p|| q)= !p&&!q
	  * !(p&&q)= !p&&!q
	  * 
	  * Order of operations
	  * 1) && goes before ||
	  * 2)|| goes before &&
	  * 3) They go the same time,left to right
	  * 
	  * 
	 */
      boolean t = true;
      boolean f = false;
      System.out.println(t || f && t );// what does it yield
      //1) && first = true
      //2) || first = true
      //3) same time,left to right = true
      
      System.out.println(t|| f && f);
      //1) && first= true
      //2) || first = false
      //3) same time, left to right = false
      
      ///// AND GOES BEFORE || ALWAYS 
      
      
    }
}