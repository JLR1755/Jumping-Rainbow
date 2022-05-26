package week3_review;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// write program to count number of digits - 345234 has 6 digits
		
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		System.out.println("Enter number :");
		int num = sc.nextInt();
		while (num!=0) {
			num =  num/10;
			count++;
		}
		System.out.println("number of digits in the entered integer are : "+count);
		
		
		
	}

}
