package ch04.sec04;

public class SumFrom1To100Example {

	public static void main(String[] args) {
		
		int sum = 0;//for문 밖에서도 사용할 것이기 때문에 전역변수로 설정
		int i; //for문에서 초기값을 넣어줄 것이기때문에 초기화x
		for(i = 0; i <= 100; i ++) { //for(초기화;조건식;증감식) {실행문}
			sum += i;
		}
		System.out.print("1~"+(i-1)+"합은 "  + sum); //i와 sum은 전역변수이므로 for문의 중괄호밖에서도 사용할 수 있다.
	}

}
