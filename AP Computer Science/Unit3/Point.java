package Unit3;
import java.util.*;
public class Point
{
    
    private double x;
    private double y;
    
    public Point()
    {
        x = 0;
        y = 0;
    }
    public Point( double xValue , double yValue )
    {
        x = xValue;
        y = yValue;
    }
    
    public String toString()
    {
        return "( " + x + " , " + y + " )";
    }
    
    
    public Point midpoint( Point p )
    {
        // we have access to the data of the object that called the method
        double xm, ym;
        xm = ( this.x + p.x ) / 2;
        ym = ( this.y + p.y ) / 2;
        
        Point pm = new Point( xm, ym );
        return pm;        
    }
        
    public static double distance( Point p1 , Point p2 ) 
    {
        double d;
        d = Math.sqrt( Math.pow( p1.x-p2.x , 2 ) + Math.pow( p1.y-p2.y , 2 ) ) ;
        return d;        
    }
    
    
    public static Fraction slope( Point p1 , Point p2 )
    {
        return new Fraction( (int)(p1.y - p2.y) , (int)(p1.x - p2.x) );
    }
    
}