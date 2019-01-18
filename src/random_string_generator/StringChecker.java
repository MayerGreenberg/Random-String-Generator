package random_string_generator;

interface CheckerMethod {
	boolean check(String word);
}

public class StringChecker {

	public static boolean isBetweenInclusive(int value, int low, int top){
		return value >= low && value <= top;
	}
	public static boolean isLowerCaseWord(String word){
		for(int i = 0; i < word.length(); i++)
			if(!Character.isLowerCase(word.charAt(i)))
				return false;
		return true;
	}
	public static boolean isUpperCaseWord(String word){
		for(int i = 0; i < word.length(); i++)
			if(!Character.isUpperCase(word.charAt(i)))
				return false;
		return true;
	}
	public static boolean isIntegerWord(String word){
		for(int i = 0; i < word.length(); i++)
			if(!Character.isDigit(word.charAt(i)))
				return false;
		return true;
	}
}
