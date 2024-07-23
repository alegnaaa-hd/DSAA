// DSAA Week 2 Day 3, 7/23/2024

/*
 * Objective: write selection sort
 * 
 * this program is better than the last one but also doesnt work
 * 
 * i am braindead
 */

package SS_selectionsort;

public class editedbroken_SS
{
    public static void main (String[] args)
    {
        int[] nums = {9, 0, 4, 2, 1, 11, 16};
        int length = nums.length;
        int[] newNums = sort (nums,length);
        for (int i = 0; i < length; i++)
        {
            System.out.println(newNums[i]);
        }
    }
 
    static int[] sort (int[] nums, int length)
    {
        boolean loop = true;
        
        int smallestElementIndex = 0;
        int smallestElement = nums[smallestElementIndex];
        int tempElementIndex = smallestElementIndex;
        int tempElement = smallestElement;
        int looptimes = 0;

        while (loop != false)
        {
            for (int i = (0 + looptimes); i < length; i++)
            {
                if (smallestElement > nums[i])
                {
                    smallestElement = nums[i];
                    smallestElementIndex = i;

                }
            }

            System.out.println("Smallest value is: " + smallestElement + " and smallest index = " + smallestElementIndex);

            nums[tempElementIndex] = smallestElement;
            nums[smallestElementIndex] = tempElement;

            
            // testing
            for (int i = 0; i < length; i++)
            {
                System.out.println(nums[i]);
            }
            

            
            boolean rightOrder = false;

            // check if array is in order
            for (int i = 0; i < length - 1; i++)
            {
                if (nums[i] < nums[i + 1])
                {
                    rightOrder = true;
                }

                else
                {
                    rightOrder = false;
                }
            }

            if (rightOrder == true)
            {
                loop = false;
                System.out.println("break");
                break;
            }

            else
            {
                System.out.println("wrong order");
                smallestElementIndex++;
                smallestElement = nums[smallestElementIndex];
                looptimes++;
            }
            
        }
        return nums;
    }
 }