package day4_operators;

public class ArthmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// + , - , * , / , % , ++ , --
		
		int a = 10;
		int b = 20;
		
		System.out.println(a+b);
		System.out.println(a/b);
		System.out.println(a*b);
		System.out.println();
		System.out.println();
		
		double result = a / b;
		System.out.println(result);
		
		double valueA = a;
		double valueB = b;
		
		double result2 = valueA/valueB;
		System.out.println(result2);
		
		
		// ++
		int valueC = 1;
		System.out.println(valueC);
		
		valueC = valueC + 1;
		valueC = valueC + 1;
		
		System.out.println(valueC);
		
		valueC++; //valueC = valueC + 1 
		valueC++;
		valueC++;
		valueC++;
		
		System.out.println(valueC); // 7
		
		valueC--; // valueC (7) - 1
		
		System.out.println(valueC); // 6
		
		
		// % --> prints remainder 
		int A = 10;
		int B = 3;
		 System.out.println(A/B); // 3
		 System.out.println(A%B); // 1
		 
		 System.out.println(10%4); // 2
		 
		 System.out.println(99 % 2 == 1); // true
		 
		 
		 
		
		
		
	}

}
