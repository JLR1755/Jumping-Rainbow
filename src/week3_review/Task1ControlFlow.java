package week3_review;

public class Task1ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	// hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
		
		double hourlyRate = 50;
		double weeklyHours = 45;
		double stateTaxRate = .06;
		double federalTaxRate = .26;
		
		double salaryBeforeTax =  hourlyRate * weeklyHours * 52;
		double stateTax = salaryBeforeTax * stateTaxRate;
		double federalTax = salaryBeforeTax * federalTaxRate;
		double totalTax = stateTax + federalTax;
		double salaryAfterTax = salaryBeforeTax - totalTax;
		
		System.out.println("Grosspay is is "+salaryBeforeTax);
		System.out.println("Federal Tax is "+federalTax);
		System.out.println("State Tax is "+stateTax);
		System.out.println("Total Tax is "+totalTax);
		System.out.println("Net Income is "+salaryAfterTax);
		
		
		
		
		
		
		
		
		

	}

}
