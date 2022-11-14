package Unit1;
public class Fraction
{
    //fields
    private int numerator;
    private int denominator;
    //construuctor methods
    public Fraction()
    {
        numerator = 1;
        denominator = 1;
    }
    public Fraction(int d)
    {
        numerator = 1;
        denominator = d;
    }
    public Fraction(int n, int d)
    {
        numerator = n;
        denominator = d;
    }
    //accessor methods
    public int getN()
    {
        return numerator;
    }
    public int getD()
    {
        return denominator;
    }
    
    /**
     * toString
     * This method returns a String in the format of numerator/denominator
     * @return  String      returns the fields in a formatted String
     */
    public String toString()
    {
        String s1 = "" + numerator;
        String s2 = ""+ denominator;
        return s1+"/"+s2;
    }
    //mutator methods
    /**
     * asDecimal
     * this method returns a double that is the decimal form of the fraction input
     * @return      double      returns the decimal form of the fraction
     */
    public double asDecimal()
    {
        double newValue;
        newValue = ((double)numerator/(double)denominator);
        return newValue;
    }
    /**
     * multiplyTwo
     * This method multiplies both input fractions (numerator *numerator and denominator*denominator)
     * @return      Fraction    returns the new fraction made by the multpilied numerators and denominators
     */
    public static Fraction multiplyTwo( Fraction f1 , Fraction f2 )
    {
        int newNumerator =  f1.numerator*f2.numerator;
        int newDenominator = f1.denominator*f2.denominator;
        Fraction f3 = new Fraction(newNumerator, newDenominator);
        return f3; 
        
    }
    /**
     * mutator method
     * lets increase the num by x
     * 
     */
    public void add(int x)
    {
        numerator+=x;
    }
    /**
     * compareTo
     * this method multiplies each fraction by the denominator of the other than subtracts the value from eachother
     * @return      int     this will return the result of subtracting the new frations from eachother
     */
    public int compareTo(Fraction f)
    {
        int f1ValueN = f.numerator*this.denominator;
        int f1ValueD = f.denominator*this.denominator;
        int f2ValueN = this.numerator*f.denominator;
        int f2ValueD = this.denominator*f.denominator;
        
        if(f1ValueN == f2ValueN)
        {
            return 0;
        }
        else
        {
            return f1ValueN - f2ValueN;
        }
    }
    /**
     * largestFraction
     * this method will use the compareTo method to figure out which one of the fractions is larger thatn the other
     * @return      int     it will return the fraction value that it finds to be the largest
     */
    public static Fraction largestFraction( Fraction f1, Fraction f2 )
    {
        int fcompare = f1.compareTo(f2);
        if (fcompare>0)
        {
            return f1; 
        }
        else if (fcompare < 0)

        {
            return f2;
        }
        else
        {
            return f1;
        }
    }
}
