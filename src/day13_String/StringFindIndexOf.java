package day13_String;

public class StringFindIndexOf {

	public static void main(String[] args) {
		

		String name = "President George Washington";
		System.out.println(name.indexOf('e'));
		System.out.println(name.indexOf("George"));
		System.out.println(name.indexOf('P'));
		System.out.println(name.indexOf('e', 3));
		System.out.println(name.indexOf("Bob"));
		System.out.println(name.lastIndexOf('e')); 
		
		System.out.println(name.charAt(8)); // t
		
		
	}

}
