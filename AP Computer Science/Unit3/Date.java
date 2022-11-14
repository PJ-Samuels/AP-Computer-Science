package Unit3;


public class Date
{
  
    // 3 fields, ints, month, day, year

    // 2 constructors
    // no parameters, set all fields to 1 , 1 , 2000
    // 3 parameters, set all fields

    // 3 accessor methods
    private int month;
    private int day;
    private int year; 
    
    public Date()
    {
        month = 1;
        day = 1;
        year = 2000;
    }
    // if you send it 0 , days , 0 - it will correctly construct the date
    public Date(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y; 
        month += day / 30;
        day = day % 30;
        year += month/12;
        month %= 12;
    }
     
    
    /** 
    * toString
    * This method returns a String in the format of month / day / year
    * @return  String   returns the fields in a formatted String
    */
    public String toString()
    {
        return month + "/" + day + "/" + year;
    }
    
    /** 
    * daysTill
    * This method finds the number of days between the date who called the method and the parameter
    * Note: You do not know which date is first
    * For simplicity assume 30 days per each month and no leap years
     * @param    d   Date parameter to find the number of days between this and the date who called
    * @return int       Returns the number of days between the dates
    */
    public int daysTill( Date d )
    {
      int thisDays = (month * 30) + (year * 360) + day;
      int dDays = (d.month * 30) + (d.year * 360) + d.day;
      return Math.abs( thisDays - dDays );
    }
    public int compareTo( Date d )
    {
      int thisDays = (month * 30) + (year * 360) + day;
      int dDays = (d.month * 30) + (d.year * 360) + d.day;
      return thisDays - dDays;
    }
    
    
    
    
    
    
    
}