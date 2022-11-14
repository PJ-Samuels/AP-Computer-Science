package Unit2;

import Unit1.Fraction;
import java.util.Scanner;

public class IfNotesContinued
{
    public static void main()
    {
        
        /**
         * You must breifly comment your if statement
         *  describe what happens for each scenario of an if statement
         * 
         *   if( condition ) 
         *   
         *   if statements run only the next line of code unless you have braces
         *   
         *   if( condition )
         *       code;
         *       
         *   if( condition ) 
         *   {
         *      code;
         *      code;
         *   }
         *   
         *   
         *   if( condition ) 
         *      if( condition ) 
         *          if( condition ) 
         *              code;      <--- technically all a single line of code
         *          else
         *              code;
         *      
         *      
         *   if( condition )
         *   {
         *      code;
         *      code;
         *   }
         *   else
         *      code;
         *     
         *   if( condition )
         *      code;
         *   else
         *   {
         *      code;
         *      code;
         *   }
         *   
         *   
         *   if( c1 )
         *      code <-- runs only if c1 is true (c2 true/false is unimportant)
         *   else if( c2 )
         *      code <-- runs only if c1 is false and c2 is true
         *   else
         *      code <-- runs only if c1 is false and c2 is false
         *      
         *   Note: We can have as many else ifs as we so desire   
         *   
         *   
         *   
         *   if( c1 )
         *   {
         *       code
         *       if( c2 )    
         *       {
         *           code
         *       }
         *       code
         *   }
         *   else
         *   {
         *       code
         *       if( c3 )    
         *       {
         *           code
         *           if( c4 )
         *              code
         *           code   
         *       }
         *       code
         *   }
         *   
         *   
         *   ? operator works like an if statement
         *   
         *   int x = y > 10 ?  5 : 10;
         *   
         *   int x ;
         *   
         *   if( y > 10 ) 
         *      x = 5;
         *   else
         *      x = 10;
         *      
         *     
         */  
        
        Scanner in = new Scanner( System.in );
        double total = 1;
        System.out.println("Enter quarters");
        
        if( in.hasNextInt() )
        {
            int quarters = in.nextInt();
            total = total + quarters * 0.25 ;
            System.out.println("total: " + total );
        }
        else
            System.out.println("Error");
        
        
            
        // floating point arithmetic 
        double z = Math.sqrt( 2 );
        System.out.println( z ) ;
        System.out.println( z * z ) ;
        if( z * z == 2.0 ) 
            System.out.println( "z*z = 2" ) ;
            
        if( Math.abs( z*z - 2.0 ) < 0.000000001 ) 
            System.out.println( "The same");    
            
            
        
        
        int temp = (int)(Math.random()*131 - 15);  // random # -15 to 115
        System.out.println("Temp = " + temp );
        
        // based on the value of the temp, print out a word describing it
        if( temp >= 100 ) 
            System.out.println("boiling");
        else if ( temp >= 80 )
            System.out.println("hot");
        else if ( temp >= 50 )
            System.out.println("warm");
        else if ( temp >= 20 )
            System.out.println("Cool");
        else if ( temp > 0 )
            System.out.println("Cold");    
        else 
            System.out.println("Freezing");
            
            
        // based on the value of the temp, print out a word describing it  
        if( temp >= 50 ) 
            if( temp >= 80 ) 
                if( temp >= 100 ) 
                    System.out.println("boiling");
                else
                    System.out.println("hot");
            else
                System.out.println("warm");
        else
            if( temp > 0 )
                if( temp >= 20 )
                    System.out.println("Cool");
                else
                    System.out.println("Cold");
            else
                System.out.println("Freezing");

            
        /**
         * comparing objects
         *   Remember we already discovered that we can't use the == to compare
         *     objects, as that sees if they are the same object, not if
         *     they have the same values     
         */ 
        
        Fraction f1 = new Fraction( 2 , 3 ) ;
        Fraction f2 = new Fraction( 2 , 3 ) ;
         
        // print out if they are the same object
        if( f1 == f2 )
            System.out.println("same");
        else
            System.out.println("different");
            
            
        /** 
         * To compare objects instead we need to use methods from the object
         *   to see if their values are the same
         * This is part of the reason why we write compareTo methods
         *   we will see the other part of the reason in Unit 5
         *   
         * Remember the compareTo method will return 0 if they are the same
         *   positive if f1 is after f2
         *   negative if f1 is before f2
         *   
         * The easiest way to think about the negative and positive numbers
         * imagine f1 is 5
         * imagine f2 is 2
         * f1.compareTo(f2) --> think as f1 - f2.  So 5 - 2 = 3
         *      positive, thus f1 is after f2
         *  
         * imagine f1 is 3
         * imagine f2 is 10
         * f1.compareTo(f2) --> think as f1 - f2.  So 3 - 10 = -7
         *      negative, thus f1 is before f2 
         */    
        
        // print out if the objects have the same value
        if( f1.compareTo(f2) == 0 )
            System.out.println("same");
        else
            System.out.println("different");
    }
}
