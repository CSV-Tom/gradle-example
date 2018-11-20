package tests;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

import app.App;

public class AppTest {
	@Test
	public void testAppHasAGreeting() {

		String expectedOutput = "101\n100\n";

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);

		App classUnderTest = new App();
		classUnderTest.exec();

		Assert.assertEquals(expectedOutput, baos.toString());
	}
}
