package homeworkTasks;



public class Task2 {

	public static void main(String[] args) {
		

		/*
		 * Create a program to print out the name of the age group based on the age
		 * provided. Input: Age = 2 Output: Infancy
		 * 
		 * Input: Age = 3 Output: Toddler Infant = 1-2 year // Toddler = 3-4 yrs //
		 * Child = 5-12 yrs // Teen = 13-19 yrs // Adult = 20-39 yrs // Middle Age Adult
		 * = 40-59 yrs // Senior Adult = 60+
		 * 
		 */

		int age = 6; 
		
		if (age <= 1 && age <= 2) {
			System.out.println("infancy");
		} else if (age > 2 && age <= 4) {
			System.out.println("toddler");
		} else  if ( age >4 && age <= 12) {
			System.out.println("child");
			
		} else if ( age >= 13 && age <= 19) {
			System.out.println("teen");
		} else if ( age >= 20 && age <= 39) {
			System.out.println("Adult");
		}
		}
		

		



{}}
