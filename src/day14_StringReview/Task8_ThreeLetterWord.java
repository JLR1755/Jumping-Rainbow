package day14_StringReview;

public class Task8_ThreeLetterWord {

	public static void main(String[] args) {
		/*
		 * ## Task8 ` write a program that asks the user enter a three letter word.
		 * Check if the middle character of the given word is 'a'. In the case it is
		 * print: "Cool word", but in the case the middle letter is not 'a' print:
		 * "Okay word". - If the user does not enter a 3 letter word tell them: If the
		 * word is less than 3 letters: "Word is too short" If the word is too long:
		 * "Word is too long"
		 * 
		 */

		
		String word = "wax";
		String response = "";
		
		if (word.length() <3) {
			response = "word is too short";
			
		}else if (word.length() > 3) {
			response= "word is too long";
		}else {
			if(word.charAt(1) == 'a') {
				response = "cool word";
				
			}else {
				response = "okay word";
			}
		}
		
		System.out.println(response);
		
		
		
		
		
	}

}
