package app;


import stack.Stack;

public class App {
	public void exec() {
		  Stack<Integer> classUnderTest = new Stack<Integer>();
		  classUnderTest.push(100);
		  classUnderTest.push(101);
		  classUnderTest.print();
	}

	public static void main(String[] args) {
		new App().exec();
	}
}
