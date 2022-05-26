package day4_operators;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String make = "Tesla";
		String model = "Model X";
		
		System.out.println(make);
		System.out.println(model);
		
		System.out.println("My next year new car will be "); // space included will print
		System.out.println("My next year new car will be "+make); // adds in the "make" of car by adding +
		System.out.println("My next year new car will be "+make+" "+model); // add space by empty quotations " "
		// +make+" "+model
		
		String name = "Jessica";
		String last = "Rutherford";
		System.out.println("My name is "+name);
		System.out.println("My name is "+name+" "+last);
		
		
	}

}
