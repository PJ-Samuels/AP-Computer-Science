package Unit3;
import java.util.ArrayList; // must import this to use array list 
public class ArrayListsNotes
{
    public static void main( )
    {
        /*
         * What is an ArrayList?
         * 
         * An ArrayList is a class (that extends the List class), 
         *  that creates objects similar to arrays, 
         *  but with a number of differences
         *  
         * ArrayLists are dynamic in size, they can grow and shrink in 
         * size.   Arrays can't change size
         *  
         * ArrayLists and arrays both contain elements are index values
         *  Both start at index 0
         *  
         * ArrayList can hold any type of Object at the same time
         *  Arrays can only hold the same type of object or 
         *  primitive data type
         *  
         * ArrayList cant't hold primitive data types
         * 
         * Since ArrayList is a class, every ArrayList created has 
         *  access to certain methods  (here are some of those methods)
         *  - boolean ---> add( object ) NOTE: dont really need to use it 
         *  - boolean ---> add( int , object )
         *  - object ---> get( int )            sends to object at that index
         *  - object ---> set( int , object )
         *  - object ---> remove( object )
         *  - object---> remove( int )
         *  - int ---> size()
         */
        
        Fraction f = new Fraction();
        ArrayList arr = new ArrayList();
        
        System.out.println("arr = " +arr); // has a toString Method
        arr.add(new Fraction(3));
        arr.add(new Point(2,3));
        arr.add(new Date(1,9,2018));
        
        System.out.println("arr = " +arr);
        //Generic ArrayList that can hold Fraction objects
        ArrayList<Fraction> arrFGen = new ArrayList<Fraction>();
        //This ArrayList can hold any type of Object
        ArrayList arrFnon = new ArrayList();
        
        for(int i = 0 ; i <= 4; i++)
        {
            f = new Fraction((int)(Math.random()*10+1));
            arrFGen.add(f);
            arrFnon.add(f);
        }
        System.out.println("arrFGen = " +arrFGen);
        System.out.println("arrFnon = " +arrFnon);
        
        System.out.println("arrFGen index 1 = " +arrFGen.get(1));
        System.out.println("arrFnon index 1 = " +arrFnon.get(1));
        
        f = arrFGen.get(1);
        f = (Fraction) arrFnon.get(1); 
        
        
        ArrayList<Fraction> arrM = new ArrayList<Fraction>();
        for(int i = 0; i<=4; i++)
        {
            int n = (int)(Math.random()*5+5);
            int d = (int)(Math.random()*10+5);
            arrM.add( new Fraction(n,d));
        }
        System.out.println("arrM = " + arrM);
        
        
        /** 
         * add(int,object)
         * add the object to the index pararmeter
         *      and pushes over the object that was there
         */
        arrM.add(2, new Fraction());
        System.out.println("arrM = " + arrM);
        
        /**
         * object---> set (int,object)
         * returns the current ar the index parameter
         *  and sets that index equal to the new object
         */
        arrM.set(3, new Fraction(1,2));
        System.out.println("arrM = " + arrM);
        
        Fraction f1 = arrM.set(0,new Fraction(10,1));
        System.out.println("f1 = " + f1);
        System.out.println("arrM = " + arrM);
        
        /**
         * object ---> remobe(int)
         * returns the oobject at te incex parameter 
         *  and shifts everything over, so there is no empty space
         */
        arrM.remove(0);
        System.out.println("arrM = " + arrM);
        
        f1 = arrM.remove(0);
        System.out.println("f1 = " + f1);
        System.out.println("arrM = " + arrM);
        
        /**
         * boolean --> remove(object)
         * returns true orfalse if the object was removed from 
         *  the ArrayList. If the object was in the ArryLst,its
         *  removed, and the sixe of the Arraylist changes
         */
        boolean b = arrM.remove(new Fraction());
        System.out.println("b = " + b);
        System.out.println("arrM = " + arrM);
        
        /**
         * object --> get(index)
         * returns the object at the parameter index
         */
        Fraction f2 = arrM.get(2);
        System.out.println("f2 = " + f2);
        b = arrM.remove(f2);
        System.out.println("b = "+b);
        System.out.println("arrM = " + arrM);
        
        /**
         * ArrayLists can only hold Objects, they can't hold primitive data types at all, in  any form or fashion
         */
        int x = 5; 
        ArrayList a = new ArrayList();
        a.add(x);
        /** 
         * because of wrapper classes, x is cast automatically to
         * an integer object
         */
        
    }
    
}