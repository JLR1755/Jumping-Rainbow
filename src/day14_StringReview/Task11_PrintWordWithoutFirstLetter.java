package day14_StringReview;

public class Task11_PrintWordWithoutFirstLetter {

	public static void main(String[] args) {
		/*
		 * Task11 ` Ask user to enter a word. If the work starts with x, print the word
		 * without x. Input: xcode Output: code
		 */

		String word = "xcell";
		
		if(word.startsWith("x")) {
			
			String word1 = word.substring(1);
			System.out.println(word1);
			
		}else {
		System.out.println(word);
		
		
		
	}

}
}