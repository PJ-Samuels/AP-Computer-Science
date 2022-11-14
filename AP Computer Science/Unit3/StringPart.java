package Unit3;

public class StringPart
{
    private int s;
    private int l;
    
    public StringPart( int start , int length )
    {
        s = start;
        l = length;
    }
    
    public int getStart()
    {
        return s;
    }
    
    public int getLength()
    {
        return l;
    }
    
    public String toString()
    {
        return "start = " + s + "  length = " + l ;
    }
}