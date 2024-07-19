// DSAA Week 1 Day 5-6, 7/18/2024

/*
 * Objective: make connect 4
 */

package connect4;

import java.util.Scanner;

public class main 
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        String line = "-----------------------------";
        String bar =  "      - - - - - - - - -";
        
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
        int player_num = 0;
        int player1_choice = 0;
        int player2_choice = 0;

        System.out.println(line);
        while (win != true)
        {
            // player 1's turn
            player_num = 1;
            functions.printGrid(board);
            player1_choice = functions.player1_input();
            functions.updateBoard(player1_choice, "X", board);
            
            // player 2's turn 
            player_num = 2;
            functions.printGrid(board);
            player2_choice = functions.player2_input();
            functions.updateBoard(player2_choice, "O", board);
        }
    }
}


