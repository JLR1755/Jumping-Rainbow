package homework;

public class Task_H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int stylishness_Me = 0;
	      int stylishness_Date = 10;

	      if (stylishness_Me <= 2 || stylishness_Date <= 2) {
	         System.out.println("Sorry, but no table for both of you.");
	      }
	      else if (stylishness_Me >= 8 || stylishness_Date >= 8 ) {
	         System.out.println("Yes, you both will definitely get a table");
	      }
	      else {
	         System.out.println("Ahh, you maybe lucky tonight");
	      }
	}
	}
