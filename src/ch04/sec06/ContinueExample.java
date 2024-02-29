package ch04.sec06;

public class ContinueExample {

	public static void main(String[] args) {
		//continue 는 반복문에서만 사용할 수 있다.
		//1부터 10까지중 홀수만 출력할 수 있게
		for(int i = 1; i <= 10; i ++) {
			if(i % 2 == 0) {
				continue;//밑에 내용을 실행하지 않고 for문으로 간다.
			}
			System.out.println(i);
		}

	}

}
