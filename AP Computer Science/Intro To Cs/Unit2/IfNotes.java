package Unit2;

import java.util.*;

public class IfNotes
{ 
    public static void main()
    {
        /**
         * conditional operators - yield a boolean value (T/F)
         * > >=  < <= == !=
         * == - are they equal
         * != - are they different(determining whether they are different) 
         * 
         * a>b  Will all yield a boolean value
         * a==b Will all yield a boolean value
         * a! = b Will all yield a boolean value
         * 
         */
        int a = 5;
        int b = 7;
        System.out.println("a>b = " +(a>b) );
        System.out.println("a<b = " +(a<b) );
        System.out.println("a==b = " +(a==b) );
        System.out.println("a!=b = " +(a!=b) );
        /**
         * if statements allow us to control the flow of program based on if something if true or false
         * 
         * if (condtition)
         * {
         *     // code runs if the condition was true
         * }
         * else
         * {
         *     // code runs if the condition was false
         * }
         */
        
        int temp = (int)(Math.random()*100-50);//-50 to 50
        
        /*
         * What is thee condition
         * What will happen if it's true
         * What will happen if it's false (only need with else)
         * 
         * Is the tempature is less then 0?
         * true: Print out that is freezing
         * False: Print out that it's not freezing
         */
        if (temp >= 0)
       {
           System.out.println("The tempature is freezing");
       }
       else
       {
           System.out.println("The tempature is not freezing");
       }
       /**
        * we dont't have to have else statements
        * if( condition )
        * {
        *     code
        * }
        * code 
        * 
        * if statments only need races if running more then one line of code
        * 
        * if( condition )
        *   code;
        *   
        * code;
        * 
        * if (condition){
        *     code;
        *     code;
        * }
        * 
        *
        */
       double d = Math.random()*10;
       System.out.println("d= " + d);
       //prints a number from 0.0<= d <1.0
       
       //0.0 <= d < 1.0    +10
       //0.0 <= d < 10.0   + 1
       //1.0 <= d < 11.0   cast to an int
       //1 <= d <= 10
       double v= (int) (Math.random()*10+1);
       System.out.println(v);
       
       /**
        * The question mark operator is used like an if else statement
        * we assign to a variable a value based if a condition is true or false
        * 
        * boolean b = k%2==0? true ; false;
        * 
        * we are doing an assignment
        * int x = condition ? value assign  to x if true : value assign to x if the false 
        * 
        * 
        */
       
       int c = (int)(Math.random()*10+1); //1-10
       int e = c <= 5 ? 1 : 2;
       System.out.println("c = " +c);
       System.out.println("e = " +e);
    }
}
