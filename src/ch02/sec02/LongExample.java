package ch02.sec02;

public class LongExample {

	public static void main(String[] args) {
		long a = 10;
		
		long b = 20L; //메모리 이슈
		
		//long c = 1000000000000; L을 붙이지 않으면 컴파일러가 int로 처리해서 에러가 난다.
		
		long d = 1000000000000L;
	
	}

}
