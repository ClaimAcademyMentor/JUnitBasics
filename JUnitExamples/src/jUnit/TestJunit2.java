package jUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit2 {
	String message = "Robert";
	StringBuffer messageUtil = new StringBuffer(message);

	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil);
	}
}
