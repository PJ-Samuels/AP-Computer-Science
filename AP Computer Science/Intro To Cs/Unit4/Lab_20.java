/**
 * PJ Samuels
 * Part 1:The user will input a degress in celsius that they ant to convert to degress in farenheit ,   
 *      the program will determine the tempature through the use of a calling method
 * Part 2:The user will input a degress in farenheit that they ant to convert to degress in celsius ,   
 *      the program will determine the tempature through the use of a calling method
 * Part 3: THe user will input x and y coordiantes for two different points and the program will determine the lengths between through the use of methods
 * Part 4:The user inputs a double to be rounded to the nearest tenth (program uses methods and math.round to deteremine the answer)
 * Part 5: The user inputs a number and the program, through a method, will determine if the number is even or odd
 */
package Unit4;
import java.util.*; 
public class Lab_20
{
  public static void main()
  {
      Scanner kin = new Scanner(System.in);
      //Part 1
      System.out.print("Please input a number to convert to Farenheit: ");
      double celsius = kin.nextDouble();
      System.out.print("This converts to " + (celsiusToFahrenheit(celsius))+" degress fahrenheit");
      System.out.println();
      //part2
      System.out.print("Please input a  number to convert to celsius: ");
      double fahrenheit = kin.nextDouble();
      System.out.print("This converts to " + (fahrenheitToCelsius(fahrenheit))+" degress celsius");
      System.out.println();
      //Part 3
      int point1[] = new int[2];
      int point2[] = new int[2];
      System.out.print("Please input a value for x1: ");
      point1[0] = kin.nextInt();
      System.out.print("Please input a value for y1: ");
      point1[1] = kin.nextInt();
      System.out.print("Please input a value for x2: ");
      point2[0] = kin.nextInt();
      System.out.print("Please input a value for y2: ");
      point2[1]=kin.nextInt();
      System.out.println("the distance is "+ distance(point1,point2));
      System.out.println();
      //Part 4 
      System.out.print("Please input a number(to be rounded): ");
      double toBeRounded = kin.nextDouble();
      System.out.println("the result is "+ (round(toBeRounded)));
      System.out.println();
      
      //Part 5
      System.out.print("Please input a number(even or odd): ");
      int isEven = kin.nextInt();
      
      if(isNumberEven(isEven)== true)//if the number is even which is determine by method 5
      {
          System.out.println("This number is even");
      }
      else // will state if the input was odd
      {
        System.out.println("This number is odd");  
      }      
  }
  /**
   *    Will convert a Celsius temperature to Fahrenheit
   *    @param  celsius     A double containing a value representing a temperature in Celsius degrees
   *    @return     A double containing the Fahrenheit value of the celsius param       
   */
  public static double celsiusToFahrenheit( double celsius )//method 1
  {
      celsius = 9.0/5.0*(celsius)+32;
      return celsius;
  }
  /**
   *    Will convert a Fahrenheit temperature to Celsius
   *    @param  fahrenheit  A double containing a value representing a temperature in Celsius degrees
   *    @return     A double containing the Celsius value of the fahrenheit param       
   */
  public static double fahrenheitToCelsius( double fahrenheit ) //method 2
  {
      fahrenheit = (5.0/9.0 *((fahrenheit)-32));
      return fahrenheit;
  }
  /**
   *    Will determine the distance between two points
   *    @param  point1[]    An int array, index 0 is x, index 1 is y
   *    @param  point2[]    An int array, index 0 is x, index 1 is y
   *    @return     A double containing the distance between the two points 
   */
  public static double distance(int point1[],int point2[]) //method 3
  {
      double distance = Math.sqrt(Math.pow((point1[0]-point2[0]),2)+Math.pow((point1[1]-point2[1]),2));
      return distance;
  }
  /**
   *    This method will round the parameter to the nearest ones place
   *    @param  toBeRounded     A double that will be rounded
   *    @return     An int represenatitive of the param, but rounded to the ones place      
   */
  public static double round( double toBeRounded  ) //method 4
  {
      int num = (int)(toBeRounded);
      if(toBeRounded - num<.5)
       {
            toBeRounded = num;
       }
      else if (toBeRounded - num>=.5)
      {
          toBeRounded = num+1;
      }
      return toBeRounded;
  }
  /**
   *    This method will determine if a number is even or odd
   *    @param  isEven      An int value that could be positive or negative
   *    @return     A boolean that is true if the param is even, false otherwise        
   */
  public static boolean isNumberEven( int isEven  ) //method 5
  {
      if(isEven%2 == 0)// to determine if the input is even or not 
        return true;
      return false;
  }
}