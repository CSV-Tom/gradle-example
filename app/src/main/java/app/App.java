package app;

import stack.Stack;
import java.util.Scanner;

public class App {

    public void exec() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(100);
        stack.push(101);
        stack.print();
    }

    public static void main(String[] args) {
        Console console = new Console();
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(console.readInteger("Please enter a number: "));
        System.out.println("Entered number is " + stack.pop() + "!");
    }
}
