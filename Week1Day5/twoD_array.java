// DSAA Week 1 Day 5, 7/18/2024

// Objective: create and print a 2D array

public class twoD_array
{
    public static void main (String[] args)
    {
        // define 2D array
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // print out arraym, column x row
        for (int i = 0; i < 3; i++)
        {
            System.out.print("[");
            for (int j = 0; j < 3; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}