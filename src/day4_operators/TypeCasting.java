package day4_operators;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * */
		int a = 10;
		double b = a; //double & float makes it a decimal
		
		System.out.println(a); // 10
		System.out.println(b); // 10.0
		
		long c= 70000000L;
		float d = c;
		
		System.out.println(d);
		
		int valueA = 10;
		byte valueB = (byte)valueA;
		
		System.out.println(valueA);
		System.out.println(valueB);
		
		int valueC = 300;
		byte valueD = (byte)valueC; //byte ---> -128 to 127
		
		System.out.println(valueD);
		
		double e = 40000;
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		short f = (short)e;
		
		System.out.println(f);
		
		
		
		
		
		
		
	}

}
