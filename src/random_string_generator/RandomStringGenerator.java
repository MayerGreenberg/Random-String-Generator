package random_string_generator;

import java.util.Random;

public class RandomStringGenerator {
	static Random random = new Random();
	private RandomStringGenerator() {}

	private static String anyRandomString(int size, int lowBound, int topBound){
		char[] values = new char[size];
		for (int i = 0; i < values.length; i++)
			values[i] = (char) (random.nextInt(topBound - lowBound + 1) + lowBound);
		return new String(values);
	}
	public static String lowerCase(int size){
		return anyRandomString(size, 97, 122);
	}
	public static String upperCase(int size){
		return anyRandomString(size, 65, 90);
	}
	public static String number(int size){
		return anyRandomString(size, 48, 57);
	}
	public static String allLetters(int size){
		StringBuilder value = new StringBuilder(size);
		for(int i = 0; i < size; i++)
			 value.append(random.nextBoolean() ? lowerCase(1) : upperCase(1));
		return value.toString();
	}
	public static String alphaNumeric(int size){
		StringBuilder value = new StringBuilder(size);
		for (int i = 0; i < size; i++) {
			switch (random.nextInt(3)) {
			case 0:
				value.append(number(1));
				break;
			case 1:
				value.append(lowerCase(1));
				break;
			case 2:
				value.append(upperCase(1));
				break;
			}
		}
		return value.toString();
	}
	public static String alphaNumericAndSpecialChars(int size){
		return anyRandomString(size, 33, 126);
	}
	public static String specialChars(int size){
		StringBuilder value = new StringBuilder(size);
		for(int i = 0; i < size; i++){
			int choice = random.nextInt(32);
			if(isBetweenInclusive(choice, 0, 14))
				value.append(anyRandomString(1, 33, 47));
			else if(isBetweenInclusive(choice, 15, 21))
				value.append(anyRandomString(1, 58, 64));
			else if(isBetweenInclusive(choice, 22, 27))
				value.append(anyRandomString(1, 91, 96));
			else if(isBetweenInclusive(choice, 28, 31))
				value.append(anyRandomString(1, 123, 126));
		}
		return value.toString();
	}
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
			if(isUpperCase(word.charAt(i)))
				return false;
		return true;
	}
	public static boolean isUpperCaseWord(String word){
		for(int i = 0; i < word.length(); i++)
			if(isLowerCase(word.charAt(i)))
				return false;
		return true;
	}
}
