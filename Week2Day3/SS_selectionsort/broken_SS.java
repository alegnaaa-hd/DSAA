package SS_selectionsort;
// DSAA Week 2 Day 3, 7/23/2024

/*
 * Objective: write selection sort
 * 
 * this program is the most broken does not work
 * 
 * i am dumb
 */

public class broken_SS
{
    public static void main (String[] args)
    {
        int[] nums = {9, 0, 4, 2, 1, 11, 16};
        int length = nums.length;
        sort (nums,length);
    }

    static void sort (int[] nums, int length)
    {
        
        /* 
        boolean sorted = false;
        while (sorted != true)
        {
            
            // check if array is sorted
            // if empty or only one element
            if (length == 0 || length == 1)
            {
                sorted = true;
                break;
            }

            // cycle through array
            for (int i = 1; i < length; i++)
            {
                // if unsorted
                if (nums[i - 1] > nums[i])
                {
                    sorted = false;
                }
            }
            
            if (sorted == true)
            {
                for (int i = 0; i < length; i++)
                {
                    System.out.println(nums[i]);
                }
                break;
            }

            // compare the elements 
            for (int i = 0; i < length; i++)
            {
                int initial = nums[i];
                int change = 0;
                for (int j = (i+1); j < length; j++)
                {
                    change = nums[j];
                    if (change < initial)
                    {
                        nums[i] = change;
                        nums[j] = initial; 
                    }
                }
            }
        }
        //return nums;
        */
    }
}