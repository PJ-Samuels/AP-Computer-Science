package Unit1;

/**
 * This class is used to demonstrate the ideas of Classes
 * 
 */
public class ClassExample
{
    //remember classes have data and behavior
    //data is the field (instance variables)
    //behavior is the methods
    
    
    //fields
    private int x;
    private double a;
    private String s;
    
    //the constructor is used to construct an instance of the class
    //we can have as many constructors as we desire as long 
    //  as each constructor has different parameters
    
    
    public ClassExample()  //constructors are alwasy the same name
    {                       // as the class

    }
    
    public ClassExample( int x1)
    {
        x = x1;
        a = 1;
        s = "stuff";
    }
           
    public ClassExample(int x1, double a1)
    {
        x = x1;
        a = a1;
        s = "bob";
    }
    
    public ClassExample ( ClassExample ce )
    {
        
    }
    
    //behavior
    //first thing we are going to write is th accssor methods
    //remember accessor methods allow other classes access to the 
    //private field of data
    
    //axccessor methods
    //They are always something like "get" or "my" name of the field 
    
    public int getX()
    {
        return x;
        
    }
    
    public double myA()
    {
        return a;
    }
    //returns data
    //you dont always have to write accessor methods for all fields 
    //you have to ask yourself , is this something another class needs access to
    
    public void doStuff (int q) 
    {
        x += q;
    }
    
    public String toString ()
    {
        String s1 = "x = " + x;
        String s2 = "a = " + a;
        String s3 = "s = " + s;
        return s1 + "\n" + s2 + "\n" +s3+ "\n";
    }
    
    
    
    
    
}

