package day9_;

public class Task4SumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print sum of even numbers between 1 to 100
		// 2+4+6+8.....=
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			if (i % 2 == 0) {
				// System.out.println(i);
				sum = sum + i;
			}
			System.out.println(sum);

			// while loop > print sum of even numbers
			/*
			 * int total = 0;
			 * 
			 * int count= 1;
			 * 
			 * while (count < 101) { if (count % 2 == 0) { total += count; //total = total +
			 * count // System.out.println(count); } count++; // break; }
			 * 
			 * System.out.println(total);
			 * 
			 * 
			 * Printing even numbers:
			 * int sum = 0
			 * for (int i = 0 ; i < 101; i +=2) {
			 * system.out.println(i);
			 * sum +=i; ======> will print sum of even numbers
			 * }
			 * 
			 */

		}

	}

}
