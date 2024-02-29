package ch02.sec08;

public class PrimitiveAndStringExample {

	public static void main(String[] args) {
		int a = Integer.parseInt("10");
		double b = Double.parseDouble("3.12");
		boolean c = Boolean.parseBoolean("true");
		
		String str = String.valueOf(10);
		String str1 = String.valueOf(3.14);
		System.out.println(a + "\n" + b + "\n"+ c + "\n"+ str + "\n"+ str1 + "\n");
				
				

	}

}
