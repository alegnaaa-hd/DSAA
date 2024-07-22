// DSAA Week 2 Day 1, 7/21/2024

/*
 * Objective: in a list of n numbers, return two numbers
 * that add up to a number
 * 
 * Lesson: how to find complexity of a program
 * 
 * "oh this is actually more improved from what 
 * i expected from you guys"
 * - Franklin 2024
 */

public class twoSum {
    public static void main (String[] args) {
        int [] array = new int[]{2,7,11,15};
        int num1 = 0;
        int num2 = 0;

        // i < number of elements in list 
        for (int i = 0; i < 4; i++) {
            num1 = array[i];

            // j < (listLength - 1) - i
            for (int j = 0; j < (3 - i); j++) {
                num2 = array[j + 1];

                // sum of num1 and num2 is the desired target
                if (num1 + num2 == 9){
                    System.out.println(num1 + ", " + num2);
                }
            }
        }
    }
}