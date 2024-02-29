package ch03.sec11;

public class ConditionOperatorExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score >= 95) ? 'A' : (score >= 85) ? 'B' : 'C';
		System.out.println("score는 " + score +"점이고 성적은 " + grade + "입니다.");
	}

}
