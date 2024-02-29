package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; // 작은 허용범위의 타입이 큰 허용범위의 타입으로 변환은 에러없이 가능하다. --> 자동타입변환
		System.out.println(intValue);
		char charValue = '가';
		intValue = charValue;
		System.out.println(intValue);
		
		intValue = 50;
		long longValue = intValue;
		
		longValue = 100;
		float floatValue = longValue; // float은 4바이트 long은 8바이트의 허용범위를 가지고 있지만, 실수는 더 큰 타입의 정수를 표현할 수 있다.(변수를 저장하는 방식이 다름)
		System.out.println(floatValue);
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println(doubleValue);
		int a = 103029770;
		byte b = (byte)a;
		System.out.println(b); //원래 값이 보존되지 않음

	}

}
