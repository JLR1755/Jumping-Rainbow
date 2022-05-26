package day13_String;

public class StringSubStringMethod {

	public static void main(String[] args) {
		

		String str1 = "Television";
		System.out.println(str1.substring(4)); // will print 'vision'
		
		System.out.println(str1.substring(2,5)); // 'lev'
		
		String str2= "Immutable";
		
		System.out.println(str2.substring(2)); // 'mutable'
		
		System.out.println(str2.substring(4)); // 'table'
		
		String email = "firstName.lastName@domainName.com";
		String gmail = "irfan.techcircle@gmail.com";
		
		System.out.println(gmail.indexOf('g')); // 17
		System.out.println(gmail.lastIndexOf('.')); // 22
		
		String domainName = gmail.substring(17,22);
		System.out.println(domainName);
		
		System.out.println(gmail.substring(gmail.indexOf('g'), gmail.lastIndexOf('.'))); // one line to create 'gmail'
		
		
		
		
		
	}

}
