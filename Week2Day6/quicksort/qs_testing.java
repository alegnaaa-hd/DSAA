package Week2Day6.quicksort;
// DSAA Week 2 Day 4, 7/24/2024

/*
 * Objective: make quick sort 
*/

import java.util.ArrayList;

public class qs_testing 
{
    public static void main (String[] args)
    {
        ArrayList <Integer> unsorted = new ArrayList <Integer> ();
        unsorted.add(9);
        unsorted.add(0);
        unsorted.add(4);
        unsorted.add(4);

        ArrayList <Integer> sorted = sorting(unsorted, 0, unsorted.size());

        System.out.println("final array: " + sorted);
    }

    static ArrayList <Integer> sorting (ArrayList <Integer> array, int index, int length)
    {
        int q = 0;

        if (index < (length - 1))
        {
            q = partition(array, index, (length - 1));
            sorting(array, index, (q-1));
            sorting(array, (q + 1), (length - 1));

        }

        return array;
    }

    static int partition (ArrayList <Integer> array, int index, int length)
    {
        int x = array.get(length - 1);
        int i = index - 1;
        for (int j = index; j < length; j++)
        {
            if (array.get(j) <= x)
            {
                i++;
                exchange(array, i, j);
            }
        }
        exchange(array, i + 1, index);
        return i++;
    }

    static void exchange (ArrayList<Integer> array, int i, int j)
    {
        int tempValue = array.get(j);
        int tempIndex = j;

        array.set(tempIndex, array.get(i));
        array.set(i, tempValue);
    }
}
