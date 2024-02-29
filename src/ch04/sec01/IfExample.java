package ch04.sec01;

public class IfExample {

	public static void main(String[] args) {
		int score = 95;
		if(score >= 90) {
			System.out.println("점수는 90점 이상입니다.");
			System.out.println("등급은 A등급입니다.");
		}
		if(score < 90)
			System.out.println("점수는 90점 미만입니다.");
			System.out.println("분발하세요."); //중괄호를 치지 않으면 헷갈릴 수 있음, if문과 상관없이 실행한다.
	}

}
