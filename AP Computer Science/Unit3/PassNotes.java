package Unit3;
public class PassNotes
{
    public static void main()//java is always pass by value
    {
        int x = 10;
        System.out.println("before method x = " +x);
        doStuff(x);
        System.out.println("after method x = "+x);
        
    }
    public static void doStuff(int x) //this x is different than the orginal x 
    {
        System.out.println("in method, start x = "+x);
        x = 20;
        System.out.println("in method, end x = "+x);
    }
}
