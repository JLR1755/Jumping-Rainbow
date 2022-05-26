package day8_control_flow;

public class CalculatorHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double numA = 15;
		double numB = 5;
		
		String operator = "*";
		
		double total = 0;
		
		if (operator == "+") {
			total = numA + numB;
		}
		
		if (operator == "-") {
			total = numA - numB;
		}
		if (operator == "*") {
			total = numA * numB;
		}
		if (operator == "/") {
			total = numA / numB;
		}
		System.out.println(total);
		
		// 15 * 5 = 75
		
		System.out.println(numA +" "+operator +" " + numB +" = " + total);
	}

}
