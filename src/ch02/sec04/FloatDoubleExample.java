package ch02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		float v1;
		double v2;
		v1 = 0.1234567890123456789f;
		v2 = 0.1234567890123456789;
		System.out.println(v1 + " " + v2);
		
		float a = 0.1f;
		float b = 0.1f;
		float result = a+b;
		System.out.println(result == 0.2);
		boolean x = (result == 0.2);
		
		
	}

}
