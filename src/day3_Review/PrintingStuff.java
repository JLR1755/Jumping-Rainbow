package day3_Review;

public class PrintingStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(); // print to the console the end with new line
		
		// %s = string
		// %d = digit (byte, short, int, long)
		// %f = floating (float, double)
		// %b = boolean (true, false)
		// %.2f = 3.4567 => 3.45, %.1f 45.231 => 45.2
		String message = "World";
		int age = 30;
	
		
		System.out.printf("Hello %s! Jessica is %d",message, age);
		System.out.println(); //creates a space to next line
		System.out.printf("Jessica is %d", age);
	}

}
