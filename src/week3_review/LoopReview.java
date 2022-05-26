package week3_review;

public class LoopReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// While Loop >>> checks condition first and then executes the code
		int i = 0;
		while (i < 5) { //
			System.out.println("hi " + i);
			i++; // i++; has to be in between the {}
					// will print i = 0, 1, 2, 3, 4, 5
		}

		// Do While Loop >>> executes first and then checks conditions

		int j = 1;

		do {
			System.out.println("hi " + j);
			j++;
		} while (j < 10);

	}

}
