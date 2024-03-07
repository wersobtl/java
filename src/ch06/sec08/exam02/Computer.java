package ch06.sec08.exam02;

public class Computer {
	//필드 선언
	
	
	//생성자 선언
	
	
	//메소드 선언
	public static int sum(int[] values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			 sum += values[i];
		}
		return sum;
	}
	public static int sum2(int...values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			 sum += values[i];
		}
		return sum;
	}
	
	

}
