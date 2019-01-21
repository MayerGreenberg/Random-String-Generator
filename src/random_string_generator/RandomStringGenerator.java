package random_string_generator;

import java.util.Random;
/**
 * This class gives functionality to create different types of random strings
 * @author Greenberg
 * 
 * 
 */
public class RandomStringGenerator {
	/**
	 * random generates the random characters
	 */
	private static Random random = new Random();
	/**
	 * private constructor prevents instantiation because all methods are static
	 */
	private RandomStringGenerator() {}

	/**
	 * This method is the one all the other methods use
	 *  to generate the correct random String with the
	 *   ascii-character-value limits passed in.
	 * @param size the size of the word
	 * @param lowBound the lowest possible ascii value
	 *  for a character in the requested word
	 * @param topBound the highest possible ascii
	 *  value for a character in the requested word
	 * @return the requested random String
	 */
	private static String anyRandomString(int size, int lowBound, int topBound){
		char[] values = new char[size];
		for (int i = 0; i < values.length; i++)
			values[i] = anyRandomChar(size, lowBound, topBound);
		return new String(values);
	}
	/**
	 * This method generates the random characters for anyRandomString()with the
	 * ascii-character-value limits passed in.
	 * @param size the size of the word
	 * @param lowBound the lowest possible ascii value
	 *  for the requested character
	 * @param topBound the highest possible ascii
	 *  value for the requested character
	 * @return the requested random character
	 */
	private static char anyRandomChar(int size, int lowBound, int topBound) {
		return (char) (random.nextInt(topBound - lowBound + 1) + lowBound);
	}
	/**
	 * This method returns a random lowercase String
	 * @param size the size of the word
	 * @return a random lowercase String
	 */
	public static String lowerCase(int size){
		return anyRandomString(size, 97, 122);
	}
	/**
	 * This method returns a random uppercase String
	 * @param size the size of the word
	 * @return a random uppercase String
	 */
	public static String upperCase(int size){
		return anyRandomString(size, 65, 90);
	}
	/**
	 * This method returns a random String made up of numbers
	 * @param size the size of the word
	 * @return a random String of numbers
	 */
	public static String integer(int size){
		return anyRandomString(size, 48, 57);
	}
	/**
	 * This method returns a random String made up of uppercase
	 *  and lowercase letters
	 * @param size the size of the word
	 * @return the random String of uppercase and lowercase letters
	 */
	public static String allLetters(int size){
		StringBuilder value = new StringBuilder(size);
		for(int i = 0; i < size; i++)
			 value.append(random.nextBoolean() ? lowerCase(1) : upperCase(1));
		return value.toString();
	}
	/**
	 * This method returns a random String made up of uppercase
	 *  and lowercase letters and numbers
	 * @param size the size of the word
	 * @return a random String made up of uppercase
	 *  and lowercase letters and numbers
	 */
	public static String alphaNumeric(int size){
		StringBuilder value = new StringBuilder(size);
		for (int i = 0; i < size; i++) {
			switch (random.nextInt(3)) {
			case 0:
				value.append(integer(1));
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
	/**
	 * This method returns a random String made up of uppercase
	 *  and lowercase letters, numbers, and special characters
	 *  (punctuation, math symbols...)
	 * @param size the size of the word
	 * @return a random String made up of uppercase
	 *  and lowercase letters, numbersand special characters
	 *  (punctuation, math symbols...)
	 */
	public static String alphaNumericAndSpecialChars(int size){
		return anyRandomString(size, 33, 126);
	}
	/**
	 * This method returns a random String made up of special characters
	 *  (punctuation, math symbols...)
	 * @param size the size of the word
	 * @return the random String made up of Special characters
	 * (punctuation, math symbols...)
	 */
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
	/**
	 * This method tests if a certain integer or character is between or equal to
	 * certain values 
	 * @param value the integer or character to test
	 * @param low the lowest value for the test to pass
	 * @param top the highest value for the test to pass
	 * @return if the value passed the test
	 */
	public static boolean isBetweenInclusive(int value, int low, int top){
		return value >= low && value <= top;
	}
}
