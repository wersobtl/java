package ch06.sec08.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.powerOn();
		
		
		
		int [] i = {1,2,5,5};
		int sum = 0;
		sum = calculator.plus(i);
		System.out.println(sum);
		calculator.sysout(sum);
		int x = 8;
		int y = 498765;
		double div;
		div = calculator.divide(x, y);
		System.out.println(div);
		
		
		
		calculator.powerOff();
		

	}

}
