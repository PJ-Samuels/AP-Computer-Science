package Unit1;
//for lab
public class Time
{
    private int hours;
    private int minutes;
    private int seconds;
    
    public Time()
    {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }
    
    public Time( int h , int m , int s )
    {
        hours = Math.abs(h) ;
        minutes = m;
        if( minutes >= 60 ) 
        {
            hours += minutes / 60;
            minutes %= 60;
        }        
        seconds = s;
    }
    
    public int getHours()
    {
        return hours;
    }
    public int getMinutes()
    {
        return minutes;
    }
    public int getSeconds()
    {
        return seconds;
    }
    
    public String toString()
    {
        return hours + ":" + minutes + ":" + seconds ;
    }
    
    public int timeInSeconds()
    {
        return hours * 3600 + minutes * 60 + seconds ;
        
        /*
         * int s = hours * 3600;
         * s += minutes * 60 ;
         * s += seconds;
         * return s;
         */
    }
    
    public int compareTo( Time t )
    {       
        return this.timeInSeconds() - t.timeInSeconds();
    }
    //takes difference in time
    public Time timeTill( Time t )
    {
        int h , m , s;
        if( this.hours > t.hours )
        {
            Time t1 = new Time( t.hours + 24 , t.minutes , t.seconds );
            s =  t1.compareTo( this );
        }
        else
            s =  t.compareTo( this );
        h = s / 3600;
        s -= h*3600;
        m = s / 60;
        s -= m*60;
        return new Time( h , m , s );
    }
  
}
