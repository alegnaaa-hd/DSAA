// DSAA Week 1 Day 5, 7/18/2024

// Objective: write a fibonacci sequence

package fibonacci;

public class fibonacci 
{
    public static void main (String[] args)
    {
        // max is 43
        double result = fibi(43);
        System.out.println(result);
    }

    // fibonacci 
    public static double fibi (int num)
    {
        if (num == 0 || num == 1)
        {
            return 1;
        }
        
        else if (num > 0)
        {
            return fibi(num - 1) + fibi(num - 2);
        }

        // teminate
        else
        {
            return 0;
        }
    }
}
