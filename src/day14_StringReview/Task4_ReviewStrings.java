package day14_StringReview;

public class Task4_ReviewStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print "same" if first and last character are the same
		
		  
		String str = "MammamiaMa";
	        
	        char first = str.charAt(0);
	        char last = str.charAt(str.length() - 1);
	        
	        if(first == last) {
	            System.out.println("Same");
	        }else {
	            System.out.println("Different");
	            
	            
	        }
		}
	}


