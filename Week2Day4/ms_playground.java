// DSAA Week 2 Day 4, 7/24/2024

/*
 * Objective: make merge sort
 * 
 * attempt 2
*/

import java.util.ArrayList;

public class ms_playground 
{
    public static void main (String[] args)
    {
        // create unsorted array
        ArrayList <Integer> unsorted = new ArrayList <Integer> ();

        // add elements 
        unsorted.add(9);         
        unsorted.add(0);
        
        unsorted.add(4);
        unsorted.add(4);
        /*
        unsorted.add(2);
        unsorted.add(1);
        unsorted.add(11);
        unsorted.add(16);
        */

        // old array
        System.out.println("Unsorted array: " + unsorted);
        System.out.println(sorting(unsorted));
    }

    // make method that splits the arrays
    static ArrayList <Integer> sorting (ArrayList <Integer> array)
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

            // recursively call splitArrays to split arrays
            ArrayList <Integer> splitLeftArray = sorting(leftArray);
            ArrayList <Integer> splitRightArray = sorting(rightArray);
            
            System.out.println("split left: " + splitLeftArray);
            System.out.println("split right: " + splitRightArray);
            
            ArrayList <Integer> bigArray = merge(splitLeftArray, splitRightArray);
            
            
            System.out.println("big array: " + bigArray);
            return bigArray;
        }
        
        
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
    static ArrayList <Integer> merge (ArrayList <Integer> array1, ArrayList <Integer> array2)
    {
        ArrayList <Integer> array3 = new ArrayList <Integer> ();
        
        int a1_index = 0;
        int a2_index = 0;
        int a3_index = 0;

        while (a1_index < array1.size() && a2_index < array2.size())
        {
            // if values are equal
            if (array1.get(a1_index) == array2.get(a2_index))
            {
                array3.add(a3_index, array1.get(a1_index));
                a1_index++;
                a3_index++;
                System.out.println("added: " + array3.get(a3_index - 1));

                array3.add(a3_index, array2.get(a2_index));
                a2_index++;
                a3_index++;
                System.out.println("added: " + array3.get(a3_index - 1));
            }

            else if (array1.get(a1_index) < array2.get(a2_index))
            {
                array3.add(a3_index, array1.get(a1_index));
                a1_index++;
                a3_index++;
            }

            else if (array2.get(a2_index) < array1.get(a1_index))
            {
                array3.add(a3_index, array2.get(a2_index));
                a2_index++;
                a3_index++;
            }
        }
        return array3;

    }
}
