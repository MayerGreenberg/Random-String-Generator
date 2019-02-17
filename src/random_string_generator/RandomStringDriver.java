package random_string_generator;

import java.util.Date;

public class RandomStringDriver {

	public static void main(String[] args) {
		Date now = new Date();
		int[] arr = new int[1];
		for (int i = 0; i < arr.length; i++)
			arr[i] = howManyTriesTilRandomString();
		System.out.println("Total time" + (new Date().getTime() - now.getTime()) + " milliseconds");
		 System.out.println(avg(arr));
	}
	public static int howManyTriesTilRandomString() {
		Date now = new Date();
		for (int i = 0; i != -1; i++) {
			String x = RandomStringGenerator.lowerCase(2);
			//System.out.println(i + ") " + x);
			if (x.equals("av")) {
				//System.out.println((new Date().getTime() - now.getTime()) + " milliseconds");
				return i;//break;
			}
		}
		
		return 0;
	}
	public static double avg(int[] arr) {
		double d = 0;
		for(int x: arr)
			d += x;
		return d / arr.length;
	}
}
