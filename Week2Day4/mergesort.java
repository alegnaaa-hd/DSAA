// DSAA Week 2 Day 4, 7/24/2024

/*
 * Objective: make merge sort
 * 
 * brah wat da fak
 */

import java.util.ArrayList;

public class mergesort 
{
    public static void main (String[] args)
    {
        // create unsorted array
        ArrayList <Integer> unsorted = new ArrayList <Integer>();

        // add elements 
        unsorted.add(9);
         
        unsorted.add(0);
        
        unsorted.add(4);
        
        unsorted.add(2);
        
        unsorted.add(1);
        unsorted.add(11);
        unsorted.add(16);
        
        
        ArrayList <Integer> finalArray = sort(unsorted);
        System.out.println(finalArray);
    }

    static ArrayList <Integer> sort (ArrayList<Integer> array)
    {
        if (array.size() <= 1)
        {
            return array;
        }   

        else
        {
            // split array into the left side and right side
            ArrayList <Integer> leftArray = splitLeft(array);
            ArrayList <Integer> rightArray = splitRight(array);

            System.out.println(leftArray);
            System.out.println(rightArray);
            // recursively call sort on both left and right sides 
            ArrayList <Integer> sortedLeftArray = sort(leftArray);
            ArrayList <Integer> sortedRightArray = sort(rightArray);

            //System.out.println(sortedLeftArray);
            //System.out.println(sortedRightArray);
            // combine sorted left and sorted right into one sorted array
            ArrayList <Integer> finalArray = merge(sortedLeftArray, sortedRightArray);
            
            return finalArray;

        }
        //return array;
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
    
    // merge two arrays 
    static ArrayList <Integer> merge (ArrayList <Integer> array1, ArrayList <Integer> array2)
    {
        // create new array
        ArrayList <Integer> finalArray = new ArrayList <Integer> ();
        
        // define array index (starts at 0)
        int a1_index = 0;
        int a2_index = 0;
        int finalIndex = 0;

        // sort arrays by comparing each element at an index
        while (a1_index < array1.size() && a2_index < array2.size())
        {
            // if element in array1 is <= element in array2
            if (array1.get(a1_index) <= array2.get(a2_index))
            {
                finalArray.add(finalIndex, array1.get(a1_index));
                System.out.println("added: " + array1.get(a1_index));
                a1_index++;
            }

            else
            {
                finalArray.add(finalIndex, array2.get(a2_index));
                System.out.println("added: " + array1.get(a2_index));
                a2_index++;
            }
            finalIndex++;
        }
        
        // if array1 has leftovers
        if (a1_index < array1.size())
        {
            // copy the left overs from array1 into final array
            while (a1_index < array1.size())
            {
                finalArray.add(finalIndex, array1.get(a1_index));
                a1_index++;
                finalIndex++;
            }
        }

        // if array2 has leftovers
        else if (a2_index < array2.size())
        {
            // copy the left overs from array2 into final array
            while (a2_index < array2.size())
            {
                finalArray.add(finalIndex, array2.get(a2_index));
                a2_index++;
                finalIndex++;
            }
        }
        
        // return final array
        return finalArray;
    }

}
