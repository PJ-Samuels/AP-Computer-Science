package Unit4;

public class BinarySearch
{
    public static int binarySearch( int arr[] , int target )
    {
        int front , middle , back;
        
        front = 0 ;
        back = arr.length - 1 ;
        middle = ( front + back ) / 2 ;
        while( front <= back )
        {
            
            if( arr[middle] == target )
                return middle;
            else if( arr[middle] < target )
                front = middle + 1;
            else
                back = middle - 1;
                
            middle = ( front + back ) / 2 ;    
        }        
        return -1;        
    }
    
}
