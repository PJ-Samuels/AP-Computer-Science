package Unit1;
//Lab 5
public class Point
{
    //fields
    private double x;
    private double y;
    //Constructor methods
    public Point()
    {
        x = 0;
        y = 0;
    }
    public Point(double x1, double y1)
    {
        x = x1;
        y = y1;
    }
    //accessor methods
    public double getX1()
    {
        return x;
    }
    public double getY1()
    {
        return y;
    }
    /**
     * toString
     * This method returns a String in the format of x , y
     * @return   String      returns the fields in a formatted String
     */
    public String toString()
    {
        String s1 = "" + x;
        String s2 = ""+ y;
        return s1+","+s2;
        
    }
    //mutator method 
    /**
     * Point midpoint
     * This method finds the midpoint between two points 
     * @return      Point      returns the midpoint of the two points 
     */
    public Point midpoint( double x2, double y2 )
    {
        double midpointX;
        double midpointY;
        if (x2 > this.x)
        {
            midpointX = (x2 - this.x)/2 + x2;
            midpointY = (y2 - this.y)/2 + y2;
        }
        else
        {
            midpointX = (this.x - x2)/2 + this.x;
            midpointY = (this.y - y2)/2 + this.y;
            
        }
        
        return new Point( midpointX ,midpointY );
    }
    /**
     * compareTo
     * This will compare how far to points are away from the origin on the x axis 
     * @return      int     will return the distance from the x axis on the origin
     */
    public int compareTo( Point p)
    {
        ///will compare how far away they are from 0 on the x axis
        Point z = new Point(0,0);
        int newX = (int)p.x;
        int zX = (int)z.x;
        int importX = (int)this.x;
        int newValue;
        int newValue2;
        //point 1 comparison to the x axis
        if(p.x > z.x )
        {
            newValue  = newX - zX; 
            
        }
        else
        {
            newValue  = zX - newX;
            
        }
        //point 2 comparison to the x axis
        if(this.x > z.x )
        {
            newValue2 = importX - zX;
            
        }
        else
        {
            newValue2 = zX - importX;
        }
        // see which value is value is closer to 0
        if (Math.abs(newValue)> Math.abs(newValue2))
        {
            return newValue;
        }
        else if(Math.abs(newValue2)> Math.abs(newValue))
        {
            return newValue2;
            
        }
        else
        {
            int newValueZ = 0;
            return newValueZ;
        }
    }
    /**
     * distance
     * this method returns the distance between two points 
     * @return      double      is the distance value between the two points
     */
    public static double distance( Point p1 ,Point p2)
    {
        double newX = p1.x;
        double newY = p1.y;
        double newX2 = p2.x ;
        double newY2 = p2.y;
        double finalX;
        double finalY;
        if (newX > newX2)
        {
            finalX = newX - newX2;
            finalY = newY - newY2;
        }
        else
        {
            finalX = newX2-newX;
            finalY = newY2 - newY;
        }
        return Math.sqrt(Math.pow(finalX,2)+ Math.pow(finalY,2));
    }
    /**
     * slope
     * this method returns the slope of the equation between two points
     * @return      Fraction        this will return the y value as of the distance between the point as 
     *                              the numerator and the and the distance between the x values in the as the denominator
     */
    public static Fraction slope( Point p1, Point p2 )
    {
        // remember to cast the double fields to int
        double pointX = p1.x-p2.x;
        double pointY= p1.y-p2.y;
        Fraction slope = new Fraction((int)pointY,(int)pointX);
        
        return slope;
    }
    
}