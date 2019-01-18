package random_string_generator;

public class StringChecker {

	public static boolean isBetweenInclusive(int value, int low, int top){
		return value >= low && value <= top;
	}
	public static boolean isLowerCase(int value){
		return isBetweenInclusive(value, 97, 122);
	}
	public static boolean isUpperCase(int value){
		return isBetweenInclusive(value, 65, 90);
	}
	public static boolean isLowerCaseWord(String word){
		for(int i = 0; i < word.length(); i++)
			if(!isLowerCase(word.charAt(i)))
				return false;
		return true;
	}
	public static boolean isUpperCaseWord(String word){
		for(int i = 0; i < word.length(); i++)
			if(!isUpperCase(word.charAt(i)))
				return false;
		return true;
	}
	public static boolean isInteger(char c){
		return isBetweenInclusive(c, 48, 57);
	}
	public static boolean isIntegerWord(String word){
		for(int i = 0; i < word.length(); i++)
			if(!isInteger(word.charAt(i)))
				return false;
		return true;
	}
}
