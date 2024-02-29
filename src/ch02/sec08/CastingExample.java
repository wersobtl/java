package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 60;
		byte byteValue = (byte)intValue; //int형 타입을 캐스팅연산자를 사용하여 byte형 타입으로 강제변환 1byte의 값까지만 보존가능 (int는 4byte byte는 1byte)
		System.out.println(byteValue);
		
		long longValue = 300;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		intValue = 60;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		
				

	}

}
