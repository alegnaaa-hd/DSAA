// DSAA Week 1 Day 4, 7/17/2024

/*
 * Objective: write a program that reverses the order of a stack
 */

// import ArrayDeque and Deque 
import java.util.ArrayDeque;
import java.util.Deque;

public class myQueue {
    public static void main(String[] args) {
        
        // Create a Queue of Integers using LinkedList
        Deque <String> deque_ = new ArrayDeque <String>();

        // adding elements to the queue
        deque_.add("3");
        deque_.add("6");
        deque_.add("8");
        deque_.add("9");

        // create another queue
        Deque <String> queue2 = new ArrayDeque <String>();

        // variable define
        String lastValue = "";
        int queueSize = deque_.size();

        // flip the queue by converting it into another queue
        for (int i = 0; i < queueSize; i++)
        {
            // get the value to be removed
            lastValue = deque_.getLast();
            // add the value to be removed to another 
            queue2.add(lastValue);

            // this will get rid of the last value in the deque_ queue
            // but we don't need that
            // deque_.removeLast();
        }

        // print out initial queue
        System.out.println("Queue elements: " + deque_);

        // print out flipped queue         
        System.out.println("Flipped queue elements: " + queue2);
    }
}