package Unit1;
public class ClientAirplaneTicket
{
    public static void main()
    {
        Time t1 = new Time(3,30,0);
        Time t2 = new Time(10,0,0);
        Date d1 = new Date(10,10,2017);
        Date d2 = new Date(10,10,2017);
        AirplaneTicket at = new AirplaneTicket(d1,d2,t1,t2, 1000);
        System.out.println(at);
        System.out.println(at.totalFlightTime());
        Time t3 = new Time(14,30,15);
        Time t4 = new Time(20,0,0);
        Date d3 = new Date(10,29,2017);
        Date d4 = new Date(10,29,2017);
        AirplaneTicket at2 = new AirplaneTicket(d3,d4,t3,t4,2500);
        System.out.println(AirplaneTicket.layoverTime(at,at2));
        
    }
}