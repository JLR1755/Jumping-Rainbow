package day9_;

public class TaskLoops {

	public static void main(String[] args) {

		// while loop
		// while (condition) {
		// statement
		// }

		int num = 20;
		while (num <= 30) {
			System.out.println(num);
			num++;
		}

		System.out.println("current value of vairalbes num is " + num);

		System.out.println("------------------");

		num = 20;

		// Do while loop
		// do {
		// your code
		// }while (condition is true);

		do {
			System.out.println(num);
			num++;
		} while (num <= 30);

		System.out.println("------------------");

		// for loop

		for (int i = 20; i <= 30; i++) {
			System.out.println(i);
		}

	}

}
