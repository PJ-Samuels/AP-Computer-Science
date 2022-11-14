package Unit1;

public class StaticVsNonStatic
{
    // static vs non-static
    // private methods
    // black box
    // encapsulation
    
    /**
     * non-static
     * This means its owned by the object
     * We call methods from the object
     * by default everything is non-static
     * 
     * static 
     * This means its owned by the Class
     * objects can not call static methods (sort of)
     * Since its owned by the class there exists only one (method / field)
     */
    
    
    // fields
    
    private int x;
    private static int y;
    
    // if a field is public, it should be staitc (and potentcially final )
    public final static int Z = 10; // remember its cap beause its final 
    
    //final goes before static
    
    
    public StaticVsNonStatic( int a , int b )
    {
        x = a;
        y = b;
        
        // inside a constructor we can access both static and non-static fields
    }
    
    // non-static method
    public int doStuff( int a )
    {
        int x = 10;
        //if I try to use x ,its uses that variable
        //if I want to access my field x, I nowneed to say this.x
        
        // when inside a non-static method, you can access non-static and static
        // fields 
        // but be careful since we have access
        
        // we can show static and non-static ownership
        // use this. to show its owned by the object(non - static)
        // use Class. to show its owned by the Class(Static)
        
        return a + this.x + StaticVsNonStatic.y;
    }
    
    // static method
    public static int doStuff( StaticVsNonStatic svns )
    {
        // return y + x; - error, x is non-static, owned by an object
        
        // this doesn't work, because there is no object
        
        // can not in any way use this. in a static method
        
        return StaticVsNonStatic.y + svns.x ;
    }
    
    //nonstaticc accessor method
    public int getX()
    {
        return x;
    }
    //static accessor method 
    public static int getY()
    {
        return y;
    }
    
    // works fine, but since the field is static, the static accessor method is
    // the prefered implementation
    public int getYNS() 
    {
        return y;
    }
    

}
