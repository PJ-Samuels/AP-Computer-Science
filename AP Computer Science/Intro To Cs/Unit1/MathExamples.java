package Unit1;

public class MathExamples
{
    public static void main ()
    {
        double a = 5;
        double b = 3;
        
        double c = Math.pow(a,b);//c = a^b
        System.out.println("c = " + c);
        /** 
         * can use any math if call Math.(something)
         *  need to know 
         *      Math.methodName
         *      Double = Math.pow
         *      Double = Mathe.sqrt
         *      
         */
        System.out.println ("six to the power of four =" + Math.pow (6,4));
      
        System.out.println ("square root of 2 = " + Math.sqrt(2));
        
        double d = Math.sqrt ( 17.8);
        a = 4;
        b = 6;
        c = 3;
        double s1 = (-b + Math.sqrt( Math.pow (b ,2) - 4*a *c))/(2*a);
        System.out.println(s1);

        
     }
}
