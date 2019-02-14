package random_string_generator;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomStringTests {

	@Test
	public void testLowerCaseDoesNotGoOutOfBounds(){
		String testedString = RandomStringGenerator.lowerCase(100000);
		assertTrue(StringChecker.isLowerCaseWord(testedString));
		for (int i = 0; i < testedString.length(); i++)
			assertTrue(Character.isLowerCase(testedString.charAt(i)));
	}
	@Test
	public void testUpperCaseDoesNotGoOutOfBounds(){
		String testedString = RandomStringGenerator.upperCase(100000);
		assertTrue(StringChecker.isUpperCaseWord(testedString));
		for (int i = 0; i < testedString.length(); i++)
			assertTrue(Character.isUpperCase(testedString.charAt(i)));
	}
	@Test
	public void integerDoesNotGoOutOfBounds(){
		String testedString = RandomStringGenerator.integer(100000);
		assertTrue(StringChecker.isIntegerWord(testedString));
		for (int i = 0; i < testedString.length(); i++)
			assertTrue(Character.isDigit(testedString.charAt(i)));
	}
	@Test
	public void allLettersDoesNotGoOutOfBounds() {
		String testedString = RandomStringGenerator.allLetters(100000);
		assertTrue(StringChecker.isLetterWord(testedString));
		for (int i = 0; i < testedString.length(); i++)
			assertTrue(Character.isLetter(testedString.charAt(i)));
	}
	
	/*public boolean StringCheckerWorksOnLowerCase(Checker checker, String word) {
		//return checker.check(word);
	}
	public boolean StringCheckerCatchesUpperCase(Checker checker, String word) {
		//return checker.check(word);
	}*/
	/**
	 * This method holds the test cases for testing a StringChecker class method against white space.
	 * @param checker the method to test againt white space
	 * @return if the method returned true for <strong>any</strong> test
	 */
	public boolean StringCheckerCatchesWhiteSpace(Checker checker) {
		return checker.check("wgiuh vrevwhe") || checker.check(" ") || checker.check("8932749823 709321703723")
				|| checker.check("qwertyu iopasdfghjklmnbvcxzQWERTYUIOPLKJHGFDSAZXCVBNM") || checker.check("lai	dsfuh")
				|| checker.check("(%%&^(*& ()&(^(%$%$");
	}
	/**
	 * This method holds the test cases for testing a StringChecker class method against special chars.
	 * @param checker the method to test againt special chars
	 * @return if the method returned true for <strong>any</strong> test
	 */
	public boolean StringCheckerCatchesSpecialChars(Checker checker) {
		for (String word : "`-=[]\\\\,./;\\'~!@#$%^&*()_+{}|:<>?\\\"".split(""))
			if (checker.check(word))
				return true;
		return checker.check("8932749823!709321703723") || checker.check("8932749823#709321703723")
				|| checker.check("89327493217823'70903723") || checker.check("8932749823.709321703723")
				|| checker.check("89327*70932498231703723") || checker.check("89327497093217823%03723")
				|| checker.check("qwertyuiopasdfg(hjklmnbvcxzQWERTYUIOPLKJHGFDSAZXCVBNM");
	}

	@Test
	public void isLowerCaseWordWorksOnLowerCase(){
		assertTrue(StringChecker.isLowerCaseWord("abcdefghijklmnopqrstuvwxyz"));		
	}
	@Test
	public void isLowerCaseWordCatchesUpperCase() {
		for(String word: "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""))
			assertFalse(StringChecker.isLowerCaseWord(word));
	}
	@Test
	public void isLowerCaseWordCatchesWhiteSpace() {
		//assertFalse(StringChecker.isLowerCaseWord("wgiuh vrevwhe"));
		assertFalse(StringCheckerCatchesWhiteSpace(StringChecker::isLowerCaseWord));
	}
	@Test
	public void isLowerCaseWordCatchesSpecialChars() {
		/*for(String word: "`-=[]\\\\,./;\\'~!@#$%^&*()_+{}|:<>?\\\"".split(""))
			assertFalse(StringChecker.isLowerCaseWord(word));*/	
		assertFalse(StringCheckerCatchesSpecialChars(StringChecker::isLowerCaseWord));
	}

	@Test
	public void isUpperCaseWordWorksOnUpperCaseWord(){
		assertTrue(StringChecker.isUpperCaseWord("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));	
	}
	@Test
	public void isUpperCaseWordCatchesLowerCase() {
		for (String word : "abcdefghijklmnopqrstuvwxyz".split(""))
			assertFalse(StringChecker.isUpperCaseWord(word));
	}
	@Test
	public void isUpperCaseWordCatchesWhiteSpace() {
		//assertFalse(StringChecker.isUpperCaseWord(" "));
		assertFalse(StringCheckerCatchesWhiteSpace(StringChecker::isUpperCaseWord));
	}
	@Test
	public void isUpperCaseWordCatchesNumbers() {
		for (String word : "1234567890".split(""))
			assertFalse(StringChecker.isUpperCaseWord(word));
	}
	@Test
	public void isUpperCaseWordCatchesSpecialChars() {
		/*for(String word: "`-=[]\\\\,./;\\'~!@#$%^&*()_+{}|:<>?\\\"".split(""))
			assertFalse(StringChecker.isUpperCaseWord(word));*/
		assertFalse(StringCheckerCatchesSpecialChars(StringChecker::isUpperCaseWord));
	}
	
	@Test
	public void isIntegerWordWorksOnInteger(){
		assertTrue(StringChecker.isIntegerWord("8932749823709321703723"));
	}
	@Test
	public void isIntegerWordCatchesLetters(){
		for(String word: "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""))
			assertFalse(StringChecker.isIntegerWord(word));
		assertFalse(StringChecker.isIntegerWord("8932749823D709321703723"));
	}		
	@Test
	public void isIntegerWordCatchesWhiteSpace(){
		//assertFalse(StringChecker.isIntegerWord("8932749823 709321703723"));
		assertFalse(StringCheckerCatchesWhiteSpace(StringChecker::isIntegerWord));
	}
	@Test
	public void isIntegerWordCatchesSpecialChars(){
		/*for(String word: "`-=[]\\\\,./;\\'~!@#$%^&*()_+{}|:<>?\\\"".split(""))
			assertFalse(StringChecker.isIntegerWord(word));
		assertFalse(StringChecker.isIntegerWord("8932749823!709321703723"));
		assertFalse(StringChecker.isIntegerWord("8932749823#709321703723"));
		assertFalse(StringChecker.isIntegerWord("8932749823'709321703723"));
		assertFalse(StringChecker.isIntegerWord("8932749823.709321703723"));
		assertFalse(StringChecker.isIntegerWord("8932749823*709321703723"));
		assertFalse(StringChecker.isIntegerWord("8932749823%709321703723"));*/
		assertFalse(StringCheckerCatchesSpecialChars(StringChecker::isIntegerWord));
	}


	@Test
	public void isAllLettersWorksOnAllLetters() {
		assertTrue(StringChecker.isLetterWord("qwertyuiopasdfghjklmnbvcxzQWERTYUIOPLKJHGFDSAZXCVBNM"));
	}
	@Test
	public void isAllLettersCatchesSpecialChar() {
		/*for(String word: "`-=[]\\\\,./;\\'~!@#$%^&*()_+{}|:<>?\\\"".split(""))
			assertFalse(StringChecker.isLetterWord(word));
		assertFalse(StringChecker.isLetterWord("qwertyuiopasdfg(hjklmnbvcxzQWERTYUIOPLKJHGFDSAZXCVBNM"));*/
		assertFalse(StringCheckerCatchesSpecialChars(StringChecker::isLetterWord));
	}
	@Test
	public void isAllLettersCatchesWhiteSpace() {
		//assertFalse(StringChecker.isLetterWord("qwertyu iopasdfghjklmnbvcxzQWERTYUIOPLKJHGFDSAZXCVBNM"));
		assertFalse(StringCheckerCatchesWhiteSpace(StringChecker::isLetterWord));
	}
	@Test
	public void isAllLettersCatchesNumbers() {
		for (String word : "1234567890".split(""))
			assertFalse(StringChecker.isLetterWord(word));
		assertFalse(StringChecker.isLetterWord("qwertyuiopasdf6ghjklmnbvcxzQWERTYUIOPLKJHGFDSAZXCVBNM"));
	}

}
interface Checker{
	boolean check(String word);
}