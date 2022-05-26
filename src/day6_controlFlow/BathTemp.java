package day6_controlFlow;

import java.util.Scanner;

public class BathTemp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter your bath temperature");
		
		int bathTemp = scan.nextInt();
	 
		// TODO Auto-generated method stub
		
		// int bathTemp = 80;
		
		if (bathTemp < 90) {
			System.out.println("Brrr!");	
		}
		
		if (bathTemp > 90 && bathTemp < 95); {
			System.out.println("That's lukewarm");
		}
		if (bathTemp >= 95 && bathTemp <=105); {
			System.out.println("That's lukewarm");
		}
		if (bathTemp >=105 && bathTemp <= 110); {
			System.out.println("This is a hto tub!");
		}
		if (bathTemp >= 110);{
			System.out.println("Are you trying to boil a lobster?");	
		}
		
		
	}
}


		

