package day5_operators;

import java.util.Scanner;

public class ScannerObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner s = new Scanner(System.in);
        
        
       //  System.out.println("Plese type number A");
//        int a = 20;
    //    int a = s.nextInt();
        
      //  System.out.println("Plese type number B");
        //int b = 20;
        // int b = s.nextInt();
        
       // int result = a + b;
        
       // System.out.println(result);
        
       // s.close();

System.out.println("What's your name?");

String name = s.nextLine();

System.out.println("Hello "+name);


s.close();

	}

}
