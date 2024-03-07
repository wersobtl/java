package ch06.sec10.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		double circleArea = 10 * 10 * Calculator.pi;//static으로 생성했기 때문에 객체생성없이 사용가능
		int plusResult = Calculator.plus(10, 5);
	}

}
