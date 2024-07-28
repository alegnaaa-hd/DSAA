// DSAA Week 2 Day 4, 7/24/2024

import java.util.ArrayList;

public class insertionsort
{
    public static void main (String[] args)
    {
        // create unsorted array
        ArrayList <Integer> unsorted = new ArrayList<Integer>();
        
        // add elements 
        unsorted.add(9);
        unsorted.add(0);
        unsorted.add(4);
        unsorted.add(2);
        unsorted.add(1);
        unsorted.add(11);
        unsorted.add(16);

        // create sorted array
        ArrayList <Integer> sorted = new ArrayList <Integer>();

        System.out.println("Unsorted array: " + unsorted);

        // populate the first index of sorted array 
            // with the first element of unsorted array
        sorted.add(unsorted.get(0));

        // loop through the unsorted array
        for (int i = 1; i < unsorted.size(); i++)
        {
            // loop through the sorted array
            for (int j = 0; j < sorted.size(); j++)
            {
                // if the sorted array only has one element 
                if (sorted.size() == 1)
                {
                    // if element to insert is greater than the one value
                        // in the sorted array
                    if (unsorted.get(i) > sorted.get(j))
                    {
                        sorted.add((j + 1), unsorted.get(i));
                        break;
                    }

                    // if element to insert is less than the one value
                        // in the unsorted array
                    else if (unsorted.get(i) < sorted.get(j) || unsorted.get(i) == sorted.get(j))
                    {
                        sorted.add(j, unsorted.get(i));
                        break;
                    }
                }

                // if element to insert is the same as a value 
                else if (unsorted.get(i) == sorted.get(j))
                {
                    sorted.add(j, unsorted.get(i));
                    break;
                }

                // if the element to insert is greater than the 
                    // last value in the sorted array
                else if (unsorted.get(i) > sorted.get(sorted.size() - 1))
                {
                    sorted.add((sorted.size()), unsorted.get(i));
                    break;
                }

                // if element to insert is greater than the j index value
                    // but smaller than the j-1 index value
                else if (unsorted.get(i) > sorted.get(j) && unsorted.get(i) < sorted.get(j + 1))
                {
                    sorted.add((j + 1), unsorted.get(i));
                    break;
                }
            }   
        }
        System.out.println("Sorted array: " + sorted);
    }
}