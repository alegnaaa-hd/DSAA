package binarysearch;
// DSAA Week 2 Day 2, 7/22/2024

/*
 * Objective: write a program that takes a 
 * sorted array/list of integers, a target, 
 * and uses binary search to find the 
 * desired target in the list. print a 
 * counter for every comparison in the list
 * 
 * Sidenote: this program actually works!!
 */

public class binarySearch
{
    public static void main (String[] args)
    {
        // create array
        int[] nums = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 11, 12, 13};
        int target = 13;
        System.out.println("Number of comparisons: " + 
        findIndex(nums, target, 0)
        );
    }

    static int findIndex(int[] nums, int target, int comparisonTimes)
    {
        // middle value 
        int arrayMiddle = nums[nums.length / 2];
        int odd = 0;

        // increment comparison
        comparisonTimes++;

        // if middle element equals the target value
        if (arrayMiddle == target)
        {
            return comparisonTimes; 
        }

        // if the array has even number of integers 
        if (nums.length % 2 > 0)
        {
            odd = 1; 
        }

        // if target is less than middle value
        if (target < arrayMiddle)
        {
            // create array1 --> all values less than middle
            int[] array1 = new int[nums.length / 2];
            
            for (int i = 0; i < array1.length; i++)
            {
                // populate array1
                array1[i] = nums[i];
            }
            return findIndex(array1, target, comparisonTimes);
        }

        // if target is greater than middle value
        else if (target > arrayMiddle)
        {
            // create array2 --> all values greater than middle
            int[] array2 = new int[nums.length / 2];

            for (int i = 0; i < array2.length; i++)
            {
                // populate array2
                array2[i] = nums[i + nums.length / 2 + odd];
            }
            return findIndex(array2, target, comparisonTimes);
        }
        return -1;
    }
}
