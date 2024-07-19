// DSAA Week 1 Day 5-6, 7/18/2024

/*
 * Objective: make connect 4
 */

package connect4;

public class main 
{
    public static void main (String[] args)
    {
        
        String line = "-----------------------------";
        
        String [][] board = new String[7][7];
        
        // make board blank 
        for (int r = 0; r < 7; r++)
        {
            for (int c = 0; c < 7; c++)
            {
                board[r][c] = " ";
            }
        }

        boolean win = false;
        int player1_choice = 0;
        int player2_choice = 0;

        System.out.println(line);
        while (!win)
        {   
            // player 1's turn
            functions.printGrid(board);
            player1_choice = functions.player1_input(board);
            functions.updateBoard(player1_choice, "X", board);

            // check for wins
            win = functions.checkForWins(board);

            // if player 1 wins
            if (win == true)
            {
                functions.endGame("X", 1, board);
                break;
            }

            // player 2's turn 
            functions.printGrid(board);
            player2_choice = functions.player2_input(board);
            functions.updateBoard(player2_choice, "O", board);
            
            // check for wins
            win = functions.checkForWins(board);

            // if player 2 wins
            if (win == true)
            {
                functions.endGame("O", 2, board);
                break;
            }
        }
    }
}
