package day6_controlFlow;

public class CheckAge {

	public static void main(String[] args) {
		
		
		
		/*
        1. write a program that can check if the person is eligible to buy alcohol
                Ex:
                    name = "James"
                    age = 19
                    output:
                        James is eligible to buy alcohol?
                            false
         */

		
		String name = "James";
		int age = 19 ;
		String message = name + " is eligible to buy alcohol?";
		boolean isEligible = age >=21;
			
			
		
		System.out.println(message);
		System.out.println(isEligible);
		}
			
			

				
				
	}


