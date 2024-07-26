package Week2Day6.quicksort;
// DSAA Week 2 Day 4 & 6, 7/26/2024

public class quicksort 
{
    

    static void quick_sort(int[] array, int p, int r)
    {
        int q;
        if (p < r)
        {
            q = partition(array, p, r);
            quick_sort(array, p, q-1);
            quick_sort(array, q + 1, r);
        }
    }

    static int partition(int[] array, int p, int r)
    {
        int x,i,j;
        x = array[r];
        i = p-1;
        for (j = p; j < r; j++)
        {
            if (array[j] <= x)
            {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, r);
        return i + 1;
    }

    // swap two elements
    static void swap(int[] array, int i ,int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main (String[] args)
    {
        int[] array = {9, 0, 4, 2, 1, 11, 16};
        quick_sort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
