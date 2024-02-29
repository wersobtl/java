package ch02.sec08;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10 + 20; //컴파일할 때 연산해서 30으로 들어감
		byte byteValue1 = 10 ;
		byte byteValue2 = 20 ;
		
		int byteTotal = byteValue1 + byteValue2 ; // 컴파일후 JVM과정에서  byte를 int로 변환해서 계산하기 때문에 byte타입으로 받을 수 없다.
//		System.out.println(byteTotal);
		
		byte byteValue3 = 10;
		int intValue = 20;
		long longValue = 50L;
		
		long sum = byteValue3 + intValue + longValue; //연산식에서 가장 큰 타입이 long이기 때문에 long타입 변수로 받아줘야 한다.
		System.out.println(sum);
		
		char charValue = 'A';
		char charValue1 = 1;
		int result = charValue + charValue1; //int로 형변환 후 계산되기 때문에 int로 받아줘야 한다.
		System.out.println(result);
		charValue = (char)result;
		System.out.println(charValue);
		
		int v8 = 10;
		int result2 = v8/4;
		System.out.println(result2); //계산결과는 2.5지만 정수타입으로 받았기 때문에 2만 나온다.
		
		double result3 = (double)v8/4; //계산결과를 정확히 나타내주기 위해서 캐스팅해준 후 계산을 하면 정확한 결과 값을 출력할 수 있다.
		System.out.println(result3);
		
		String str = "3" + 7;
		String str1 = "37";
		boolean a = str == str1;//번지수 비교해서 true,false 비교
		
		int [] num = {1, 2, 3};
		int [] num1 = {1, 2, 3};
		boolean b = num == num1;
		System.out.println(a);
		System.out.println(b);
	}

}
