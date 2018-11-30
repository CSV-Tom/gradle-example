package app;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

import app.App;

public class AppTest {

	@Test
	public void testStdout() {

		// System.lineSeparator :
		// - On UNIX systems, it returns "\n",
		// - In Microsoft Windows systems it returns "\r\n";
		String expectedOutput = "101" + System.lineSeparator() + "100" + System.lineSeparator();

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);

		App classUnderTest = new App();
		classUnderTest.exec();

		Assert.assertEquals(expectedOutput, baos.toString());
	}

	@Test
	public void testStdint() {

		String data = "100";
		InputStream stdin = System.in;
		try {
			System.setIn(new ByteArrayInputStream(data.getBytes()));
			App.readIntegerFromStdin();
		} finally {
			System.setIn(stdin);
		}

	}
}
