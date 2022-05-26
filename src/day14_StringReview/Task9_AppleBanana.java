package day14_StringReview;

import java.util.Scanner;

public class Task9_AppleBanana {

	public static void main(String[] args) {
		/*
		 * ## Task9 ` Ask user to enter two words. Print first word without its first
		 * character then print the second word without its first character. Input:
		 * apple banana Output: ppleanana `
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter two words: ");
		
		String word1 = scan.next(); // apple
		String word2 =  scan.next(); // banana
		
		String wordOutput1= word1.substring(1); // pple
		String wordOutput2= word2.substring(1); // anana
		
		System.out.println(wordOutput1 + wordOutput2);
		
		
		
	}

}
