package Unit2;

import java.util.*;

public class Calculator
{
    public static void  main()
    {
        /**
         * user will input two numbers 
         * user will input the opperation
         * program will print out the result 
         */
        Scanner kin = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int input1 = kin.nextInt();
        System.out.println("Please input a number: ");
        int input2 = kin.nextInt();
        //do input for a String
        System.out.println("Please input an operation: ");
        System.out.println("Add, Subtract, Multiply, Divide");
        String operation = kin.next();
        operation = operation.toLowerCase();
        //convert it to lower case
        
        switch(operation)
        {
            case "add":
                int z = input1+input2;
                System.out.println(z);
                break;
            case "subtract":
                 z = input1-input2;
                 System.out.println(z);
                break;
            case "multiply":
                 z = input1*input2;
                 System.out.println(z);
                break;
            case "divide":
                 z = input1/input2;
                 System.out.println(z);
                break;
            default:
                System.out.println("Error, must be Add, Subtract, Multiply, or Divide");
                break;
        }
    }
}