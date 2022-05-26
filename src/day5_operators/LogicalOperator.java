package day5_operators;

public class LogicalOperator {

	public static void main(String[] args) {
		
		
		// & , || , !
		
		// & AND
		
		/*
		 * ConditionA   ConditionB  Result
		 *   true          true       true
		 *    true         false       false
		 *    false        true        false
		 *    False         false        false
		 * */

		
		int a = 10;
		int b = 5;
		int c = 15;
		
		boolean conditionA = a+b == c; // true
		boolean conditionB = c-b == a; // true
		
		System.out.println(conditionA && conditionB); // true
		
		System.out.println((a+b == c) && (c-b == a)); // true
		
		conditionA = c / b >= 3;
		conditionB = a+b> c;
		
		boolean result = conditionA && conditionB;
		
		
		System.out.println(result);
		
		String userName = "techcircle";
		String password = "abc123";
				
		System.out.println(userName=="techcircle" && password =="abc123");
		System.out.println(userName=="techcircle" && password =="abc123");
		
		
		// || OR
		
		/*
		 * ConditionA   ConditionB  Result
		 *   true          true       true
		 *    true         false       true
		 *    false        true        true
		 *    False        false       false
		 * */
		
		a = 1;
		b = 2;
		c = 3;
		
		conditionA = a+b == c; // true
		conditionB = a-b >  c; // false
		
		System.out.println(conditionA || conditionB); // true
		
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		
		System.out.println(conditionA || c/a==3); // true
		System.out.println(c+a > b+a || a < 5); // true
		
		// Logical not !
		
		/*
		 *  !true == false
		 *  !faslse == true
		 * */
	
		conditionA = true;
		conditionB = false;
		
		System.out.println(!conditionA);
		System.out.println(!conditionB);
		
		
		
		
		
		
		
		
		
		
	}

}
