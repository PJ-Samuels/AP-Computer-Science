package Unit1;
public class ClientFraction
{
    public static void main()
    
    {
        //constructors
        Fraction f1 = new Fraction(4,2);
        System.out.println(f1);
        Fraction f2 = new Fraction();
        System.out.println(f2);
        //accessor methods
        int numerator = f1.getN();
        System.out.println("Numerator = "+ f1.getN());
        int denominator = f1.getD();
        System.out.println("Denominator = "+ f1.getD());
        
        int numerator2 = f2.getN();
        System.out.println("Numerator = "+ f2.getN());
        int denominator2 = f2.getD();
        System.out.println("Denominator = "+ f2.getD());
        //mutator methods
        System.out.println("decimal = "+ f1.asDecimal());
        Fraction f = new Fraction(5,7);
        int check = f.compareTo(f1);

        if(check>0)
        {
            System.out.println("the second fraction is larger");
        }
        else if (check<0)
        {
            System.out.println("the first is larger");
        }
        else
            System.out.println("they are both the same");
            
        Fraction returnF = Fraction.largestFraction(f1,f2);
        System.out.println("Largest Fraction = " + returnF.toString());
        
        System.out.println("decimal = "+ f1.asDecimal());
        Fraction f4 = new Fraction(5,7);
        int check2 = f.compareTo(f4);

        if(check2>0)
        {
            System.out.println("the second fraction is larger");
        }
        else if (check2<0)
        {
            System.out.println("the first is larger");
        }
        else
            System.out.println("they are both the same");
        Fraction returnF2 = Fraction.largestFraction(f1,f2);
        System.out.println("Largest Fraction = " + returnF2.toString());
    }
    
}
