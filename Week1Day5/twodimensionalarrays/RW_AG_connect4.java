// DSAA Week 1 Day 5, 7/18/2024

// Rachael and Alec's connect 4 game visualized 

package twodimensionalarrays;

public class RW_AG_connect4 
{
    public static void main (String[] args)
    {
        String[][] array = 
        {
            {"--","--","--","--","--","--","--"},
            {"--","--","--","AG","--","--","--"},
            {"--","--","AG","RW","--","--","--"},
            {"--","--","RW","RW","AG","--","--"},
            {"--","RW","RW","RW","RW","--","AG"},
            {"RW","AG","RW","AG","AG","RW","RW"},
            {"AG","RW","AG","RW","AG","AG","AG"}
        };

        System.out.println("-----------------------");
        System.out.println("|   Rachael vs Alec   |");
        System.out.println("-----------------------");

        // print out arraym, column x row
        for (int i = 0; i < 7; i++)
        {
            System.out.print("|");
            for (int j = 0; j < 7; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-----------------------");
    }
}
