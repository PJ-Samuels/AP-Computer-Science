package Unit4;
import java.util.*;
public class MethodNotes
{
    public static void changeX (int x)
    {
        x = 10;
        System.out.println("inside the method x = "+x);
    }
    public static void changeArray(int arr[])
    {
        for(int i = 0; i < arr.length;i++)
            arr[i]+=20;
        System.out.println("In method arr = " + Arrays.toString(arr));
    }
    /**
     * The main here is a method
     * a method can be called from anywhere else in the program an even from other java files
     * 
     * Method reader
     * public - access modifier (public, privateprotected, default)
     * Static - type of method(static vs non-static)
     * void - returns nothing
     * main - name 
     * () - parameters
     * 
     */
        
    public static void main()
    {
        int arr[] = {1,5,-10,13};
        System.out.println("Before method call arr = " + Arrays.toString(arr));
        changeArray(arr);
        System.out.println("After method call arr = " + Arrays.toString(arr));
            
        int x = 20;
        System.out.println("Before method call x = " + x);
        changeX(x);
        System.out.println("After method call x = " + x);
        // lets call our method 
        int a = 5;
        int b = doStuff(a);
        System.out.println("a ="+ a +" b = "+ b);
            
        //remember doStudd returns an int , so we can use this any place where we could use an int 
        System.out.println(doStuff(12));
        //System.out.println(doStuff(12.5));
        //System.out.println(doStuff(12,5));
        System.out.println(doStuff('f'));
        //converts it f to its ascii values
        printStuff(10,15);
        // int q = printStuff(10,15);
        //  printStuff is a void method, doesnt return anything
        //  so it can't set it eqqual to anything
    }
    /**
     * Method header
     * public static return methodName (parameters)
     * 
     */
     public static int doStuff(int x)
    {
        // return an int - remember can return one thing or nothing 
        //receives a single int as a parameter
        x*=2+5;
        return x;//When a method reaches a return statement, the method ends
        //Similar to how beak ends a loop 
    }
    /**
     * This comment is in a java doc format
     * 
     * Short description of what the method does 
     * @ param  x  Short description of parameter
     * @ param  a  Short descritption of parameter
     */
    public static void printStuff( int x, int a )
    {
        System.out.println("parameter 1 = " + x);
        System.out.println("parameter 2 = " + a);
        //ssince this  method isvoid we dont need  return
        // but if we put a return in here, it will act like a break
    }
    /**
     * isPythagoreanTripple - will determine if the parameters create 
     *      a pythagorean triple
     * @param  a  this is a part of a triangle 
     * @param  b  this is a part of a triangle 
     * @param  c  This is a part of a triangle
     * @return boolean will return true or false if the a,b,c is a pythagorean triple
     */
    public static boolean isPythagoreanTriple(int a, int b, int c)
    {
        if(a*a +  b*b == c*c)
            return true;
        return false;
    }
    /**
     * findHypotenuse - finds the hypotenuse given two legs of a right triangle 
     * @param  a  this is a part of a triangle 
     * @param  b  this is a part of a triangle 
     * @return boolean will return true or false if the a,b,c is a pythagorean triple
     */
    public static double findHypotenuse(int a , int b)
    {
        return Math.sqrt(a*a +b*b);
    }
    /**
     * findHypotenuse - finds the hypotenuse given two legs of a right triangle 
     * @param  a  this is a part of a triangle 
     * @param  b  this is a part of a triangle 
     * @return boolean will return true or false if the a,b,c is a pythagorean triple
     */
    public static double findHypotenuse(double a ,double b)
    {
        return Math.sqrt(a*a +b*b);
    }
    //What I created is called an overloaded method
    //and overloaded method has the same name, but different parameters
        
    /**
     * findLeg - finds the length of the leg given one leg of a right triangl and the hypotenuse
     * @param  a  this is a part of a triangle 
     * @param  b  this is a part of a triangle 
     * @return boolean will return true or false if the a,b,c is a pythagorean triple
     */
    public static double findLeg(int a , int c)
    {
        return Math.sqrt(c*c - a*a);
    }
    /**
     * printTriangle - wil print out a triangle based on the length given
     * @param  length - this willl be used to determin how many stars
     * 
     */
    public static void printTriangle(int length)
    {
        for (int i = 1;i <=length; i++)
        {
            for (int j  = 1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}