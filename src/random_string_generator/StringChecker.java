package random_string_generator;

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
}
