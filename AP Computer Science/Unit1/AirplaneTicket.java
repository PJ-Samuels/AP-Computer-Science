package Unit1;
public class AirplaneTicket
{
    private Date dDate = new Date(9,10,17);
    private Date aDate = new Date(9,10,17);
    private Time dTime = new Time(8,30, 10);
    private Time aTime = new Time(18, 30, 10);
    private double cost;
    
    // 5 fields, Date and Time of departure, Date and Time of Arrival.  Cost (double)
    // 1 constructor
    // 5 parameters, set all fields
    // Note: Don’t stress about making sure the Date/Time of departure is before Date/Time of arrival
    //          Just make sure when you construct them in the client, that it is true
    public AirplaneTicket(Date departureD, Date arrivalD,Time departureT,Time arrivalT, double c)
    {
        dDate = departureD;
        aDate = arrivalD;
        dTime = departureT;
        aTime = arrivalT;
        cost = c;
        
    }
    //accessor methods
    public Date getADate()
    {
        return aDate;
    } 
    public Date getDDate()
    {
        return dDate;
    }
    public Time getATime()
    {
        return aTime;
    }
    public Time getDTime()
    {
        return dTime;
    }
    public double c()
    {
        return cost;
    }
    /**
     * 
     * toString
     * This method returns a String in the format below on separate lines
     * Departure Time / Date
     * Arrival Time / Date
     * Cost
     * @return  String       returns the fields in a formatted String
     */
    public String toString()
    {
        String s1 = "depature = "+dTime+"/"+dDate;
        String s2 = "Arrival = "+aTime+"/"+aDate;
        String s3 = "cost ="+cost;
        return s1 +"\n" +s2 +"\n"+ s3;
    }
 
    // returns the total flight time of the trip
    //mutator methods
    
    /**
     * totalFlightTime
     * the method find the time between the arrival of a flight and depature of a flight
     * @return      Time        The time is the difference of the depature and arrival of one flight
     */
    public Time totalFlightTime( )
    {
        Time totalTime;
        double totalTimeInSeconds = 0;
        if(aDate.onBirthdate(dDate))
        {
            totalTime = dTime.timeTill(aTime);
            return totalTime;
        }
        if ( aDate.getDay() > dDate.getDay())
        {
            totalTimeInSeconds =  24*3600 - ((dTime.timeInSeconds()-aTime.timeInSeconds()) + dTime.timeInSeconds());
        }
        int hours = (int)totalTimeInSeconds/3600;
        int timeMR = (int)totalTimeInSeconds%3600;//minute remainders
        int minutes = timeMR/60;
        int seconds = timeMR%60;
        totalTime = new Time(hours,minutes,seconds);
        return totalTime; 
    }
    // returns the layover time of the trip from one ticket to the next
    // Time between arrival of a1 and departure of a2
    /**
     * layoverTime
     * the method take the arrival time of one flight and the depture time of another and finds the layover time between both flights
     * @return      Time        the method returns the difference in time between the two flights
     */
    public static Time layoverTime( AirplaneTicket a1 , AirplaneTicket a2 )
    {
        Time totalTime;
        if(a1.getADate().onBirthdate(a2.getDDate()))
        {
            return a1.getATime().timeTill( a2.getDTime());
        }     
        int timeDifference = (24*3600 - a1.getATime().timeInSeconds() + a2.getDTime().timeInSeconds()); 
        int hours = (int)timeDifference/3600;
        int timeMR = (int)timeDifference%3600;
        int minutes = timeMR/60;
        int seconds = timeMR%60;
        totalTime = new Time(hours,minutes,seconds); 
        return totalTime;
    }   
}