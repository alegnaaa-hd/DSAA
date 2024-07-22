package binarysearch;
// DSAA Week 2 Day 2, 7/22/2024

/*
 * Objective: write a program that takes a 
 * sorted array/list of integers, a target, 
 * and uses binary search to find the 
 * desired target in the list. print a 
 * counter for every comparison in the list
 * 
 * Sidenote: 
 * this program is so broken i wanna cry
 */

import java.util.ArrayList;

public class BROKEN_binarySearch
{
    public static void main (String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(0);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(11);
        nums.add(12);
        nums.add(13);        
        
        int length = 0; 
        int halfLength = 0;
        int comparision = 0;
        int target = 13;
        boolean loop = true;

        length = nums.size();

        while (loop != false)
        {
            // add 1 to counter 
            comparision++;

            // find half of length
            halfLength = (int)(length / 2);
            // below line is for testing purposes 
            System.out.println("Half length = " + halfLength);

            // if the half length = target
            if (nums.get(halfLength - 1) == target)
            {
                System.out.println("Number of comparisons: " + comparision);
                loop = false;
                break;
            }

            // if target is less than the midpoint 
            else if (target < nums.get(halfLength - 1))
            {  
                System.out.println("less than midpoint");
                for (int i = (halfLength - 1); i < length; i++)
                {
                    nums.remove(i);
                }
            }

            // if target is more than the midpoint 
            else 
            {
                for (int i = 0; i < halfLength; i++)
                {
                    nums.remove(i);
                }
            }   
            length = halfLength;
        }
    }
}