package Unit3;
import java.util.Arrays;
import Unit1.Fraction;
// useful features to help with arrays, but its not necessary to import to use arrays
public class ArraysNotes
{
    public static void main( )
    {
        /**
         *  arrays are collections
         *  
         *  arrays can only hold the same type of data
         *  arrays can not change size once created
         *  arrays can hold primitive data types and objects
         *  arrays can be 1D or 2D
         *  
         *  arrays hold the data (element) at an index (number)
         *  arrays have a length     arrayName.length
         *  the index value goes from 0 to length-1
         *  
         */
        
        // declare an array , but didn't initialize it
        // can be done in two ways
        // what happens when you declare multiple variables at the same time 
        
        int a[];
        int[] b;
        
        int x , y , z;
        int c[] , d , e ;   // c is an array, d & e are just ints
        int[] f , g , h ;   // f, g , h are all arrays
        
        
        // can be declared with a length
        // a declared variable can be assigned a new length
        // are filled with the defaukt value (for ints, that is zero)
        int j[] = new int[10];
        int[] k = new int[100];
        a = new int[5];
        
        // can declared and initialize in the same line
        int l[] = { 1 , 2 , 6 , -4 , 0 } ;
        int[] m = { -5 , 2 } ;
        char[] n = {'g' , 'r' , 'n' };
        // b = { 1 , 2 , 3 } ;
        
        
        // variables can be declared but have no length or values
        // variables can be declared with a length but no values
        // variables can be declared with a length and values
        
        
        // what happens when you try to print it?
        // prints out the reference 
        System.out.println("a = " + a ) ;   // has a length, but no value
        System.out.println("m = " + m ) ;   // has a length and values
        // System.out.println("b = " + b ) ;   // b has no length or values - error
        
        // so how do we print - Arrays.toString( arr ) 
        System.out.println("a = " + Arrays.toString(a) ) ;   
        System.out.println("m = " + Arrays.toString(m) ) ; 
        
        
        // what happens when you try to set one array equal to another?
        int[] o = l;
        System.out.println("l = " + Arrays.toString(l) ) ;   
        System.out.println("o = " + Arrays.toString(o) ) ; 
        
        // are they the same actual data, or is o a copy of the data from l?  
        
        // what happens when you try to compare them?
        
        if( o == l ) 
            System.out.println("They are the same");
        else
            System.out.println("They are different");
                
        // what happens when you try to change the value of one
        
        o[0] = 10;
        System.out.println("l = " + Arrays.toString(l) ) ;   
        System.out.println("o = " + Arrays.toString(o) ) ; 
        
        // what happens when you try to compare ones that have the same values?
        
        int p[] = { 10 , 2 , 6 , -4 , 0 } ;
        System.out.println("l = " + Arrays.toString(l) ) ;   
        System.out.println("p = " + Arrays.toString(p) ) ; 
        if( p == l ) 
            System.out.println("They are the same");
        else
            System.out.println("They are different");
                
        // what happens when you send an array to a method?
        //they are two references to the same data
        System.out.println("p = " + Arrays.toString(p) ) ; 
        arrayMethod( p ) ;  // if we change the values of p in the method, what happens here
        System.out.println("p = " + Arrays.toString(p) ) ; //it does change 
        
        //pass by value to pass data to methods
        //when you pass an array in a method it changes the array it does change
        
        
        /**
         *  We can access the element (data) by using the index value
         *  
         *  if we have an array of length 10, the index values are 0 - 9 
         *  we can use a loop to traverse it
         */
        
        // how do we traverse an array?
        
        int arr[] = { 1 , 2 , 3 , 4 , -7 , 0 , 2 , 12 , 9 , 10 } ;
        // lets traverse it and print out every value
        for( int i = 0 ; i < arr.length ; i++ )
        {
            System.out.print( arr[i] + " , " ) ;
        }
        System.out.println("\n");  
        // lets use a loop to traverse the array and fill it with random numbers
        for( int i = 0 ; i < arr.length ; i++ )
        {
            arr[i] = (int)(Math.random()*10 + 1 ) ;
        }
        System.out.println("arr = " + Arrays.toString(arr) ) ; 
        
        // traverse it and see how many numbers are equal to 1 or 10
        int sum = 0;
        for( int i = 0 ; i < arr.length ; i++ )
        {
            if( arr[i] == 1 || arr[i] == 10 ) 
                sum++;
        }
        System.out.println("Sum = " + sum );
        
        // lets traverse it recursively
        System.out.println("Recursive sum = " + recursiveSum( arr , 0 ) );
        
        // lets add 10 to the value of every odd number in the array
        for( int i = 0 ; i < arr.length ; i++ )
        {
            if( arr[i]%2 == 1 ) 
                arr[i] += 10;
        }
        System.out.println("arr = " + Arrays.toString(arr) ) ; 
        
        
        /**
         *  Enhanced for loops
         *  An enhanced for loop doesn't deal with the index value
         *  instead we have a variable which has the same value as arr[i]
         */
        // only use an enhanced for loop to traverse the entire loop
        // see how enhanced for loops work, and uses arrValue
        for( int arrValue : arr ) // arrValue is the element from the array
        {
            System.out.print( arrValue + " , " ) ;
        }
        System.out.println("\n");
        //this for loop is essentially the one above
        for( int i = 0 ; i < arr.length ; i++ )
        {
            int arrValue = arr[i];
            System.out.print( arrValue + " , " ) ;
        }
        System.out.println("\n"); 
        
        // let try to change our array using an enhanced for loop
        for( int arrValue : arr ) //would not use an enhance for loop to change elements 
        {
            arrValue = 5;
            
        }
        System.out.println("arr = " + Arrays.toString(arr) ) ; 
        
        for( int i = 0 ; i < arr.length ; i++ )
        {
            int arrValue = arr[i];
            arrValue = 5;
        }
        
        Fraction fracArray[] = new Fraction[4];
        
        fracArray[0] = new Fraction();
        fracArray[1] = new Fraction(4);
        fracArray[2] = new Fraction(2,3);
        fracArray[3] = new Fraction(12,5);
        
        System.out.println("fraction array = "+ Arrays.toString(fracArray));
        
        for(Fraction frac : fracArray)
        {
            System.out.println(frac.asDecimal());
        }
        
        for(Fraction frac : fracArray)
        {
            frac.add(3);
        }
        System.out.println("fraction array = "+ Arrays.toString(fracArray));
        
        for(int i = 0; i < fracArray.length;i++)//can only change whats in the array if its dealing with mutable objects
        {
            fracArray[i].add(3);
        }
        
        
        // what are some useful Arrays class methods
        int q[] = {1,2,3,4,5,6,7,8,9,10};
        
        // t will be length 10    
        int t[] = Arrays.copyOf( q , 10 );  
        System.out.println("t = " + Arrays.toString( t ) );
        
        // w will be length 3    
        int w[] = Arrays.copyOf( q , 3 );  
        System.out.println("w = " + Arrays.toString( w ) );
        
        // v will be length 2, values from z, index 2-3
        int v[] = Arrays.copyOfRange( q , 2 , 4  );//inclusive, exclusive - JUST LIKE SUBSTRING  
        System.out.println("v = " + Arrays.toString( v ) );
    
        
    }
    
    private static void arrayMethod ( int x[] ) 
    {
        x[0] = -100;
    }
    
    private static int recursiveSum( int arr[] , int index ) // index needs to be 0 to traverse the entire array
    {
        if( index == arr.length )
            return 0;
        else
        {
            if( arr[index] == 1 || arr[index] == 10 ) 
                return 1 + recursiveSum( arr , index + 1 ) ;
            else
                return recursiveSum( arr , index + 1 ) ;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
