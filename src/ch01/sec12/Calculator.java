package ch01.sec12;

//클래스 선언
public class Calculator {
	//main 메소드 선언
	public static void main(String[] args) {
		//변수 선언
		int x = 1;
		int y = 2;
		int result = x + y;
		// 출력문
		System.out.println(result);
		//메소드 실행
		cad(x,y);
		
	}
	/**
	 * 이것은 a와 b를 합치는 계산 메소드입니다.
	 * @param a
	 * @param b
	 * @return
	 */
	public static int cad(int a, int b) {
		int result = a + b;
		System.out.println(result);
		return result;
	}
}
