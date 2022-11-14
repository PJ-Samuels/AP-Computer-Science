package Unit3;
import java.util.*;
public class Array2DNotes
{
    public static void main()
    {
        int a[][] = new int[5][5];
        // traverse in roaw major order
        // completely traverse a single row before moving to the next row
        //a.length = how many rows are there 
        for (int r = 0;r < a.length; r++)
        {
            //a[0].length = how many columns are there          
            for(int c = 0 ; c < a[0].length; c++)
            {
                a[r][c] = (int)(Math.random()*10+1);
            }
            //System.out.println(Arrays.toString(a[r]));
        }
        System.out.println(Arrays.deepToString(a));
        
        for (int r = 0 ; r < a.length;r++)
            System.out.println(Arrays.toString(a[r]));
        // a[r] is a single row from the 2d array
        // a[0]  ---> this is the row 0
            
        
        
        
        
        
        
    }
    
}

