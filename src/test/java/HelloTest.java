import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest
{
	@Test
	public void testGreeting()
	{
		String greeting = "Hello, Class!";
		System.out.println(greeting);

		assertTrue(greeting instanceof String);
		assertEquals("Hello, Class!", greeting);
	}
}
