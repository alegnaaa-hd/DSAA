// DSAA Week 1 Day 2, 7/15/2024

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Goal: Lists (ArrayList)
 * 1. List 5 things
 * 2. Add 2 more things
 * 3. Search for specific value 
 */

public class colleges 
{
    public static void main (String[] args)
    {
        String bar =  ("---------------------------------------------");
        
        // creates scanner

        Scanner scan = new Scanner(System.in);

        // creates list 
        ArrayList<String> colleges = new ArrayList<String>();

        // 1. 
        colleges.add("MIT");
        colleges.add("GT");
        colleges.add("Cornell");
        colleges.add("UPenn");
        colleges.add("CMU");

        // 2.
        colleges.add("Northeastern");
        colleges.add("Purdue");

        // 3. 

        System.out.println(bar);
        System.out.println("Enter college to search for in ArrayList: ");
        String userSearch = scan.nextLine();
        System.out.println(bar);

        int arraySize = colleges.size();
        
        boolean foundCollege = false; 
        String compareCollege = "";

        for (int i = 0; i < arraySize; i++)
        {
            compareCollege = colleges.get(i);
            if (userSearch.equals(compareCollege))
            {
                foundCollege = true;
                i = 10;
            }

            else 
            {
                foundCollege = false; 
            }
        }

        System.out.println(foundCollege);

        if (foundCollege == false)
        {
            System.out.println(userSearch + " was not found in the ArrayList");
        }

        else if (foundCollege = true)
        {
            System.out.println(userSearch + " was found in the ArrayList");
        }

        System.out.println(bar);

        // + extra printing out step

        System.out.println("ArrayList of Colleges: ");

        for (int i = 0; i < arraySize; i++)
        {
            System.out.println(colleges.get(i));
        }
        System.out.println(bar);
    }
}
