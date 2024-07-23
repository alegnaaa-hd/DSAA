// DSAA Week 2 Day 3, 7/23/2024

/*
 * Objective: make selection sort
 * 
 * this is my final attempt (hopefully)
 * 
 * YAY
 */

package SS_selectionsort;

public class selectionsort {
    
    public static void main (String[] args)
    {
        // create array
        int[] nums = {9, 0, 4, 2, 1, 11, 16};

        int smallestIndex = 0;
        int numToChange = 0;

        for (int i = 0; i < nums.length; i++)
        {
            smallestIndex = i;
            for (int j = (i + 1); j < nums.length; j++)
            {
                // if a smaller value is found
                if (nums[i] > nums[j] && nums[smallestIndex] > nums[j])
                {
                    smallestIndex = j;
                }
            }
            System.out.println("smallest index: " + smallestIndex);
            
            numToChange = nums[smallestIndex];
            nums[smallestIndex] = nums[i];
            nums[i] = numToChange;
        }
        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
    }
}
