package Unit4;
import java.util.*;
public class ClientNode
{
    public static void main()
    {
        //add
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2,a);
        ListNode c = new ListNode(0);
        a.add(c);
        System.out.println(b.toString());
        //removeNext
        c = new ListNode(3, null);
        b = new ListNode(2,c);
        a = new ListNode(1,b);
        a.removeNext();
        System.out.println(a.toString());
        
        //insertion
        ListNode d = new ListNode(4,null);
        c = new ListNode(3,d);
        a = new ListNode(2,c);
        b = new ListNode(1,b);
        
        insertionSort(a);
        
    }
        public static ListNode  selectionSort( ListNode head )
    {
        if( head.getNext() == null ) 
            return null;
        ListNode next = head;
        int length = 1;
        while(head.getNext() != null)
            length++;
        int arr[] = new int[length];

        for( int i = 0 ; i < arr.length - 1 ; i++ )
        {
            int smallest = i;   // smallest will be the first index 
            for( int j = i+1 ; j < arr.length ; j++ )
            {
                if( arr[ j ] < arr[ smallest ] )
                    smallest = j;
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        return null;
    }
  
    public static ListNode insertionSort( ListNode head )
    {              
        if( head.getNext() == null )
            return null;
        ListNode next = head;
        int length = 1;
        while(head.getNext() != null)
            length++;
        ListNode arr[] = new ListNode[length];  
        arr[0] = head;
        for(int i = 1; i < arr.length; i++)        
            arr[i] = next.getNext();        
        
        for( int i = 1 ; i < arr.length; i++ )
        {          
            ListNode temp = arr[i] ;
            int pos = 0;
            for( int j = i-1 ; j >= 0 ; j-- )
            {
                if( arr[j].getData() > temp.getData() )
                {                    
                    ListNode Temp = arr[j+1];
                    ListNode place = arr[j].removeNext();
                    place.add(arr[j+1]);
                    //arr[j+1] = arr[j];                                                          
                    //use add and remove
                    //switches the listnodes next value

                }
                else
                    break;
                pos++;
            }
            arr[ i - pos ] = temp;
            
            //switches the next values of the two
            System.out.println(arr[i].toString());
        }    
        System.out.println(arr[0].toString());
        return arr[0];
        
    }
}