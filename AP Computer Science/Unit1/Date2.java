package Unit1;

//LAB 2
public class Date2
{
    private int year;
    private int month;
    private int day;
    public Date2(int y,int m,int d)
    {
        year = y;
        month = m;
        day = d;
    }
    public Date2()
    {
        //don't actually need any code here 
        year = 0;
        month = 0;
        day = 0;
    }
    
    public int getY()
    {
        return year;
    }
    public int getM()
    {
        return month;
        
    }
    public int getD()
    {
        return day;
        
    }
    /**
     * toString
     * This method returns a String in the format of month / day / year
   	 * @return  String    	returns the fields in a formatted String
   	 */
    public String toString()
    {
        String s1="Years ="+year;
        String s2="Months = "+month;
        String s3="days = "+day;
        return s1+":"+s2+":"+s3;
        
    }
    /**
     * onBirthday
   	 * This method returns a Boolean to determine if the Dates have the same birthday  (day/month, not year)
  	 *  @param   	birthday       	Date parameter
  	 * @return    	boolean        	returns true or false if same day
     */ 
    public boolean onBirthday( Date2  birthday )
    {
        int month2 = 10;
        int day2 = 29;
        int year2 =2000;

        if((this.month == month2) && (this.day == day2))
        {
            return true;
        }
        else 
        {
          return false;
        }
    }
    
    /**
     * daysTill
     * This method finds the number of days between the date who called the method and the parameter
     * Note: You do not know which date is first
   	 * For simplicity assume 30 days per each month, 360 days a year and no leap years
     * @param    	d      	Date parameter to find the number of days between this and the date who called
     * @return int           	Returns the number of days between the dates
     */
    public int daysTill( Date2 d )
    {
        int yearToDays= this.year*360;
        int comparison1 = 360 -(yearToDays+ this.month*30)+this.day ; 
        int comparison2;
        if(comparison1<0)
        {
            comparison2 = (yearToDays+this.month*30 + this.day) - 360;
            return comparison2;
        }
        return comparison1; 
    }

}