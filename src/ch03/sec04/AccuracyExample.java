package ch03.sec04;

public class AccuracyExample {

	public static void main(String[] args) {
		int apple = 1 ;
		double pieceUnit = 0.1;
		int num = 7;
		double result = apple - num * pieceUnit;
		System.out.println("사과 1개에서 먹고 남은 양은 : " + result); //0.299999999 정확한 연산을 하기 위해서는 정수연산을 해야한다.
		
		int orange = 1 ;
		int orangeTotal = orange * 10;
		int number = 7; 
		int result1 = orangeTotal - number;
		System.out.println("오렌지 10조각에서 남은 조각은 : " + result1);
		System.out.println("오렌지 1조각에서 남은 양은 : " + result1 / 10.0);

	}

}
