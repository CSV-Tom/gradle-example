package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import stack.Stack;

public class App {

	public static int readIntegerFromStdin() {
		do {
			try {
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				return Integer.parseInt(bufferedReader.readLine());
			} catch (NumberFormatException ex) {
				System.out.println("Not a number !");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while (true);
	}

	public void exec() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(100);
		stack.push(101);
		stack.print();
	}

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(readIntegerFromStdin());
		System.out.println("Entered number is " + stack.pop() + "!");
	}
}
