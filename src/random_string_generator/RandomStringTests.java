package random_string_generator;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomStringTests {

	@Test
	public void lowerCaseGeneratorDoesNotGoOutOfBounds(){
		String testedString = RandomStringGenerator.lowerCase(100000);
		assertTrue(StringChecker.isLowerCaseWord(testedString));
		for (int i = 0; i < testedString.length(); i++)
			assertTrue(Character.isLowerCase(testedString.charAt(i)));
		assertTrue(testedString.matches("[a-z]+"));
	}
	@Test
	public void upperCaseGeneratorDoesNotGoOutOfBounds(){
		String testedString = RandomStringGenerator.upperCase(100000);
		assertTrue(StringChecker.isUpperCaseWord(testedString));
		for (int i = 0; i < testedString.length(); i++)
			assertTrue(Character.isUpperCase(testedString.charAt(i)));
		assertTrue(testedString.matches("[A-Z]+"));
	}
	@Test
	public void integerGeneratorDoesNotGoOutOfBounds(){
		String testedString = RandomStringGenerator.integer(100000);
		assertTrue(StringChecker.isIntegerWord(testedString));
		for (int i = 0; i < testedString.length(); i++)
			assertTrue(Character.isDigit(testedString.charAt(i)));
		assertTrue(testedString.matches("[0-9]+"));
	}
	@Test
	public void allLettersGeneratorDoesNotGoOutOfBounds() {
		String testedString = RandomStringGenerator.allLetters(100000);
		assertTrue(StringChecker.isLetterWord(testedString));
		for (int i = 0; i < testedString.length(); i++)
			assertTrue(Character.isLetter(testedString.charAt(i)));
		assertTrue(testedString.matches("[a-zA-Z]+"));
	}
	@Test
	public void alphaNumericGeneratorDoesNotGoOutOfBounds() {
		String testedString = RandomStringGenerator.alphaNumeric(100000);
		assertTrue(StringChecker.isAlphaNumericWord(testedString));
		for (int i = 0; i < testedString.length(); i++)
			assertTrue(Character.isLetterOrDigit(testedString.charAt(i)));
		assertTrue(testedString.matches("[a-zA-Z0-9]+"));
	}
	@Test
	public void alphaNumericAndSpecialCharGeneratorDoesNotGoOutOfBounds() {
		String testedString = RandomStringGenerator.alphaNumericAndSpecialChars(100000);
		assertTrue(StringChecker.isAlphaNumericOrSpecialCharWord(testedString));
		assertTrue(testedString.matches("[!-~]+"));
	}
	@Test
	public void specialCharGeneratorDoesNotGoOutOfBounds() {
		String testedString = RandomStringGenerator.specialChars(100000);
		assertTrue(StringChecker.isSpecialCharWord(testedString));
		assertTrue(testedString.matches("[!-\\/:-@\\[-`\\{-~]+"));
	}
}
