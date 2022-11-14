package Unit3;
import java.util.*;

public class TicTacToe
{
    private char board[][];
    
    public TicTacToe()
    {
        board = new char[3][3];
        // traverse the board, fill it with "_"
        for( int r = 0 ; r < board.length ; r++ )
        {
            for( int c = 0 ; c < board[0].length ; c++ ) 
            {
                board[r][c] = '_' ;
            }
        }
    }
    
    public String toString()
    {
        String printBoard = "";
        for( int r = 0 ; r < board.length ; r++ )
        {
            printBoard += Arrays.toString(board[r] );
            printBoard += "\n";
        }
        return printBoard;
        
        /**
         * printBoard += Arrays.toString(board[0] );
         * printBoard += "/n";
         * printBoard += Arrays.toString(board[1] );
         * printBoard += "/n";
         * printBoard += Arrays.toString(board[2] );
         * printBoard += "/n";
         */
        
        
    }
    
    /**
     * This will add either an X or O to the board
     * @param int player, either 1 or 2
     * @return  returns true or false if the player was able to 
     *              make the move
     */
    public boolean makeMove( int player )
    {
        int moveChoice[] = chooseMove(player);
        if( board[ moveChoice[0] ][ moveChoice[1] ] == '_' )
        {
            if( player == 1 )
                board[ moveChoice[0] ][ moveChoice[1] ] = 'X';
            else
                board[ moveChoice[0] ][ moveChoice[1] ] = 'O';
            return true;
        }
        else
            return false;
    }
    
    public int[] chooseMove( int player )
    {
        Scanner kin = new Scanner( System.in );
        System.out.println("Player " + player + " enter your move");
        System.out.print("Enter row: ");
        int row = kin.nextInt();
        System.out.print("Enter column: ");
        int col = kin.nextInt();
        int move[] = { row , col };
        return move; 
    } 
    public void checkBoardStatus()
    {
        boolean winner = false;
        /**
         * but we want a solution that can scale
         * if(board[0][0] == board[0][1] && board[0][1] == board[0][2])
         * winner = true; 
         */
        for(int r = 0; r < board.length; r++)
        {
            char checkRow = board[r][0];
            char checkCol = board[0][r];
            if(checkRow =='_'|| checkCol == '_')
                continue;
            boolean rowSame = true;
            boolean colSame = true;
            for(int c = 0; c < board[0].length;c++)
            {
                if(checkRow != board[r][c])                
                    rowSame = false;                
                if(checkCol != board[c][r])
                    colSame = false;
            }
            if(rowSame)
                winner = true;
        }
        
        char diag1 = board[0][0];
        char diag2 = board[board.length-1][0];
        boolean diag1Same = true;
        boolean diag2Same = true;
        if(diag1 =='_' )
            diag1Same = false;
        if( diag2 == '_')
        {
            diag2Same = false;
        }
        
        for (int r = 0; r < board.length; r++)
        {
            if(diag1 != board[r][r])
                diag1Same = false;
            if (diag2 != board[board.length-1-r][r])
                diag2Same = false;
            
        } 
        if (diag1Same|| diag2Same)
            winner = true;
        if(winner)
            System.out.println("Winner");
        else 
        {
            boolean catsGame = true;
            //is it a cats game
            for(int r = 0; r < board.length; r++)           
                for(int c =0; c < board[0].length; c++)
                    if( board[r][c] == '_')                  
                        catsGame = false;
            if(catsGame)
                System.out.println("Cats Game");
                
        }
    }
    
    public static void main()
    {
        TicTacToe ttt = new TicTacToe();
        System.out.println( ttt );
        int player = 1;
        while(true)
        {
            boolean legal = ttt.makeMove(player);
            if (! legal)
                continue;
            if(player == 2 )
                player = 1;
            else 
                player = 2;
            System.out.println(ttt);
            ttt.checkBoardStatus();
        }
    }
    

}
