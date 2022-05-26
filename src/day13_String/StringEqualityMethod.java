package day13_String;

public class StringEqualityMethod {

	public static void main(String[] args) {
		
		
		String word1= "Hello";
		String word2= "hello";
		
		boolean b = word1.equals(word2);
		
				b = word1.equalsIgnoreCase(word2);
				
		b = "Raiders".equals("Raiders");
		b = "Raiders".equals("raiders");
		b = "Raiders".equalsIgnoreCase("raiders");
		
		String team = "Raiders";
		
		if(team.equalsIgnoreCase("raiders"))
			System.out.println("Go You " + team);

	}

}
