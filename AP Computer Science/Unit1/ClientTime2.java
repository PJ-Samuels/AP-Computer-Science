package Unit1;
public class ClientTime2
{
    public static void main()
    {
        Time2 t1  = new Time2(12,49,22);
        System.out.println(t1);
        Time2 t2 = new Time2();
        System.out.println(t2);
        int seconds = t1.getP();
        System.out.println("Seconds = " + t1.getP());
        int minutes= t1.getM();
        System.out.println("Minutes = " + t1.getM());
        int hours =t1.getH();
        System.out.println("Hours = " + t1.getH());
        System.out.println(t1.compareTo(t2));
    }
}

