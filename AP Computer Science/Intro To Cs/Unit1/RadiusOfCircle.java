/**
 * Name
 * Description of what this progam does
 * takes area of a circle input by the user, and prints out the radius of the radius of that circle
 */

package Unit1;

//we are importing the scanner class and the utility library
import java.util.*;



public class RadiusOfCircle
{
    public static void main()
    {
        //kin is just a variable name- keyboard input
        Scanner kin = new Scanner(System.in);
        
        System.out.print("What is the area?");
        double area = kin.nextDouble();
        //we got to think about what type of data the variable should be
        double radius = Math.sqrt(area/Math.PI);
        //remeber Pi is capitilized which tells us it is final
        
        System.out.println("Radius of your circle is " + radius );
        
        
        
        
        
        
    }
}
