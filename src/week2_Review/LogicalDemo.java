package week2_Review;

public class LogicalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Logical Operator = Boolean expression
		
		// NOT = ! = Unary Operator
		
		boolean isTall = true;
		System.out.println(!isTall); // false
		
		// AND - && => Binary Operator
		// all of operands need to be 'true', then result == 'true'
		
		boolean b1 = false && false; // false
		boolean b2 = false && true; // False
		boolean b3 = true && false; // False
		boolean b4 = true & true; // True
				
				
		// OR ||
		// At least one of operand is 'true', then result = 'true'
		
		System.out.println(true || false || false || true);
		
		/*
		 *  Precedence of logical operator
		 *  
		 *  1. ()
		 *  2. !
		 *  3. &&, ||
		 *  
		 * */
		
	
		boolean isHandsome = true;
		boolean isRich = true;
		boolean isMyType = isHandsome && isRich;
		System.out.println(isMyType);
		
		
		

	}

}
