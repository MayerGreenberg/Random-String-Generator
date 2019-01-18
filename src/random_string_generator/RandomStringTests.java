package random_string_generator;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomStringTests {

	@Test
	public void testLowerTestDoesNotGoOutOfBounds(){
		String testedString = RandomStringGenerator.lowerCase(10000000);
		assertTrue(StringChecker.isLowerCaseWord(testedString));
	}
	@Test
	public void testUpperCaseDoesNotGoOutOfBounds(){
		String testedString = RandomStringGenerator.upperCase(10000000);
		assertTrue(StringChecker.isUpperCaseWord(testedString));
	}
	@Test
	public void isLowerCaseWordWorks(){
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String[] upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ`1234567890-=[]\\,./;\'~!@#$%^&*()_+{}|:<>?\"".split("");
		assertTrue(StringChecker.isLowerCaseWord(lower));
		for (String word : upper)
			assertFalse(StringChecker.isLowerCaseWord(word));
		
	}
	/*@Test
	public void isLowerCaseWorks(){
		char[] lower = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ`1234567890-=[]\\,./;\'~!@#$%^&*()_+{}|:<>?\"".toCharArray();
		for (char c : lower)
			assertTrue(StringChecker.isLowerCase(c));
		for (char c : upper)
			assertFalse(StringChecker.isLowerCase(c));
	}*/
	@Test
	public void isUpperCaseWordWorks(){
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[] lower = "abcdefghijklmnopqrstuvwxyz`1234567890-=[]\\,./;\'~!@#$%^&*()_+{}|:<>?\"".split("");
		assertTrue(StringChecker.isUpperCaseWord(upper));
		for (String word : lower)
			assertFalse(StringChecker.isUpperCaseWord(word));
	}
	/*@Test
	public void isUpperCaseWorks(){
		char[] upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		char[] lower = "abcdefghijklmnopqrstuvwxyz`1234567890-=[]\\,./;\'~!@#$%^&*()_+{}|:<>?\"".toCharArray();
		for (char c : upper)
			assertTrue(StringChecker.isUpperCase(c));
		for (char c : lower)
			assertFalse(StringChecker.isUpperCase(c));
	}*/
	@Test
	public void isIntegerWordWorks(){
		assertTrue(StringChecker.isIntegerWord("8932749823709321703723"));
		assertFalse(StringChecker.isIntegerWord("8932749823f709321703723"));
	}
	/*@Test
	public void isIntegerWorks(){
		for(char c : "092347209347523094675320658132520435043975432097432074".toCharArray())
			assertTrue(StringChecker.isInteger(c));
		for(char c : "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz`-=[]\\,./;\'~!@#$%^&*()_+{}|:<>?\"".toCharArray())
			assertFalse(StringChecker.isInteger(c));
		
	}*/
	@Test
	public void integerDoesNotGoOutOfBounds(){
		String testedString = RandomStringGenerator.integer(10000000);
		assertTrue(StringChecker.isIntegerWord(testedString));
	}
}
