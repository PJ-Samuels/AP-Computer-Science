package Unit1;import java.util.*;

//LAB 3
/**
 * PJ Samuels
 */
public class Box
{
    private int length;
    private int height;
    private int width;
    public Box (int l, int h , int w)
    {
        height = h;
        length = l;
        width = w ;
    }
    public Box()
    {   
    }
    public int getL()
    {
        return length;
    }
    public int getH()
    {
        return height;
    }
    public int getW()
    {
        return width;
    }
    /**
     * toString
     * This method returns a String in the format of length : height: width
     * @return  String      returns the fields in a formatted String
   	 */
    public String toString()
    {
        String s1 = ""+length ;
        String s2 = ""+height ;
        String s3 = ""+width  ;
        return s1+":"+s2+":"+s3;
    }
    /**
     * volume
     * This method returns an int to determine the volume of the given box  
     * @return      int     return the interger volume of the box
     */
    public int volume( )
    {
        int volume = this.length*this.height*this.width;
        return volume;
    }
    /**
     * surfaceArea
     * This method returns an int of the suraface area of the entire box
     * @return      int     return the surface area int
     */
    public int surfaceArea( )
    {
        int surfaceArea = 2*length*width+ 2*length*height + 2*height*width;
        return surfaceArea;
    }
    // This method will return true or false depending if the Box parameter will fit into the Box that called the // method
    /**
     * doesItFit
     * This methods finds out if the a new box can fit inside of the orginal 
     * @param       b       box parameter that is a box
     * @return      boolean     will return a true or false if the box fits inside of the original
     */
    public boolean doesItFit( Box b )
    {
        int largest = 0;
        int x = 0;
        int length2 = 4;
        int width2 = 3;
        int height2 = 2;
        int arr []= {length2, width2, height2};
        for(int i = 1; i<arr.length; i++)
        {
            if (arr[i] > arr[i-1])
            {
                arr[i] = arr[i-1];
            }
        }
        int arr2[] = {this.length, this.height, this. width};
        
        
        for(int i = 1; i<arr.length; i++)
        {
            if (arr2[i] > arr2[i-1])
            {
                arr2[i] = arr2[i-1];
            }
        }
        
        
        if (arr2[0]>arr[0])
        {
          if (arr2[1]>arr[1])
          {
              if (arr2[2]>arr[2])
              {
                  System.out.println("The box does fit");
                  return true;
              }
              else 
              {
                System.out.println("the box does not fit");
                  return false;
                }
          }
          else 
          {
              System.out.println("the box does not fit");
              return false;
            }
        }
        else
        {
            System.out.println("the box does not fit");
            return false; 
        }
    }       
}