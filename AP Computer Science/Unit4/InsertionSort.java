package Unit4;

public class InsertionSort
{
    // keeps to front of the array sorted, adds an element and sorts it relative to whats in front of it
    public static void insertionSort( int arr[] )
    {
        if( arr.length == 0 )
            return;
       
        for( int i = 1 ; i < arr.length ; i++ )
        {
            int temp = arr[i] ;
            int pos = 0;
            for( int j = i-1 ; j >= 0 ; j-- )
            {
                if( arr[j] > temp )
                    arr[j+1] = arr[j];
                else
                    break;
                pos++;
            }
            arr[ i - pos ] = temp;
        }
    }
}
