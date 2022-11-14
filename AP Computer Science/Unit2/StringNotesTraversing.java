package Unit2;
public class StringNotesTraversing
{
    public static void main()
    {
        String s1 = "Hello World";
        
        /**
         * This example will convert the case of all the letters in the String
         * uppercase will become lowercase and vise versa
         */
        for( int i = 0 ; i < s1.length() ; i++ )
        {
            String f = s1.substring( 0 , i ) ;      // 0 - i-1
            String m = s1.substring( i , i + 1 ) ;  // i - i
            String b = s1.substring( i + 1 );       // i+1 - end
            
            // manipulated the value of m
            // changed its capitalization
            
            if( m.equals( m.toUpperCase() ) )
                m = m.toLowerCase();
            else
                m = m.toUpperCase();
            s1 = f + m + b;
            // System.out.println( f + " " + m + " " + b );
            System.out.println(s1);
        }
        System.out.println("End: s1 = " + s1 );
        
        /**
         * This example will show the risks of adding in larger Strings
         */
        s1 = "abracadabra";
        for( int i = 0 ; i < s1.length() ; i++ )
        {
            String f = s1.substring( 0 , i ) ;      // 0 - i-1
            String m = s1.substring( i , i + 1 ) ;  // i - i
            String b = s1.substring( i + 1 );       // i+1 - end
            
            // everytime we find an "a", we will add in "abra"
            if( m.equals("a") )
            {
                m = "abra";
                // run with it commented out, and with it not
                //  so if i is 0, it now becomes 3.  The next loop increases
                //  i by 1 to 4.  So we start at index 4, this passes by
                //  all of the new "abra" we added
                i+=m.length() -1;
                /**
                 * since we added more letters, and we don't change i, this means
                 *  that it will look at the next index, which is now b, 
                 *  and a few steps latter it find the last a in "abra"
                 *  This causes an infinite loop
                 */
            }
            
            
            
            s1 = f + m + b;
            // System.out.println( f + " " + m + " " + b );
            System.out.println(s1);
        }
        System.out.println("End: s1 = " + s1 );
        
        
        
        s1 = "Mississippi";
        
        for( int i = 0 ; i < s1.length() ; i++ )
        {
            String f = s1.substring( 0 , i ) ;      // 0 - i-1
            String m = s1.substring( i , i + 1 ) ;  // i - i
            String b = s1.substring( i + 1 );       // i+1 - end
            // remove all s letters
            if( m.equals( "s" ) || m.equals("S") ) 
            {
                s1 = f + b;   
                // run with it commented out, and with it not
                i--;
                /**
                 *   Here I need an i--, otherwise I will skip letters
                 *   s1 = Mississippi
                 *   f = "Mi"
                 *   m = "s"
                 *   b = "sissippi"
                 *   s1 = f + b
                 *   so s1 = "Misissippi"
                 *            0123456....  
                 *   if I don't do i--, the next iteration will increase i to 3
                 *   so 
                 *   f = "Mis"    <-- see how I skipped that s
                 *   m = "i"
                 *   b = "ssippi"
                 */ 
                
            }
            else
                s1 = f + m + b;
            // System.out.println( f + " " + m + " " + b );
            System.out.println(s1);
        }
        System.out.println("End: s1 = " + s1 );
    }
}

