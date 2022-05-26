package day13_String;

public class StringReplaceMethod {

	public static void main(String[] args) {
		
		String word = "car";
			word = word.replace('r', 't');
			System.out.println(word);
		
		String str = "tomato";
		
		str = str.replace("to", "MO");
		System.out.println(str);
		
		String str1 = "Hello Silly Face How Are You";
		str1 = str1.replace(" ", ""); // removes spaces 
		 System.out.println(str1);
		 
	}

}
