// DSAA Week 2 Day 4, 7/24/2024

/*
 * Objective: make merge sort
 * 
 * attempt 2
*/

import java.util.ArrayList;

public class mergesortattempt2 
{
    public static void main (String[] args)
    {
        // create unsorted array
        ArrayList <Integer> unsorted = new ArrayList <Integer> ();

        // add elements 
        unsorted.add(9);         
        unsorted.add(0);
        unsorted.add(4);
        unsorted.add(2);
        unsorted.add(1);
        unsorted.add(11);
        unsorted.add(16);

        // old array
        System.out.println("Unsorted array: " + unsorted);
        splitArrays(unsorted);
    }

    // make method that splits the arrays

    static ArrayList <Integer> splitArrays (ArrayList <Integer> array)
    {
        if (array.size() <= 1)
        {
            return array;
        }

        else
        {
            // split array into left and right sides
            ArrayList <Integer> leftArray = splitLeft(array);
            ArrayList <Integer> rightArray = splitRight(array);

            System.out.println(leftArray);
            System.out.println(rightArray);
        }
        return array;
    }

    // split array: left side
    static ArrayList <Integer> splitLeft (ArrayList <Integer> array)
    {
        int middle = array.size() / 2;
        ArrayList <Integer> leftArray = new ArrayList <Integer> ();
        for (int i = 0; i < middle; i++)
        {
            leftArray.add(array.get(i));
        }
        return leftArray;
    }

    // split array: right side 
    static ArrayList <Integer> splitRight (ArrayList <Integer> array)
    {
        int middle = array.size() / 2;
        ArrayList <Integer> rightArray = new ArrayList <Integer> ();
        for (int i = middle; i < array.size(); i++)
        {
            rightArray.add(array.get(i));
        }

        return rightArray;
    }

    // make method that merges the arrays
}
