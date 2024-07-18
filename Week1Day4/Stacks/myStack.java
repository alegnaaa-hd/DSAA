// DSAA Week 1 Day 4, 7/17/2024

/*
 * Objective: write a program that reverses the order of a STACK
 * 
 * SIDENOTE: 
 * this is the program that actually reverses a STACK, NOT A QUEUE
 */

package Stacks;

import java.util.Stack;

public class myStack 
{
    public static void main(String[] args)
    {
        // create new stack
        Stack <Integer> stack = new Stack<>();

        // pushing elements onto stack
        stack.push(3);
        stack.push(6);
        stack.push(8);
        stack.push(9);

        // print out original stack 
        System.out.println("Original Stack: " + stack);

        // create second stak
        Stack <Integer> stack2 = new Stack<>();

        // pop elements onto new stack 
        while(!stack.isEmpty())
        {
            stack2.push(stack.pop());
        }

        // print stack with elements flipped
        System.out.println("Flipped Stack: " + stack2);
    }
}
