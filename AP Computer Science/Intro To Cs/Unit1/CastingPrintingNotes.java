package Unit1;


public class CastingPrintingNotes
{ 
    public static void main ()
    {
    /** 
     * casting is forcing one data type into another
     * 
     * ints and doubles
     * 2^32     2^64
     * 
     * two types of casting
     * 
     * impicit - casting up 
     *  - going from an int to a double 
     *  double x = 1009; 1009 - is a int, it is autonomatically cast up to a double
     *  
     * explicit - casting down
     *  - we have to force the data from a larger toa a smaller daat type
     *  (data type) 
     *  int y = (int) (10.5);
     */ 
     double x = 1009;
     int y = (int)10.5 ;
      
     
     // int / int = int
     // 5 / 2 = 2
     
     int a = 5;
     int b = 2;
     
     System.out.println(a/b);//2
     
     double c = a; //impicitly cast a toa double
     System.out.println( c / b); //2.5 double/int = double
     System.out.println( ((double)a)/ b); //this cast thes value of a to a double
     
     // we know 5/2 = 2
     System.out.println(a / (double)b );
     //division doesn't go before casting
     //compound assigments (aka compound operators)
     a = 10;
     // a = a + 2.5; - doen't work, can't store double into an int
     a += 2.5; //a = a + (int)(2.5) ;
     

     System.out.print ("a = ");
     System.out.println( a) ; //a = 5


	 System.out.println("a = " + a); //a = 12
	 //here the + is use as concatenation
     //what it is doing is putting the two Strings togethor
     //the value of a a is implicitly cast toa string
	 //a=12
	 System.out.println(5 + 7);
	 System.out.println("5 + 7 = " +(5+7));
	 System.out.println( 5+7+ " is 5 + 7");

	 System.out.println("(" + a +"," + b + ")");// (a,b)
    }
}
