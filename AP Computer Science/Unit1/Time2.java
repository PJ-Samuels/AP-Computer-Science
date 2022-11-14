package Unit1;
/**
 * PJ Samuels 
 *///LAB 1
public class Time2
{
    private int seconds ;
    private int minutes;
    private int hours;
    public Time2(int m,int p, int h )
    {
        seconds = p;
        minutes = m;
        hours = Math.abs(h);
        if ( minutes>= 60)
        {
            hours+= minutes/ 60;
            minutes %= 60;
        
        }
    }
    
    public Time2()
    {
        seconds = 00;
        minutes = 00;
        hours = 00;
    }
    
    public int getH()
    {
        return hours;
    }
    public int getM()
    {
        return minutes;
    }
    public int getP() 
    {
        return seconds;
    }
    
    /**
     * toString
     * This method returns a String in the format of hour:minute:second
     * @return  String      returns the fields in a formatted String
     */
    public String toString()
    {
        String s3 = hours+"";
        String s2 = minutes+"";
        String s1 = seconds+"";
        return s3 +":"+ s2+":"+s1;

        
    }
    /**
    * timeInSeconds
    * This method converts the Time object into an int of seconds
    * @return int               Returns the fields all converted into seconds
    */
    public int timeInSeconds()
    {
        return hours * 3600 + minutes*60 + seconds;
    }
    /**
     * compareTo
     * This method compares the Time object that called the method to the Time object parameter
     * @param       t           This is a Time object
     * @return      int     negative means the object that called the method is before the parameter
     * positive means the object that called the method is after the parameter
     * zero means the object and the parameter are the same time
     */
     public int compareTo( Time2 t )
    {
        int comparison = this.timeInSeconds() - t.timeInSeconds();
        return comparison;
    }
    ///////Static notes
   
    /**
     * Static means that its owned by the class not an object
     * non static means that its owned by an indiviual object
     * to this point , everything besides main was non-static
     * 
     * Static - there is only one 
     * 
     * a final static fieled might be public
     * 
     * Methods can be static - generally speaking, you want to pass objects to these methods
     * Client - call methods by saying ClassName.method()
     *        - Time.method()
     * 
     */
     public static int compareTo( Time2 t1, Time2 t2 )
     {
         //hello world 
         return 0;
                  
     }
}

