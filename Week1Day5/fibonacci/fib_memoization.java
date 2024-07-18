// DSAA Week 1 Day 5, 7/18/2024

// calculate fibonacci sequence and store in array

package fibonacci;

public class fib_memoization 
{
    public static void main (String[] args)
    {
        int fib[] = new int[300000000];

        // define first two elements of the fibonacci sequence
        fib[0] = 0;
        fib[1] = 1;

        System.out.println(fib[0]);
        System.out.println(fib[1]);

        // calculate other values based on first two
        // 300 million fibonacci elements 
        for (int i = 2; i < 300000000; i++)
        {
            fib[i] = fib[i-1] + fib[i-2];
            System.out.println(fib[i]);
        }
    }
}
