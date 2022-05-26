package homeworkTasks;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner value = new Scanner (System.in);
		
		
		/*
		 * 
		 *  n1 = -1.0
            n2 =  4.5
            n3 = -5.3
*/
		double n1 = -1.0;
		double n2 = 4.5;
		double n3 = -5.3;
		if ((n1 > n2) &&(n3>n2) || (n3 > n1) && (n3 > n1 )) {
		System.out.println("n1 is is greater");
		}else if ((n2>1) && (n2>n3)){
		System.out.println("n2 is is greater");
		}
		else {System.out.println("all are equal");
		}
		} 
		

	}



