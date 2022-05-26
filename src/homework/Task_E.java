package homework;

public class Task_E {

	public static void main(String[] args) {
		// T

		/*
		 * 
		 * ## Task E - Lucky Number
		 * 
		 * A four-digit number `ABCD` is called lucky if `A` + `B` = `C` + `D`
		 * 
		 * Write a program that asks the user to enter a four-digit number and tell if
		 * the number is a lucky number or not. if it's a lucky number print `Yay,
		 * <number> is a lucky number`, otherwise print `Nah, <number> is not a lucky
		 * number`
		 ** 
		 * Example 1:**
		 * 
		 * ```text Please enter 4 digits number: >3719 Yay, 3719 is a lucky number ```
		 ** 
		 * Example 2:**
		 * 
		 * ```text Please enter 4 digits number: >3521 Nah, 3521 is not a lucky number
		 */

		int a = 10;
		int b = 10;
		int c = 10;
		int d = 12;

		int total = a + b + c + d;

		if (a + b == c + d) {
			System.out.println("yay " + total + " is a lucky number");

		} else {
			System.out.println("Nah, " + total + " is not a lucky number");
		}

	}
}
