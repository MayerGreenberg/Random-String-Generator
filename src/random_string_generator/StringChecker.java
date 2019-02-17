package random_string_generator;

import static org.junit.Assert.assertTrue;

interface CheckerMethod {
	boolean check(String word);
}

public class StringChecker {


	public static boolean isLowerCaseWord(String word){
		return word.matches("[a-z]+");
	}
	public static boolean isUpperCaseWord(String word){
		return word.matches("[A-Z]+");
	}
	public static boolean isIntegerWord(String word){
		return word.matches("[0-9]+");
	}
	public static boolean isLetterWord(String word) {
		return word.matches("[a-zA-Z]+");
	}
	public static boolean isAlphaNumericWord(String word) {
		return word.matches("[a-zA-Z0-9]+");
	}
	public static boolean isAlphaNumericOrSpecialCharWord(String word) {
		return word.matches("[!-~]+");
	}
	public static boolean isSpecialCharWord(String word) {
		return word.matches("[!-\\/:-@\\[-`\\{-~]+");
	}
}
