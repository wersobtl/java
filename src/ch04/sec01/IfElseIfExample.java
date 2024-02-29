package ch04.sec01;

public class IfElseIfExample {

	public static void main(String[] args) {
		int score = 78;
		if(score >= 90) {
			System.out.println("점수는 90점 이상입니다."); //위에서부터 아래로 조건에 맞는 명령문을 실행한다.
		}else if(score >= 80) {
			System.out.println("점수는 80점 이상입니다.");
		}else if(score >= 70) {
			System.out.println("점수는 70점 이상입니다.");
		}else {
			System.out.println("재시험 대상입니다."); //조건에 맞는 명령문이 없으면 실행된다.
		}
		System.out.println("수고하셨습니다."); //if문과 상관없이 실행된다.
	}

}
