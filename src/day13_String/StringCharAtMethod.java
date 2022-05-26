package day13_String;

public class StringCharAtMethod {

	public static void main(String[] args) {
		
		String name = "Tech Circle School Is Cool"; 
//		
//		System.out.println(name.charAt(0)); // prints letter at 0 = 'T'
//		System.out.println(name.charAt(9)); // 'e'
//		
//		System.out.println(name.charAt(4)); // "C"
		
		
		for (int i = 0; i < name.length(); i ++)
		{
			//System.out.println(i);
			System.out.println(name.charAt(i));
		}
		

	}

}
