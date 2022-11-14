package Unit3;
import java.util.*;
public class Battleship
{    
    public static void main()
    {
        char[][] board = Battleship.field();
        Battleship(board);
        Submarine(board);
        Destroyer(board);
        Cruiser(board);
        
        
    }
    public String toString( char[][] field)
    {
        String printField = "";
        for( int r = 0 ; r < 10 ; r++ )
        {
            printField += Arrays.toString(field[r] );
            printField += "\n";
        }
        return printField;
    }
    public static char[][] field()
    {
        char[][]field = new char[10][10];
        for(int r = 0; r < field.length; r++)
        {
            for(int c = 0; c < field[0].length; c++)
            {
                field[r][c] = '~';                 
            }             
        }        
        
        //Destroyer = D – takes 2 spaces
        //Submarine = S – takes 3 spaces
        //Cruiser = C – takes 3 spaces
        //Battleship = B – takes 4 spaces
        //Aircraft Carrier = A – takes 5 spaces
        int startR = (int)(Math.random()*9+1);
        int startC = (int)(Math.random()*9+1);
        while(field[startR][startC] != '~')
        {
            startR =(int)(Math.random()*9+1);
            startC =(int)(Math.random()*9+1);
        }
        
        int x = (int)(Math.random()*2+1);
        if(x == 1)
        {                      
            if(startR <= 4 )
            {
                for(int r = startR; r < startR+5; r++)
                {
                    field[r][startC] = 'A'; 
                }
            }
            else
            {
                 for(int r = startR; r > startR-5; r--)
                {
                    field[r][startC] = 'A';
      
                }
            }
        }
        else if (x == 2) 
        {
            if(startC <= 4 )
            {
                for(int c = startC; c < startC+5; c++)               
                    field[startR][c] = 'A';                                     
            }
            else
            {
                for(int c = startC; c > startC-5; c--)                
                    field[startR][c] = 'A';                                                                 
            }                                     
        }
        Battleship(field);
        Cruiser(field);
        Destroyer(field);
        Submarine(field);
        for(int r = 0; r < 10; r++)                
            System.out.println(Arrays.toString(field[r]));  
        return field;        
    }
    public static void Battleship(char[][] board)
    {
        int startR = (int)(Math.random()*9+1);
        int startC = (int)(Math.random()*9+1);
        while(board[startR][startC] != '~')
        {
            startR =(int)(Math.random()*9+1);
            startC =(int)(Math.random()*9+1);
        }
        int lastIndexR = 0;
        int lastIndexC = 0;
        boolean ans = false;
        do
        {
            int x = (int)(Math.random()*2+1);
            if(x == 1)//check row
            {
                int r = startR;
                int count = 0;
                int longestRun = 0;
                while(count < 4 && r < 9)
                {
                    if(board[r][startC] == '~')
                    {
                        count++;
                        if(longestRun < count)
                            longestRun = count;
                        r++;    
                    }
                    else 
                    {
                        count = 0;
                        r++;
                    }
                }
                if(count == 4)
                {
                    lastIndexR = r;
                    ans = true;
                }
                else
                {
                    r = startR;
                    count = 0;
                    longestRun = 0;
                    while(count < 4 && r > 0)
                    {   
                        if(board[r][startC] == '~')
                        {
                            count++;
                            if(longestRun < count)
                                longestRun = count;
                            r--;
                        }
                        else 
                        {
                            count = 0;
                            r--;
                        }
                    }
                    if(count != 4)
                    {
                        startR =(int)(Math.random()*9+1);
                        startC =(int)(Math.random()*9+1);
                        
                        ans = false;
                    }
                    else 
                    {
                        lastIndexR = r;
                        ans = true;
                    }
                }                    
            }
            else
            {
                x = (int)(Math.random()*2+1);
                if(x == 1)//check column
                {
                    int c = startC;
                    int count = 0;
                    int longestRun = 0;
                    while(count < 4 && c < 9)
                    {
                        if(board[startR][c] == '~')
                        {
                            count++;
                            if(longestRun < count)
                                longestRun = count;
                            c++;    
                        }
                        else 
                        {
                            count = 0;
                            c++;
                        }
                    }
                    if(count == 4)
                    {
                        lastIndexC = c;
                        ans = true;
                    }   
                    else
                    {   
                        c = startC;
                        count = 0;
                        longestRun = 0;
                        while(count < 4 && c > 0)
                        {   
                            if(board[startR][c] == '~')
                            {
                                count++;
                                if(longestRun < count)
                                    longestRun = count;
                                c--;
                            }
                            else 
                            {   
                                count = 0;
                                c--;
                            }
                        }
                        if(count != 4)
                        {
                            startR =(int)(Math.random()*9+1);
                            startC =(int)(Math.random()*9+1);
                            
                            ans = false;
                        }
                        else 
                        {   
                            lastIndexC = c;
                            ans = true;
                        }
                    }                     
                }
            }        
        }
        while(ans != true);          
        if(lastIndexC != 0)
        {                  
            for(int c = lastIndexC; c > lastIndexC-4; c--)
            {
                board[startR][c] = 'B';
            }            
        }
        if(lastIndexR !=0)
        {
            for(int r = lastIndexR; r > lastIndexR-4; r--)
            {
                board[r][startC] = 'B';
            }      
        }      
    }
    public static void Cruiser(char [][] board)
    {
        
        int startR = (int)(Math.random()*9+1);
        int startC = (int)(Math.random()*9+1);
        while(board[startR][startC] != '~')
        {
            startR =(int)(Math.random()*9+1);
            startC =(int)(Math.random()*9+1);
        }
        int lastIndexR = 0;
        int lastIndexC = 0;
        boolean ans = false;
        do
        {
            int x = (int)(Math.random()*2+1);
            if(x == 1)//check row
            {
                int r = startR;
                int count = 0;
                int longestRun = 0;
                while(count < 3 && r < 9)
                {
                    if(board[r][startC] == '~')
                    {
                        count++;
                        if(longestRun < count)
                            longestRun = count;
                        r++;    
                    }
                    else 
                    {
                        count = 0;
                        r++;
                    }
                }
                if(count == 3)
                {
                    lastIndexR = r;
                    ans = true;
                }
                else
                {
                    r = startR;
                    count = 0;
                    longestRun = 0;
                    while(count < 3 && r > 0)
                    {   
                        if(board[r][startC] == '~')
                        {
                            count++;
                            if(longestRun < count)
                                longestRun = count;
                            r--;
                        }
                        else 
                        {
                            count = 0;
                            r--;
                        }
                    }
                    if(count != 3)
                    {
                        startR =(int)(Math.random()*9+1);
                        startC =(int)(Math.random()*9+1);
                        
                        ans = false;
                    }
                    else 
                    {
                        lastIndexR = r;
                        ans = true;
                    }
                }                    
            }
            else
            {
                x = (int)(Math.random()*2+1);
                if(x == 1)//check column
                {
                    int c = startC;
                    int count = 0;
                    int longestRun = 0;
                    while(count < 3 && c < 9)
                    {
                        if(board[startR][c] == '~')
                        {
                            count++;
                            if(longestRun < count)
                                longestRun = count;
                            c++;    
                        }
                        else 
                        {
                            count = 0;
                            c++;
                        }
                    }
                    if(count == 3)
                    {
                        lastIndexC = c;
                        ans = true;
                    }   
                    else
                    {   
                        c = startC;
                        count = 0;
                        longestRun = 0;
                        while(count < 3 && c > 0)
                        {   
                            if(board[startR][c] == '~')
                            {
                                count++;
                                if(longestRun < count)
                                    longestRun = count;
                                c--;
                            }
                            else 
                            {   
                                count = 0;
                                c--;
                            }
                        }
                        if(count != 3)
                        {
                            startR =(int)(Math.random()*9+1);
                            startC =(int)(Math.random()*9+1);
                            
                            ans = false;
                        }
                        else 
                        {   
                            lastIndexC = c;
                            ans = true;
                        }
                    }                     
                }
            }        
        }
        while(ans != true);          
        if(lastIndexC != 0)
        {                  
            for(int c = lastIndexC; c > lastIndexC-3; c--)
            {
                board[startR][c] = 'C';
            }            
        }
        if(lastIndexR !=0)
        {
            for(int r = lastIndexR; r > lastIndexR-3; r--)
            {
                board[r][startC] = 'C';
            }      
        }     
        
    }
    public static void Submarine(char [][]board)
    {
        
        int startR = (int)(Math.random()*9+1);
        int startC = (int)(Math.random()*9+1);
        while(board[startR][startC] != '~')
        {
            startR =(int)(Math.random()*9+1);
            startC =(int)(Math.random()*9+1);
        }
        int lastIndexR = 0;
        int lastIndexC = 0;
        boolean ans = false;
        do
        {
            int x = (int)(Math.random()*2+1);
            if(x == 1)//check row
            {
                int r = startR;
                int count = 0;
                int longestRun = 0;
                while(count < 3 && r < 9)
                {
                    if(board[r][startC] == '~')
                    {
                        count++;
                        if(longestRun < count)
                            longestRun = count;
                        r++;    
                    }
                    else 
                    {
                        count = 0;
                        r++;
                    }
                }
                if(count == 3)
                {
                    lastIndexR = r;
                    ans = true;
                }
                else
                {
                    r = startR;
                    count = 0;
                    longestRun = 0;
                    while(count < 3 && r > 0)
                    {   
                        if(board[r][startC] == '~')
                        {
                            count++;
                            if(longestRun < count)
                                longestRun = count;
                            r--;
                        }
                        else 
                        {
                            count = 0;
                            r--;
                        }
                    }
                    if(count != 3)
                    {
                        startR =(int)(Math.random()*9+1);
                        startC =(int)(Math.random()*9+1);
                        
                        ans = false;
                    }
                    else 
                    {
                        lastIndexR = r;
                        ans = true;
                    }
                }                    
            }
            else
            {
                x = (int)(Math.random()*2+1);
                if(x == 1)//check column
                {
                    int c = startC;
                    int count = 0;
                    int longestRun = 0;
                    while(count < 3 && c < 9)
                    {
                        if(board[startR][c] == '~')
                        {
                            count++;
                            if(longestRun < count)
                                longestRun = count;
                            c++;    
                        }
                        else 
                        {
                            count = 0;
                            c++;
                        }
                    }
                    if(count == 3)
                    {
                        lastIndexC = c;
                        ans = true;
                    }   
                    else
                    {   
                        c = startC;
                        count = 0;
                        longestRun = 0;
                        while(count < 3 && c > 0)
                        {   
                            if(board[startR][c] == '~')
                            {
                                count++;
                                if(longestRun < count)
                                    longestRun = count;
                                c--;
                            }
                            else 
                            {   
                                count = 0;
                                c--;
                            }
                        }
                        if(count != 3)
                        {
                            startR =(int)(Math.random()*9+1);
                            startC =(int)(Math.random()*9+1);
                            
                            ans = false;
                        }
                        else 
                        {   
                            lastIndexC = c;
                            ans = true;
                        }
                    }                     
                }
            }        
        }
        while(ans != true);          
        if(lastIndexC != 0)
        {                  
            for(int c = lastIndexC; c > lastIndexC-3; c--)
            {
                board[startR][c] = 'S';
            }            
        }
        if(lastIndexR !=0)
        {
            for(int r = lastIndexR; r > lastIndexR-3; r--)
            {
                board[r][startC] = 'S';
            }      
        }     
        
    }
    public static void Destroyer(char[][] board)
    {        
        int startR = (int)(Math.random()*9+1);
        int startC = (int)(Math.random()*9+1);
        while(board[startR][startC] != '~')
        {
            startR =(int)(Math.random()*9+1);
            startC =(int)(Math.random()*9+1);
        }
        int lastIndexR = 0;
        int lastIndexC = 0;
        boolean ans = false;
        do
        {
            int x = (int)(Math.random()*2+1);
            if(x == 1)//check row
            {
                int r = startR;
                int count = 0;
                int longestRun = 0;
                while(count < 2 && r < 9)
                {
                    if(board[r][startC] == '~')
                    {
                        count++;
                        if(longestRun < count)
                            longestRun = count;
                        r++;    
                    }
                    else 
                    {
                        count = 0;
                        r++;
                    }
                }
                if(count == 2)
                {
                    lastIndexR = r;
                    ans = true;
                }
                else
                {
                    r = startR;
                    count = 0;
                    longestRun = 0;
                    while(count < 2 && r > 0)
                    {   
                        if(board[r][startC] == '~')
                        {
                            count++;
                            if(longestRun < count)
                                longestRun = count;
                            r--;
                        }
                        else 
                        {
                            count = 0;
                            r--;
                        }
                    }
                    if(count != 2)
                    {
                        startR =(int)(Math.random()*9+1);
                        startC =(int)(Math.random()*9+1);
                        
                        ans = false;
                    }
                    else 
                    {
                        lastIndexR = r;
                        ans = true;
                    }
                }                    
            }
            else
            {
                x = (int)(Math.random()*2+1);
                if(x == 1)//check column
                {
                    int c = startC;
                    int count = 0;
                    int longestRun = 0;
                    while(count < 2 && c < 9)
                    {
                        if(board[startR][c] == '~')
                        {
                            count++;
                            if(longestRun < count)
                                longestRun = count;
                            c++;    
                        }
                        else 
                        {
                            count = 0;
                            c++;
                        }
                    }
                    if(count == 2)
                    {
                        lastIndexC = c;
                        ans = true;
                    }   
                    else
                    {   
                        c = startC;
                        count = 0;
                        longestRun = 0;
                        while(count < 2 && c > 0)
                        {   
                            if(board[startR][c] == '~')
                            {
                                count++;
                                if(longestRun < count)
                                    longestRun = count;
                                c--;
                            }
                            else 
                            {   
                                count = 0;
                                c--;
                            }
                        }
                        if(count != 2)
                        {
                            startR =(int)(Math.random()*9+1);
                            startC =(int)(Math.random()*9+1);
                            
                            ans = false;
                        }
                        else 
                        {   
                            lastIndexC = c;
                            ans = true;
                        }
                    }                     
                }
            }        
        }
        while(ans != true);          
        if(lastIndexC != 0)
        {                  
            for(int c = lastIndexC; c > lastIndexC-2; c--)
            {
                board[startR][c] = 'D';
            }            
        }
        if(lastIndexR !=0)
        {
            for(int r = lastIndexR; r > lastIndexR-2; r--)
            {
                board[r][startC] = 'D';
            }      
        }     
    }
}
