package Unit3;
import java.util.*;

public class Triangle2DArray
{
    public static void main()
    {
        /**
         * We think of 2D arrays as a matrix or a spreadsheet, but
         *  that isn't the reality of it.  But it does make it easy 
         *  to think about
         *  
         * Instead 2D arrays is a single array, with references to 
         *  more arrays (each reference is a row)
         *  
         * Given this reality, we actually don't need rows to have
         *  the same number of columns
         */
        int[][] arr = new int[5][]; // rows have not yet been created!
        for (int i = 0; i < arr.length; i++) 
                arr[i] = new int[i+1];  
        fillArray( arr );
        print2D( arr );
            
            
        int[][] arrR = new int[5][]; // rows have not yet been created!
        for (int i = 0; i < arr.length; i++) 
                arrR[i] = new int[(int)(Math.random()*arr.length+1)]; 
        fillArray( arrR );
        print2D( arrR );
    }
    
    public static void fillArray( int arr[][] )
    {
        for( int r = 0 ; r < arr.length ; r++ )
        {
            for( int c = 0 ; c < arr[r].length ; c++ )
            {
                arr[r][c] = (int)(Math.random()*10+1);
            }
        }
    }
    
    public static void print2D ( int arr[][] )
    {
        for (int i = 0; i < 5; i++) 
            System.out.println(Arrays.toString( arr[i] ) );
    }
}
