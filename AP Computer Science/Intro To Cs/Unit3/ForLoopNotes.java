package Unit3;
import java.util.*;
public class ForLoopNotes
{
    public static void main()
    {
        /**
         * a loop, is a structure that allows us to repeat
         *      a scetion of code multiple times
         * 
         * 
         * A for loop has three elements
         * 
         * for(start ;stop ;step )
         * 
         * start - this a variable, that is where it begins at
         * 
         * stop - this is a condition, the loop runs while the condition is true
         * 
         * step - this is how much the variable is increasing or decreasing by each iteration of the loop
         */
        int dice;
        for (int i = 1; i<=10 ;i++)
        {
            dice = (int)(Math.random()*6+1);//random 1-6
            System.out.println("Dice =" + dice);
        }
        
        //for(start;stop;step)
        //we want to add up 1-100
        int total=0;
        //stat at 1 ,end when i is no longer<=100
        //increase by 1 each time
        for(int i = 1;i<=100;i++)     
        {
            total +=i;//total is incresd by i each step
            //total = 1+2+3...+99+100
        }
        System.out.println("total = " +total);
        
        
        int total2=0;
        //50-250
        //to go up by two, we change th step
        //change the start to odd for steps of odds 
        for(int i = 51;i<=250;i+=2)     
        {
            total2 +=i;
        }
        System.out.println("total = " +total2);
        
        
        /**
         * start;stop;step//basic structer of a for loop 
         * 
         * If want a serises of numer to go up 
         * 
         *      start <stop
         *      Stop< or <= number
         *      step has to be positive
         * for (int i=10 ;i <=100 ; i+=3)
         * 
         * struct
         * If you want a series of numbers to go down 
         *      start >stop
         *      stop> or>= number
         *      step has to be negative
         * for (int i = 10; i >= 0; i-= 2)
         * 
         * 
         * write a few loops where you didn't follow those guidelines
         */
        
        //for (int i = 3;i>=-3;i+=3)
        // {
         //  System.out.println(i);
       //}
        
       int i;
       for ( i = 1;i!=0;i*=2)
       {
             System.out.println("i ="+ i);
       }
       
       
       
       
       
    }
}