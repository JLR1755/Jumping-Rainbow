package day6_controlFlow;

public class NestedIfExample {

	public static void main(String[] args) {

		double minimumSalary = 250000;
		int jobHistory = 15;
		int creditScore = 600;

		if (minimumSalary >= 30000) {

			if (jobHistory >= 2) {

				if (creditScore >= 680) {
					System.out.println("You are qualified for loan");
				} else {
					System.out.println("You are not qualified for loan");
				}
			} else {
				System.out.println("You must have minimum of 30k salary first");
			}

		}

	}

}
