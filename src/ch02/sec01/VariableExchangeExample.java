package ch02.sec01;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		System.out.println("a는 " + a + " b는 " + b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a는 " + a + " b는 " + b);
	}

}
