package random_string_generator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringCheckerTests {

	
	/**
	 * This method holds the test cases for testing a StringChecker class method
	 * against lowercase letters.Returning true means that the method considers the 
	 * tested string as passing the test as one of its own, so all the tests should
	 * return false if the method tests strings correctly.
	 * 
	 * @param checker the method to test against lowercase letters
	 * @return True if the method doesn't work and counts the test cases as passing its test.
	 * False if the method does work and doesn't counts the test cases as passing its test.
	 */
	public boolean StringCheckerCatchesLowerCase(IStringChecker checker) {
		for (String word : "abcdefghijklmnopqrstuvwxyz".split(""))
			if(checker.check(word))
				return true;
		return false;
	}
	/**
	 * This method holds the test cases for testing a StringChecker class method
	 * against uppercase letters.Returning true means that the method considers the 
	 * tested string as passing the test as one of its own, so all the tests should
	 * return false if the method tests strings correctly.
	 * 
	 * @param checker the method to test against uppercase letters
	 * @return True if the method doesn't work and counts the test cases as passing its test.
	 * False if the method does work and doesn't counts the test cases as passing its test.
	 */
	public boolean StringCheckerCatchesUpperCase(IStringChecker checker) {
		for (String word : "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""))
			if(checker.check(word))
				return true;
		return false;
	}
	/**
	 * This method holds the test cases for testing a StringChecker class method
	 * against all letters.Returning true means that the method considers the 
	 * tested string as passing the test as one of its own, so all the tests should
	 * return false if the method tests strings correctly.
	 * 
	 * @param checker the method to test against all letters
	 * @return True if the method doesn't work and counts the test cases as passing its test.
	 * False if the method does work and doesn't counts the test cases as passing its test.
	 */
	public boolean StringCheckerCatchesAllLetters(IStringChecker checker) {
		for (String word : "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""))
			if(checker.check(word))
				return true;
		return checker.check("8932749823D709321703723");
	}
	/**
	 * This method holds the test cases for testing a StringChecker class method
	 * against numbers.Returning true means that the method considers the 
	 * tested string as passing the test as one of its own, so all the tests should
	 * return false if the method tests strings correctly.
	 * 
	 * @param checker the method to test against numbers
	 * @return True if the method doesn't work and counts the test cases as passing its test.
	 * False if the method does work and doesn't counts the test cases as passing its test.
	 */
	public boolean StringCheckerCatchesNumbers(IStringChecker checker) {
		for (String word : "1234567890".split(""))
			if(checker.check(word))
				return true;
		return checker.check("qwertyuiopasdf6ghjklmnbvcxzQWERTYUIOPLKJHGFDSAZXCVBNM");
	}

	/**
	 * This method holds the test cases for testing a StringChecker class method
	 * against white space.Returning true means that the method considers the 
	 * tested string as passing the test as one of its own, so all the tests should
	 * return false if the method tests strings correctly.
	 * 
	 * @param checker the method to test against white space
	 * @return True if the method doesn't work and counts the test cases as passing its test.
	 * False if the method does work and doesn't counts the test cases as passing its test.
	 */
	public boolean StringCheckerCatchesWhiteSpace(IStringChecker checker) {
		return checker.check("wgiuh vrevwhe") || checker.check(" ") || checker.check("8932749823 709321703723")
				|| checker.check("qwertyu iopasdfghjklmnbvcxzQWERTYUIOPLKJHGFDSAZXCVBNM") || checker.check("lai	dsfuh")
				|| checker.check("(%%&^(*& ()&(^(%$%$");
	}

	/**
	 * This method holds the test cases for testing a StringChecker class method
	 * against special chars. Returning true means that the method considers the 
	 * tested string as passing the test as one of its own, so all the tests should
	 * return false if the method tests strings correctly.
	 * 
	 * @param checker the method to test against special chars
	 * @return True if the method doesn't work and counts the test cases as passing its test.
	 * False if the method does work and doesn't counts the test cases as passing its test.
	 */
	public boolean StringCheckerCatchesSpecialChars(IStringChecker checker) {
		for (String word : "`-=[]\\\\,./;\\'~!@#$%^&*()_+{}|:<>?\\\"".split(""))
			if (checker.check(word))
				return true;
		return checker.check("8932749823!709321703723") || checker.check("8932749823#709321703723")
				|| checker.check("89327493217823'70903723") || checker.check("8932749823.709321703723")
				|| checker.check("89327*70932498231703723") || checker.check("89327497093217823%03723")
				|| checker.check("qwertyuiopasdfg(hjklmnbvcxzQWERTYUIOPLKJHGFDSAZXCVBNM");
	}

	
	
	
	@Test
	public void isLowerCaseWordWorksOnLowerCase() {
		assertTrue(StringChecker.isLowerCaseWord("abcdefghijklmnopqrstuvwxyz"));
	}

	@Test
	public void isLowerCaseWordCatchesUpperCase() {
		assertFalse(StringCheckerCatchesUpperCase(StringChecker::isLowerCaseWord));
		/*for (String word : "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""))
			assertFalse(StringChecker.isLowerCaseWord(word));*/
	}

	@Test
	public void isLowerCaseWordCatchesWhiteSpace() {
		// assertFalse(StringChecker.isLowerCaseWord("wgiuh vrevwhe"));
		assertFalse(StringCheckerCatchesWhiteSpace(StringChecker::isLowerCaseWord));
	}

	@Test
	public void isLowerCaseWordCatchesSpecialChars() {
		assertFalse(StringCheckerCatchesSpecialChars(StringChecker::isLowerCaseWord));
	}
	
	@Test
	public void isLowerCaeWordCatchesNumbers() {
		assertFalse(StringCheckerCatchesNumbers(StringChecker::isLowerCaseWord));
	}

	
	
	
	@Test
	public void isUpperCaseWordWorksOnUpperCaseWord() {
		assertTrue(StringChecker.isUpperCaseWord("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
	}

	@Test
	public void isUpperCaseWordCatchesLowerCase() {
		assertFalse(StringCheckerCatchesLowerCase(StringChecker::isUpperCaseWord));
		/*for (String word : "abcdefghijklmnopqrstuvwxyz".split(""))
			assertFalse(StringChecker.isUpperCaseWord(word));*/
	}

	@Test
	public void isUpperCaseWordCatchesWhiteSpace() {
		assertFalse(StringCheckerCatchesWhiteSpace(StringChecker::isUpperCaseWord));
	}

	@Test
	public void isUpperCaseWordCatchesNumbers() {
		assertFalse(StringCheckerCatchesNumbers(StringChecker::isUpperCaseWord));
		/*for (String word : "1234567890".split(""))
			assertFalse(StringChecker.isUpperCaseWord(word));*/
	}

	@Test
	public void isUpperCaseWordCatchesSpecialChars() {
		assertFalse(StringCheckerCatchesSpecialChars(StringChecker::isUpperCaseWord));
	}
	
	
	

	@Test
	public void isIntegerWordWorksOnInteger() {
		assertTrue(StringChecker.isIntegerWord("8932749823709321703723"));
	}

	@Test
	public void isIntegerWordCatchesAllLetters() {
		/*for (String word : "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""))
			assertFalse(StringChecker.isIntegerWord(word));
		assertFalse(StringChecker.isIntegerWord("8932749823D709321703723"));*/
		assertFalse(StringCheckerCatchesAllLetters(StringChecker::isIntegerWord));
	}

	@Test
	public void isIntegerWordCatchesWhiteSpace() {
		// assertFalse(StringChecker.isIntegerWord("8932749823 709321703723"));
		assertFalse(StringCheckerCatchesWhiteSpace(StringChecker::isIntegerWord));
	}

	@Test
	public void isIntegerWordCatchesSpecialChars() {
		assertFalse(StringCheckerCatchesSpecialChars(StringChecker::isIntegerWord));
	}

	
	
	
	@Test
	public void isAllLettersWorksOnAllLetters() {
		assertTrue(StringChecker.isLetterWord("qwertyuiopasdfghjklmnbvcxzQWERTYUIOPLKJHGFDSAZXCVBNM"));
	}

	@Test
	public void isAllLettersCatchesSpecialChars() {
		assertFalse(StringCheckerCatchesSpecialChars(StringChecker::isLetterWord));
	}

	@Test
	public void isAllLettersCatchesWhiteSpace() {
		assertFalse(StringCheckerCatchesWhiteSpace(StringChecker::isLetterWord));
	}

	@Test
	public void isAllLettersCatchesNumbers() {
		assertFalse(StringCheckerCatchesNumbers(StringChecker::isLetterWord));
		/*for (String word : "1234567890".split(""))
			assertFalse(StringChecker.isLetterWord(word));
		assertFalse(StringChecker.isLetterWord("qwertyuiopasdf6ghjklmnbvcxzQWERTYUIOPLKJHGFDSAZXCVBNM"));*/
	}
	
	
	
	@Test
	public void isAlphaNumericWorksOnNumbersAndAllLetters() {
		assertTrue(StringChecker.isAlphaNumericWord("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));		
	}
	@Test
	public void isAlphaNumericCatchesSpecialChars() {
		assertFalse(StringCheckerCatchesSpecialChars(StringChecker::isAlphaNumericWord));
	}
	@Test
	public void isAlphaNumericCatchesWhiteSpace() {
		assertFalse(StringCheckerCatchesWhiteSpace(StringChecker::isAlphaNumericWord));
	}
	
	
	
	@Test
	public void isAlphaNumericOrSpecialCharWorksOnNumbersAndAllLettersAndSpecialChars() {
		assertTrue(StringChecker.isAlphaNumericOrSpecialCharWord(
				"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789`~!@#$%^&*()-_=+\\|]}[{];:,<.>/?\'\""));
	}
	@Test
	public void isAlphaNumericOrSpecialCharCatchesWhiteSpace() {
		assertFalse(StringCheckerCatchesWhiteSpace(StringChecker::isAlphaNumericOrSpecialCharWord));
	}
	
	
	
	
	@Test
	public void isSpecialCharWorksOnSpecialChars() {
		assertTrue(StringChecker.isSpecialCharWord("`~!@#$%^&*()_-+=<,>.?/:;\"\'{[}]|\\"));
	}
	@Test
	public void isSpecialCharCatchesAllLetters() {
		assertFalse(StringCheckerCatchesAllLetters(StringChecker::isSpecialCharWord));
	}
	@Test
	public void isSpecialCharCatchesWhiteSpace() {
		assertFalse(StringCheckerCatchesWhiteSpace(StringChecker::isSpecialCharWord));
	}

	@Test
	public void isSpecialCharCatchesNumbers() {
		assertFalse(StringCheckerCatchesNumbers(StringChecker::isSpecialCharWord));
	}
	
	
	
	
}
interface IStringChecker{
	boolean check(String word);
}
