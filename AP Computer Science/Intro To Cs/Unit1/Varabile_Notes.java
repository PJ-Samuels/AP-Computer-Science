package Unit1;

import java.util.*;

public class Varabile_Notes
{
    public static void main()
    {
        /**
        *this is a comment
        *the lash and star allow me to make sections of comments 
        *everything in here is a comment
        *
        *primitive data types 
        * - this is a way for the computer to store data
        * - there are a number of different primitive data types
        * int - stores a single whole number
        * double - stores a single numer that can have decimals
        * boolean - stores true/false
        * char - stores a simple letter
        * 
        * 
        * first we have o declare the variable, and then we intialize the variable
        * 
        * to delcare avariable, you give its type and a name 
        * 
        */
       
        int x; 
        // to initializa it, I have to assiagin it a value
        x = 5;    //the equal sign is an assignment
                //I am assigning the value 5 to x
       
        System.out.println( x ); //notice no quotes
                                 // this means its prints the value of x
        //we can initialize and declare at the same time
        int y = 10;
        
        //we can assign to any variable pretty much anything 
        x = y + 3; // x will be equal to 13
        
        //+ - * / but ^ doesn't work 
        
        y = x * 5 + 3 -(y + 1 ); //x = 13, y = 10
        
        System.out.println( y ); 
        
        /**
         * Naming conventions
         * 
         * variables- the name should represent what the data is for 
         * 
         *      -this may mean that you have multiple words
         *      -the first word always starts lower case
         *      -second and additional words always start uppercase
         * 
         * thisvariablenameisbad
         * 
         * THISVARIABLENAMEISBAD
         * 
         * thisVariableNameIsGood
         * 
         * 
         * Class naming convention
         *      -follows the same rules but the first word starts capitalized 
         * 
         * 
         * 
         */
        
        
        
    }
}
