package Unit3;
import java.util.*;

public class NestedForLoop
{
    public static void main()
    {
        /**
         * Nested lops are when you hae a loop inside another loop
         */
        for(int i = 1;i<=10;++i)
        {
            System.out.println(" i ="+i);
            // now when maakin for loops, the typical letter is i 
            //nest tehn follow a pattern of j,k,l
            for (int j = 1 ; j <=i ;j++)
            {
                System.out.println("j=" +j);
                
            }
            System.out.println();
        }
    }
}