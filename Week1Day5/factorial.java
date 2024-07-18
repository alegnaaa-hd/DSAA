// DSAA Week 1 Day 5, 7/18/2024

public class factorial {
    public static void main(String[] args)
    {
        int result = sum(-5);
        System.out.println(result);
    }

    // recursion  
    public static int sum (int num)
    {
        /*
        Basically: 
        n + sum(n-1)
        n + (n-1 + sum(n-2))
        ...
        n + n-1 + ... + 2 + 1 + 0
        */

        // if positive num
        if (num > 0)
        {
            return num + sum(num - 1);
        }

        // if negative num
        else if (num < 0)
        {
            return num + sum(num + 1);
        }

        // terminate
        else 
        {
            return 0;
        }
    }
}