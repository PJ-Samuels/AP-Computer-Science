package Unit3;
import java.util.*;
public class Lab14
{
    // instance variables - replace the example below with your own
    // create an array of length, using the xRange and yRange
    public static Point[]  randomPoints(  int length , int xRange , int yRange )//for each value inside of the loop
    {
        Point arr[] = new Point[length];
        double x;
        double y;
        for(int i = 0; i < arr.length; i++)
        {
            x = (int)(Math.random()*xRange + 0);
            y = (int)(Math.random()*yRange + 0);
            arr[i] = new Point(x,y);
        }
        return arr;
    }
    
    // receives an array of Points, and returns new array that is length one smaller, that contains all the midpoints. 
    public static Point[]  midpoints( Point[]  arr )
    {
        Point arrp[] = new Point[arr.length-1];
        for(int i = 0; i < arr.length-1; i++)
        {
            arrp[i]=arr[i].midpoint(arr[i+1]);
            
        }
        return arrp;
    }
        // returns an array of randomDates on length given by parameter
    public static Date[] randomDates( int length )
    {
        Date arr[] = new Date[length];
        int month;
        int day;
        int year;
        for(int i = 0; i< arr.length; i++)
        {
            month = (int)(Math.random()*12+1);
            day = (int)(Math.random()*30+1);
            year = (int)(Math.random()*2018+2000);
            
            arr[i] = new Date(month,day,year);
        }
        return arr;
    }
    // sorts an array of Dates
    public static void sortDates( Date[]  arr )
    {       
        Date temp; 
        for(int j = 0 ; j < arr.length-1; j++)
        {
            for(int i = 0; i < arr.length-1;i++)
            {
                if(arr[i].compareTo(arr[i+1]) > 0)
                {     
                      temp = arr[i+1];
                      arr[i+1] = arr[i];
                      arr[i] = temp;
                }
            
            }       
        }
        
        System.out.println(Arrays.toString(arr));
    }
 
    // create a second Date array that is length one smaller, that contains Dates that represent the difference between
    // the two Dates.
    public static Date[]  datesBetween( Date[]  arr )
    {
        int temp;
        Date arr2[] = new Date[arr.length-1];
        for(int i = 0; i < arr.length-1; i++)
        {
            temp = arr[i].daysTill(arr[i+1]);
            arr2[i]= new Date(0,temp,0);
            
        }
        return arr2;
    }
}
