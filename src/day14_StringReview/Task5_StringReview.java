package day14_StringReview;

public class Task5_StringReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ## Task5 `Your team has created a new bank website that requires email
		 * address to be validated. The email string must contain an '@' character. The
		 * email string must contain an '.' character. The '@' must contain at least one
		 * character in front of it. e.g. "a@example.com" is valid while "@example.com"
		 * is invalid. The '.' and '@' must be in the appropriate places. e.g.
		 * "mike.smith@com" is invalid while "mike.smith@example.com" is valid. For a
		 * given string, find a solution that writes true on the console if an email is
		 * valid and false if it is invalid. Examples: str = "test@example.com" --> true
		 * str = "test@example.co.in --> true str = "@example.com" --> false
		 */
		
		String email = "jlr1755@gmail.com";
		
		System.out.println(email.contains("@"));
		System.out.println(email.contains("."));
		
		int at = email.indexOf('@');
		int dot = email.indexOf('.');
		
		if (at > 0 && at < dot) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
		
		
				
		
	
		
		
        }
		
		}
		
		
		
		
		




