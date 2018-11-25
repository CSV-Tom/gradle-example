package app;

import stack.Stack;

public class App {
	public void exec() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(100);
		stack.push(101);
		stack.print();
	}

	public static void main(String[] args) {
		new App().exec();
	}
}
