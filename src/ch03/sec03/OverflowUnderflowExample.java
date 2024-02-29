package ch03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		byte num = 127;
		num++;
		System.out.println(num); //오버플로우가 발생하여 연산결과는 최소값인 -128이 된다. 오버플로우는 타입이 허용하는 최대갑을 벗어나는 것을 말한다.
		byte num1 = -128;
		num1--;
		System.out.println(num1); //언더플로우가 발생하여 연산결과는 최대값인 127이 된다. 언더플로우는 타입이 허용하는 최소값을 벗어나는 것을 말한다.

	}

}
