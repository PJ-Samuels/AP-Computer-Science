package Unit3;
import java.util.*;
public class ClientLab14
{
    public static void main()
    {
        int length = 8;
        int xrange = 9;
        int yrange = 5;
        Point arr[] = Lab14.randomPoints(length,xrange,yrange);
        
        System.out.println(Arrays.toString(Lab14.midpoints(arr)));
        
        Date arr2[] = Lab14.randomDates(length);
        
        System.out.println(Arrays.toString(arr2));
        
        Lab14.sortDates(arr2);
        System.out.println(Arrays.toString(Lab14.datesBetween(arr2)));
    }
}
