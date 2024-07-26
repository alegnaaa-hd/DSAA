// DSAA Week 2 Day 4 & 6, 7/24/2024

package Week2Day6.mergesort;

import java.util.ArrayList;

public class mergesort
{
    static ArrayList <int[]> numbers = new ArrayList <int[]> ();

    static void divideArray (int[] mainArray)
    {
        // basically an if statement into one line -Grace
        int odd = (mainArray.length % 2 == 0)?0:1;

        // create left and right arrays
        int[] arrayLeft = new int[mainArray.length / 2 + odd];
        int[] arrayRight = new int[mainArray.length / 2];

        // populate left and right arrays
        for (int i = 0; i < mainArray.length; i++)
        {
            // left
            if (i < mainArray.length / 2 + odd)
            {
                arrayLeft[i] = mainArray[i];
            }

            // right
            else
            {
                arrayRight[i - mainArray.length / 2 - odd] = mainArray[i];
            }
        } 

        // if left array has only one element
        if (arrayLeft.length == 1)
        {
            numbers.add(arrayLeft);
        }

        else
        {
            divideArray(arrayLeft);
        }

        // if right array only has one element 
        if (arrayRight.length == 1)
        {
            numbers.add(arrayRight);
        }

        else
        {
            divideArray(arrayRight);
        }
    }

    static void combine (int[] array1, int[] array2)
    {
        // define indexes of each array
        int a1_index = 0;
        int a2_index = 0;
        int combineIndex = 0;

        // set up array where values will combine
        int[] combinedArray = new int[array1.length + array2.length];

        // loop through both arrays
        while (a1_index < array1.length && a2_index < array2.length)
        {
            if (array1[a1_index] < array2[a2_index])
            {
                combinedArray[combineIndex] = array1[a1_index];
                a1_index++;
            }

            else 
            {
                combinedArray[combineIndex] = array2[a2_index];
                a2_index++;
            }
            combineIndex++;
        }

        // move the remaining elements in left and right array
            // into the main array

        // left array
        while (a1_index < array1.length)
        {
            combinedArray[combineIndex] = array1[a1_index];
            a1_index++;
            combineIndex++;
        }

        // right array
        while (a2_index < array2.length)
        {
            combinedArray[combineIndex] = array2[a2_index];
            a2_index++;
            combineIndex++;
        }

        numbers.add(combinedArray);
        if (numbers.size() >= 3)
        {
            numbers.remove(array1);
            numbers.remove(array2);
        }

        if (numbers.size() > 1)
        {
            combine(numbers.get(0), numbers.get(1));
        }
    }

    public static void main (String[] args)
    {
        int[] unsorted = new int[]
            {9, 0, 4, 2, 1, 11, 16};
        
        divideArray(unsorted);
        combine(numbers.get(0), numbers.get(1));
        int[] finalArray = numbers.get(0);

        System.out.println("Sorted Array: ");
        for (int i = 0; i < finalArray.length; i++)
        {
            System.out.println(finalArray[i]);
        }
    }


}