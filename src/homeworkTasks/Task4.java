package homeworkTasks;

import java.util.Scanner;

public class Task4 {
	
	// using scanner to get days of the week 
	
	
		public static void main (String[] args) {
			// days of the week
			
			Scanner dayOftheWeek = new Scanner(System.in);
			
			System.out.println("Please input your day's number:");
			int n = dayOftheWeek.nextInt();
			if (n==1) System.out.println("Monday");
			if (n==2) System.out.println("Tuesday");
			if (n==3) System.out.println("Wednesday");
			if (n==4) System.out.println("Thursday");
			if (n==5) System.out.println("Friday");
			if (n==6) System.out.println("Saturday");
			if (n==7) System.out.println("Sunday");
			dayOftheWeek.close();
		

	
	
	
	
	
}
}