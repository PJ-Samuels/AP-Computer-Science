package Unit3;
import java.util.ArrayList;

public class ArrayListIntegerNotes
{
    public static void main()
    {
        /**
         * Since ArrayList is a class, every ArrayList created has 
         *  access to certain methods  (here are some of those methods)
         *  - boolean --> add( object )
         *  - boolean --> add( int , object )
         *  - object --> get( int )
         *  - object --> set( int , object )
         *  - object --> remove( object )
         *  - boolean --> remove( int )
         *  - int --> size()
         */
        
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add( 3 );
                       
        /**
         * 3 here is put into a wrapper class - the Integer class
         * The integer object of 3 is then stored into the ArrayList
         * There are wrapper classes for all the primitive data types
         * The primitive data type is automatically cast into 
         * the proper wrapper class object
         * 
         * so imagine this is happening
         * a.add( new Integer(3) )
         */ 
        
        // lets add more stuff to the ArrayList        
        a.add( 4 );
        a.add( 7 );
        a.add( 13 );
        
        
        /**
         * There are alternatives, such as making an anonymous 
         * inner class with an instance initializer 
         * (also known as an "double brace initialization")
         * 
         * However, I'm not too fond of that method because what 
         * you end up with is a subclass of ArrayList which 
         * has an instance initializer, and that class is 
         * created just to create one object that just seems 
         * like a little bit overkill to me.
         * 
         * http://stackoverflow.com/questions/1005073/initialization-of-an-arraylist-in-one-line
         */
        
        ArrayList<Integer> b = new ArrayList<Integer>() {{
            add(2);
            add(6);
            add(10);
            add(15);
        }};
        
        //remember there are two add methods
        //add(object0 - add to the end of hte list
        //add (int, object) - adds at the int index, pushes everything
        //  else over 
        
        System.out.println(a);
        a.add(12);
        System.out.println(a);
        a.add(2,20);
        System.out.println(a);        
        // get(int) --> returns the oject at the index parameter
        
        System.out.println(a.get(1));
        
        Integer x = a.get(1);
        int y = a.get(1);
        
        // set(int , object) --> overwrites the object at the index 
        //  returns the object that was there
        
        System.out.println(a.set(3,-30));
        System.out.println(a);
        // remove(int, ) --> returns th object from that indec
        //   and shrinks the ArrayList
        // remove(object) --> returns true/false if the object 
        //  exists in the ArrayList, and if true, removes it 
        
        System.out.println(a.remove(0));
        System.out.println(a);
        
        a.add(-30);
        System.out.println(a.remove(new Integer(-30)));
        System.out.println(a);
        
        ArrayList<String> arrS = new ArrayList<String>();
        arrS.add("hello");
        arrS.add("Class");
        arrS.add("How");
        arrS.add("are");
        arrS.add("you");
        System.out.println( arrS );
        System.out.println( arrS.remove("How") );
        System.out.println( arrS );
        
        
    }
}