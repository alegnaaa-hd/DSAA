// DSAA Week 1 Day 1, 7/15/2024

import java.util.Scanner;
import java.util.ArrayList;

/*
 * Goal: Objectives
 * 1. Create a List / Array
 * 2. Include at least 1 input
 * 3. nclude search
 * 4. Add error handling (w/ print statements)
 * 5. Save list to a .txt file 
 */

public class PlanetApp 
{
    public static void main (String[] args)
    {
        String bar = "-----------------------------------------------------";
        // create scanner

        Scanner scan = new Scanner(System.in);

        // create ArrayList

        ArrayList<String> planets = new ArrayList<String>();
        
        planets.add("Earth");
        planets.add("Mercury");
        planets.add("Venus");

        int menuFinish = 0; 
        int listSize = 0; 


        int planetRemove = 0;

        int planetID = 0;
        String changeNameTo = "";

        while (menuFinish != 1)
        {
            System.out.println(bar);
            menuOptions();
            System.out.println(bar);

            System.out.println("Enter your choice: ");
            int userChoice = scan.nextInt();
            System.out.println(bar);

            // choice 1: add planet
            if (userChoice == 1)
            {
                System.out.println("Enter name of planet to add: ");
                String addPlanetName = scan.next();

                planets.add(addPlanetName);
                System.out.println(bar);
            }

            // choice 2: delete planet
            else if (userChoice == 2)
            {
                listSize = planets.size();

                for (int i = 0; i < (listSize + 1); i++)
                {
                    System.out.println((i + 1) + ". " + planets.get(i));
                }

                System.out.println(bar);
                System.out.println("Enter ID of planet to delete: ");
                planetRemove = scan.nextInt();

                planets.remove((planetRemove - 1));
                System.out.println(bar);
            }

            // choice 3: Update planet name 
            else if (userChoice == 3)
            {
                listSize = planets.size();
                for (int i = 0; i < (listSize + 1); i++)
                {
                    System.out.println((i + 1) + ". " + planets.get(i));
                }

                System.out.println(bar);
                System.out.println("Enter ID of planet to change: ");
                planetID = scan.nextInt();
                System.out.println("Enter name to change TO: ");
                changeNameTo = scan.nextLine();

                planets.set((planetID - 1), changeNameTo);
                System.out.println(bar);
            }

            // choice 4: print the ArrayList
            else if (userChoice == 4)
            {
                for (int i = 0; i < (listSize); i++)
                {
                    System.out.println((i + 1) + ". " + planets.get(i));
                }
                System.out.println(bar);
            }

            // choice 5: display the number of planets in the list
            else if (userChoice == 5)
            {
                listSize = planets.size();

                System.out.println("Number of planets in the list: " + listSize);
                System.out.println(bar);
            }
            
            // choice 6: terminate the program 
            else if (userChoice == 6)
            {
                System.out.println("Program has ended. byebye");
                System.out.println(bar);
                menuFinish = 1; 
            }
        }
    }

    // print out menu options 
    private static void menuOptions()
    {
        System.out.println("Choose an option (by number)");
        System.out.println("1. Add planet to the list");
        System.out.println("2. Delete a planet in the list");
        System.out.println("3. Update a planet based on it's ID");
        System.out.println("4. Print the list");
        System.out.println("5. Display the number of planets in the list");
        System.out.println("6. End program");
    }
}
