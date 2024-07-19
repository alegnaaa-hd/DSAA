// DSAA Week 1 Day 5, 7/18/2024

package connect4;

import java.util.Scanner;

public class functions
{
    ///////////////// COLORS /////////////////

    // declare reset
    public static final String ANSI_RESET = "\u001B[0m";

    // declare color: red
    public static final String ANSI_RED = "\u001B[31m"; 

    // declare color: blue 
    public static final String ANSI_BLUE = "\u001B[32m";
    
    ///////////////// BOARD /////////////////

    // connect 4 board 
    // it is empty right now
    static void printGrid(String arr[][])
    {
        String top  = "| 0   1   2   3   4   5   6 |";
        String line = "+---+---+---+---+---+---+---+";

        System.out.println(top);

        // first loop is (r)ow, second is (c)olumn
        for (int r = 0; r < 7; r++)
        {
            System.out.println(line);
            for (int c = 0; c < 7; c++)
            {
                // print out X's in red
                System.out.print("| ");
                if (arr[r][c].equals("X"))
                {
                    System.out.print(ANSI_RED + arr[r][c] + ANSI_RESET + " ");
                }

                // print out O's in blue
                else if (arr[r][c].equals("O"))
                {
                    System.out.print(ANSI_BLUE + arr[r][c] + ANSI_RESET + " ");
                }

                // if empty
                else
                {
                    System.out.print(arr[r][c] + " ");
                }
            }
            System.out.println("|");
        }
        System.out.println(line);
    }

    // get first player's input 
    static int player1_input()
    {
        Scanner scan = new Scanner(System.in);
        String line = "-----------------------------";
        String bar =  "      - - - - - - - - -";

        boolean validChoice = false;
        int userChoice = 0;

        while (validChoice != true)
        {
            System.out.println("Player 1 (X) enter column (0-6): ");
            userChoice = scan.nextInt();

            // if valid input 
            if (userChoice < 7 || userChoice == 0)
            {
                System.out.println(line);
                validChoice = true;
            }
            
            // if input not valid 
            else
            {
                System.out.println(bar);
                System.out.println("Player 1 [ERROR]: invalid column]");
                System.out.println(line);
            }   
        }

        return userChoice;
    }

    // get second player's input
    static int player2_input()
    {
        Scanner scan = new Scanner(System.in);
        String line = "-----------------------------";
        String bar =  "      - - - - - - - - -";

        boolean validChoice = false;
        int userChoice = 0;

        while (validChoice != true)
        {
            System.out.println("Player 2 (O) enter column (0-6): ");
            userChoice = scan.nextInt();

            // if valid input 
            if (userChoice < 7 || userChoice == 0)
            {
                System.out.println(line);
                validChoice = true;
            }
            
            // if input not valid 
            else
            {
                System.out.println(bar);
                System.out.println("Player 2 [ERROR]: invalid column]");
                System.out.println(line);
            }   
        }
        
        return userChoice;
    }

    // add player moves to array --> update board
    // columnChoice = column player picked
    // player = which player's turn (is either "X" or "O")
    // arr = array
    static void updateBoard (int columnChoice, String player, String arr[][])
    {
        // loop through the rows
        for (int r = 7; r > 0; r--)
        {
            // if empty space is found 
            if (arr[r-1][columnChoice].equals(" "))
            {
                // place down player's move
                arr[r-1][columnChoice] = player;
                break;
            }
        }
        // HOLY SHIT THIS TOOK WAY TOO LONG
    }
}
