package data;

import org.junit.Assert;
import org.junit.Test;

import data.Student;

public class StudentTest {

	@Test
	public void testConstructorUsingField() {
		Student classUnderTest = new Student("Max", "Mustermann", 100, 100);

		Assert.assertEquals("Max", classUnderTest.getPrename());
		Assert.assertEquals("Mustermann", classUnderTest.getSurname());
		Assert.assertEquals(100, classUnderTest.getMatriculationNumber());
		Assert.assertEquals(100, classUnderTest.getCourse());
	}
}
