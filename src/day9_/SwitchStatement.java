package day9_;

public class SwitchStatement {

	public static void main(String[] args) {
		

		char grade = 'W';
		
		switch (grade) 
		{
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		System.out.println("pass");
		break;
		case 'W':
			System.out.println("Withdraw");
		break;
		case 'I':
			System.out.println("Incomplete");
			break;
		default:
			System.out.println("Fail");
			
			
		
		
		}
		
		

	}

}
