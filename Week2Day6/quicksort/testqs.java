package Week2Day6.quicksort;
// DSAA Week 2 Day 6, 7/16/2024

public class testqs 
{
    static void quick_sort (int[] A, int p, int r)
    {
        int q;
        if (p < r)
        {
            q = partition(A, p, r);
            quick_sort(A, p, q-1);
            quick_sort(A, q+1, r);
        }
    }

    static int partition (int[] A, int p, int r)
    {
        int x, i, j;
        x = A[r];
        i = p - 1;
        for (j = p; j <= r-1; j++)
        {
            if (A[j] <= x)
            {
                i++;
                swap(A, i, j);
            }
        }
        swap (A, i + 1, i);
        return i++;
    }

    static void swap (int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main (String[] args)
    {
        int[] array = {9, 0, 4, 2, 1, 11, 16};

        quick_sort(array, 0, array.length-1);

        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

}
