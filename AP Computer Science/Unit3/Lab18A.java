package Unit3;
import java.util.*;
/**
 * PJ Samuels
 */
public class Lab18A
{
    public int[] sumRow( int arr[][] )
    {
        int sum[] = new int[arr[0].length-1];
        int s = 0;
        while(s < sum.length)
        {
            for(int r = 0 ; r< arr.length;r++)
            {
                for(int c = 0; c < arr[0].length; c++)
                {
                    sum[s] += arr[r][c]; 
                }
                s++;
            }          
        }
        return sum;
    }
    public void fillBounds( int arr[][] )
    {
        for(int r = 0; r < arr.length; r++)
        {
            arr[r][0] = -1;
            arr[r][arr.length-1] = -1;
        }
        for(int c = 0; c < arr[0].length; c++)
        {
            arr[0][c] = -1;
            arr[arr.length-1][c] = -1;
        }
        System.out.println(arr);
    }    
    public int[][] bingoCard()
    {
         int arr[][] = new int [5][5];
         for(int r = 0; r < arr.length; r++)
         {
             for(int c = 0; c < arr[0].length; c++)
             {
                 arr[r][c] = (int)(Math.random()*15*c+1);
                 for(int  i = 0; i < r; i++)
                 {
                    if( arr[r][c] == arr[i][c])
                    {
                        r--;
                        break;
                    }
                 }
             }
         }
         return arr;
    }        
    public int[][] magiceSquare( int n )
    {
        int arr[][] = new int[n][n];
        int row = n-1;
        int col = n/2;
        arr[row][col] = 1;
        for (int i = 2; i <= n*n; i++) {
            if (arr[(row + 1) % n][(col + 1) % n] == 0) {
                row = (row + 1) % n;
                col = (col + 1) % n;
            }
            else 
                row = (row - 1 + n) % n;
            arr[row][col] = i;
        }
        return arr;
    }
}
