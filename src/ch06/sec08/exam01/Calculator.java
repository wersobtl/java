package ch06.sec08.exam01;

public class Calculator {
	//필드 선언
	
	
	//생성자 선언
	
	
	
	public static void sysout(int message) {
		System.out.println(message);
	}
	//메소드 선언
	public static void powerOn(){
		System.out.println("전원을 켭니다.");
	}
	public static void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	public static void run() {
		
	}
	public static int plus(int[]values) {
		int sum= 0;
		
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	public static double divide(int x, int y) {
		double num = (double)x/y;
		
		return num;
	}
}
