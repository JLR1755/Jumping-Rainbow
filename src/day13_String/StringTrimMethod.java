package day13_String;

public class StringTrimMethod {

	public static void main(String[] args) {
	
		
		String str = "           Hello";
		
		System.out.println(str);
		System.out.println(str.length());
		
		str = str.trim(); // remove spaces
		
		System.out.println(str.length());
				
		System.out.println(str);
		
		String str1 = "                            HELLER          "; // 44 spaces
		
		System.out.println(str1);
		System.out.println(str1.length());
		
		str1 = str1.trim(); // trims spaces
		
		System.out.println(str1);
	}

}
