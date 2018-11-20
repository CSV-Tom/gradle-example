package tests;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

import stack.Stack;

public class StdinStdoutTest {

	@Test
	public void test()  {
		
	  String expectedOutput = "100\n";

	  ByteArrayOutputStream baos = new ByteArrayOutputStream();
	  PrintStream ps = new PrintStream(baos);
	  System.setOut(ps);

	  Stack<Integer> classUnderTest = new Stack<Integer>();
	  classUnderTest.push(100);
	  classUnderTest.print();

	  Assert.assertEquals(expectedOutput, baos.toString());
	}
}
