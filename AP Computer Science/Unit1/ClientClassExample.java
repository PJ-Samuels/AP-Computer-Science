package Unit1;

/**
 * description of what this is going to be used for 
 * test how ClassExample objects work
 * 
 */
public class ClientClassExample
{
    public static void main()
    {
        //when I say new - this is constructing a new object 
        //class example this is calling the constructor
        //ce1 is the object
        ClassExample ce1 = new ClassExample();        
        System.out.println(ce1);

        ClassExample ce2 = new ClassExample(23);
        System.out.println(ce2);
        
        int x = 5;
        ClassExample ce3 = new ClassExample(x);
        System.out.println(ce3);
        
        ClassExample ce4 = new ClassExample(12, 3.14159);
        System.out.println(ce4);
        
        // to call a method , wemust say teh object name . method 
        ce4.doStuff(5);
        System.out.println(ce4);
        
        
    }   
}