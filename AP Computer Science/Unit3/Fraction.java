package Unit3;

public class Fraction
{
    private int num;
    private int den;
    
    public Fraction()
    {
        num = 1;
        den = 1;
    }
    public Fraction( int d )
    {
        num = 1;
        den = d;
    }
    public Fraction( int n , int d)
    {
        num = n;
        den = d;
        simplify();
    }
    
    public int compareTo(Fraction f1)
    {
        return num*f1.den  - den * f1.num;
    }
    
    public String toString()
    {
        return  num + " / " + den ;
    }
    
    
    public double asDecimal()
    {
        return (double)num / den ;
    }
    
    public static Fraction multiplyTwo( Fraction f1 , Fraction f2 ) 
    {
        Fraction fm = new Fraction ( f1.num * f2.num , f1.den * f2.den );
        return fm;
    }
      
    
    private void simplify()
    {
        int gcf = gcf();
        num /= gcf;
        den /= gcf;
    }
    
    private int gcf()
    {
        int gcf = 1;
        
        for( int i = den ; i >= 2 ; i-- )
        {
            if( num%i == 0  && den%i == 0 )
            {
                gcf *= i;
                break;
            }
        }        
        return gcf;
    }
    
}