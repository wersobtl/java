package ch03.sec02;

public class ArithmeticOperationExample {

	public static void main(String[] args) {
		byte a = 1;
		byte b = 2;
		int c = 3;
		long d = 4L;
		
		int result = a + b; //byte타입이 연산과정에서 int로 변환되기 때문에 int타입으로 받아야 한다.
		System.out.println(result);
		long result1 = a + b + d; //연산식에서 long타입이 가장 큰 범위를 갖고 있기 때문에 long타입으로 받아줘야 한다.
		System.out.println(result1);
		double result2 = (double)a/b; //정수끼리 나누면 정수 값만 반환하기 때문에 정수중에 하나를 실수로 캐스팅해주거나 둘다 캐스팅해준 뒤 처리한다. 
		System.out.println(result2);
		int result3 = a % b; // %연산은 나머지를 반환하기 때문에 int로 받아줘도 문제가 없다.
		System.out.println(result3);

	}

}
