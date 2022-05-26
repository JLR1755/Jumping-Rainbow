package day13_String;

public class GetDomainName {

	public static void main(String[] args) {
		
		// any email entered this program will print domain name

		String email = "help@aws.com";
		System.out.println(email.indexOf('@')); // 4
		
		System.out.println(email.substring(4+1));
		
		System.out.println(email.lastIndexOf('.'));
		System.out.println(email.substring(4+1, 12));
		
		int startingIndex = email.indexOf('@') + 1;
		
		int endingIndex = email.lastIndexOf('.');
		
		String domainName = email.substring(startingIndex, endingIndex);
		
		System.out.println(domainName);
		
		
	}

}
