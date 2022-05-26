package day14_StringReview;

public class Task7_StringCharacters {

	public static void main(String[] args) {
		/*
		 * # Task7 ` Write a method that asks user to enter a string. if the string is
		 * empty, print: string is empty if the string has more than 3 characters, print
		 * the last three characters if the string has less than or equal 3 characters,
		 * print the string itself `
		 */

		String str = "kjffk";
		 
		String report = "";
		if (str.length() <= 0) {
			System.out.println("string is empty");
		}else if (str.length() <= 3) {
			System.out.println(str);
		}else if (str.length() >3) {
			System.out.println("string is empty");
		}else {
			report = str.substring(str.length()- 3);
			
			
		}
		// IDK how to print the last 3 characters 
			
		
			
		}
		
		
		
		
		
		
	}


