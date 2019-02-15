package random_string_generator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringCheckerTests {

	
//	public boolean StringCheckerWorksOnLowerCase(Checker checker, String word) {
//		// return checker.check(word);
//	}
//
//	public boolean StringCheckerCatchesUpperCase(Checker checker, String word) { // return
//		checker.check(word);
//	}
//
//	public boolean StringCheckerCatchesNumbers(IStringChecker checker) {
//		
//	}
	/**
	 * This method holds the test cases for testing a StringChecker class method
	 * against white space.
	 * 
	 * @param checker the method to test againt white space
	 * @return if the method returned true for <strong>any</strong> test
	 */
	public boolean StringCheckerCatchesWhiteSpace(IStringChecker checker) {
		return checker.check("wgiuh vrevwhe") || checker.check(" ") || checker.check("8932749823 709321703723")
				|| checker.check("qwertyu iopasdfghjklmnbvcxzQWERTYUIOPLKJHGFDSAZXCVBNM") || checker.check("lai	dsfuh")
				|| checker.check("(%%&^(*& ()&(^(%$%$");
	}

	/**
	 * This method holds the test cases for testing a StringChecker class method
	 * against special chars.
	 * 
	 * @param checker the method to test againt special chars
	 * @return if the method returned true for <strong>any</strong> test
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
		for (String word : "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""))
			assertFalse(StringChecker.isLowerCaseWord(word));
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
	public void isUpperCaseWordWorksOnUpperCaseWord() {
		assertTrue(StringChecker.isUpperCaseWord("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
	}

	@Test
	public void isUpperCaseWordCatchesLowerCase() {
		for (String word : "abcdefghijklmnopqrstuvwxyz".split(""))
			assertFalse(StringChecker.isUpperCaseWord(word));
	}

	@Test
	public void isUpperCaseWordCatchesWhiteSpace() {
		assertFalse(StringCheckerCatchesWhiteSpace(StringChecker::isUpperCaseWord));
	}

	@Test
	public void isUpperCaseWordCatchesNumbers() {
		for (String word : "1234567890".split(""))
			assertFalse(StringChecker.isUpperCaseWord(word));
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
	public void isIntegerWordCatchesLetters() {
		for (String word : "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""))
			assertFalse(StringChecker.isIntegerWord(word));
		assertFalse(StringChecker.isIntegerWord("8932749823D709321703723"));
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
	public void isAllLettersCatchesSpecialChar() {
		assertFalse(StringCheckerCatchesSpecialChars(StringChecker::isLetterWord));
	}

	@Test
	public void isAllLettersCatchesWhiteSpace() {
		assertFalse(StringCheckerCatchesWhiteSpace(StringChecker::isLetterWord));
	}

	@Test
	public void isAllLettersCatchesNumbers() {
		for (String word : "1234567890".split(""))
			assertFalse(StringChecker.isLetterWord(word));
		assertFalse(StringChecker.isLetterWord("qwertyuiopasdf6ghjklmnbvcxzQWERTYUIOPLKJHGFDSAZXCVBNM"));
	}
	
	
	
}
interface IStringChecker{
	boolean check(String word);
}
