package day14_StringReview;

public class Task2_Review {

	public static void main(String[] args) {
		/*
		 * Task2 `Create a class called Reverse, write a program that will reverse a
		 * string. Your program should reverse a string only 5 characters long. If word
		 * is shorter, display message: "Too short!". If word is longer, display
		 * message: "Too long!". Otherwise, reverse this word and print out result into
		 * the console.
		 */

		String str = "Pizza";

		if (str.length() == 5) {
			// reverse your string
//            System.out.print(str.charAt(4));
//            System.out.print(str.charAt(3));
//            System.out.print(str.charAt(2));
//            System.out.print(str.charAt(1));
//            System.out.print(str.charAt(0));
//            System.out.println();

			for (int i = str.length() - 1; i >= 0; i--) {
//                System.out.println(i);
				System.out.print(str.charAt(i));
			}

		} else if (str.length() > 5) {
			System.out.println("Too long!");
		} else {
			System.out.println("Too short");
		}

	}

}
