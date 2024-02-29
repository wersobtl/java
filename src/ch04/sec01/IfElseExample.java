package ch04.sec01;

public class IfElseExample {

	public static void main(String[] args) {
		int score = 90;
		
		if(score >= 90) {
			System.out.println("점수가 90점 이상입니다."); //if문이 true면 실행된다.
		}else {
			System.out.println("점수가 90점 미달입니다."); //if문이 true가 아니면 실행된다.
		}
		System.out.println("분발하세요."); //if문과 상관없이 실행된다.
	}

}
