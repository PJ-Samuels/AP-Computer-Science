package Unit1;
public class ClientDate2
{
    public static void main()
    {
        Date2 d1 = new Date2(2000,10,29);
        System.out.println(d1);

        int year = d1.getY();
        System.out.println("years = "+ d1.getY());
        int month = d1.getM();
        System.out.println("Months ="+ d1.getM());
        int day = d1.getD();
        System.out.println("days ="+ d1.getD());
        
        Date2 d2 = new Date2();
        System.out.println(d2);
        year = d2.getY();
        System.out.println("years = "+ d2.getY());
        month = d2.getM();
        System.out.println("Months ="+ d2.getM());
        day = d2.getD();
        System.out.println("days ="+ d2.getD());
    }
    
}
