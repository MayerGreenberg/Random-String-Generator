package random_string_generator;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomStringTests {

	@Test
	public void testLowerTestDoesNotGoOutOfBounds(){
		String testedString = RandomStringGenerator.lowerCase(10000000);
		assertTrue(RandomStringGenerator.isLowerCaseWord(testedString));
	}
	@Test
	public void testUpperCaseDoesNotGoOutOfBounds(){
		String testedString = RandomStringGenerator.upperCase(10000000);
		assertTrue(RandomStringGenerator.isUpperCaseWord(testedString));
	}
	@Test
	public void isLowerCaseWordWorks(){
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		assertTrue(RandomStringGenerator.isLowerCaseWord(lower));
		assertFalse(RandomStringGenerator.isLowerCaseWord(upper));
	}
	
}
