package ch04.sec02;

public class IfNestExample {

	public static void main(String[] args) {
		int score = (int) (Math.random() * 20) + 81;
		
		if(score >= 90) {
			System.out.println("Score는 " + score);
			if(score >= 95) {
				System.out.println("성적은 A+");
			}else {
				System.out.println("성적은 A");
			}
		}
		else if (score >= 80) {
			System.out.println("Score는 " + score);
			if(score >= 85) {
				System.out.println("B+");
			}else {
				System.out.println("B");
			}
		}

	}

}
