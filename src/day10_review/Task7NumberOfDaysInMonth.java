package day10_review;

public class Task7NumberOfDaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// print how many days in a month
		
		int days = 0;
		int month = 8;
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 2:
			days = 28;
			break;
			default:
				days = 30;
		}
			System.out.println(days);
	}
}
