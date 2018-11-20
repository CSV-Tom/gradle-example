package tests;

import org.junit.Assert;
import org.junit.Test;

import stack.Stack;

public class StackTest {

	@Test
	public void testStackOperations() {

		Stack<Integer> classUnderTest = new Stack<Integer>();

		Assert.assertTrue(classUnderTest.isEmpty());
		Assert.assertEquals(classUnderTest.size(), 0);

		classUnderTest.push(new Integer(100));
		classUnderTest.push(new Integer(101));

		Assert.assertFalse(classUnderTest.isEmpty());
		Assert.assertEquals(classUnderTest.size(), 2);

		classUnderTest.peek();

		Assert.assertFalse(classUnderTest.isEmpty());
		Assert.assertEquals(classUnderTest.size(), 2);

		classUnderTest.pop();

		Assert.assertFalse(classUnderTest.isEmpty());
		Assert.assertEquals(classUnderTest.size(), 1);

		classUnderTest.clear();

		Assert.assertTrue(classUnderTest.isEmpty());
		Assert.assertEquals(classUnderTest.size(), 0);
	}
}
