package Unit2;
public class StringNotes
{
    public static void main()
    {
        char c2 ='h';
        c2 +=1;
        System.out.println("c2 = " + c2);
        /**
         * Strings are objects, which means they have fields and methods
         * 
         * Strings are immutable, which means I can't change them
         * - there are not mutator methods in the String class
         */
        String s1 = new String();
        String s2 = new String("Hello");
        String s3 = "Hello";
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        s3 = "World";
        System.out.println("s3 = "+ s3);
        
        String s4 = s3;     // What happens here?
        if(s4 ==s3)
            System.out.println("s4 = s3 The same");
        if(s4 == "World")
            System.out.println("s4 = World The same");
        
            
        /**
         * we need to think of String in the same way we think of an array 
         *  by that I mean we need to think about each individual character
         *  as being in an array 
         *  
         * String s1 = "hello"
         *              01234
         */   
        
        System.out.println("s4 = " + s4 + " char at index 3 = " + s4.charAt(3));
        
        /**
         * compareToIgnoreCase = compares the Strings lexographically
         * s3 = 5
         * s4 = 2
         * s3.compareTo(s4) <-- 5 - 2 = 3
         * ASCII
         */
        s3 = "an";
        s4 = "ant";  
        System.out.println(s3.compareToIgnoreCase(s4));
        
        /**
         * indexOf - returns the index of the first occurence of a char or string
         * - there are mutliple different methods with this same name
         * 
         * 
         */
        s1 = "Hello world";
        System.out.println("index of 1 = " + s1.indexOf('l'));
        System.out.println("index of 1 = " + s1.indexOf("l"));
        System.out.println("index of 1 = " + s1.indexOf("lo"));
        System.out.println("index of 1 = " + s1.indexOf("Jake")); //if its not there it will print -1
        
        //remeber Strings are immutable
        s1 = s1.toLowerCase();
        int x = s1.toLowerCase().indexOf("hell");
        
        //we can also use indexOf to start someplace n the String
        System.out.println("index of 1 = " + s1.indexOf("l" , 4));
        
        //let print out every index of an "1" inside "Hello World"
        
        s1 = "Hello world";
        int i = -1;
        while(s1.indexOf("l", i )!= -1)
        {
            i = s1.indexOf("l", i );
            System.out.println("l is at Index " + i);
            i++;
        }
        // i = every index of "1"
        //this runs only a handful og times
        //i = 2,3,9
        s1 = "Hello World";
        for(i = s1.indexOf("l" , 0);i != -1 && s1.indexOf("l" , i) != -1 ; i = s1.indexOf("l" , i+1))
        {
            System.out.println("l is at index "+ i);
        }
        //lets traverse a String
        s1 = "Hello World";
        for( i = 0; i < s1.length(); i++)
        {
            char c = s1.charAt(i);
            System.out.print(c + " "); 
        }
        
        s1 = "Hello World";
        for( i = 0; i < s1.length(); i++)
        {
            /**
             * substring(x) - gets all the characters from the index to the end of the String
             *                   returns a string
             * subtring(x,y) - gets all the characters from x to y (index)
             *                 inclusive of x
             *                 inclusive of y
             *                 returns a String
             *Substring(5,10) - returns a String, index 5-9
             */
            String f = s1.substring(0,i);
            String m = s1.substring(i,i+1);
            String b = s1.substring(i+1);
            
            if (!m.equals(" ") )
            //here I can manipulate
            {
                char middle = m.charAt(0);
                middle += 1;
                s1 = f + middle + b;
            }
            
            //System.out.println(f + "------"+ m + "------" + b);
            
        }
    }   
}