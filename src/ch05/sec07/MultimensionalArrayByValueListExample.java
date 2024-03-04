package ch05.sec07;

public class MultimensionalArrayByValueListExample {
	public static void main(String[] args) {
		int[][] scores = {
				{80, 90, 95},
				{70, 35 }
		};
		
		//배열의 길이
		System.out.println(scores.length);
		
		//첫 번째 반의 세번째 학생의 점수 읽기
		int a = scores[0][2];
		System.out.println(a);
		//두 번째 반의 두번째 학생의 점수 읽기
		int b = scores[1][1];
		System.out.println(b);
		//첫 번째 반의 평균 점수 구하기
		int scoreSum = 0;
		for(int i = 0; i < scores[0].length; i++) {
			scoreSum += scores[0][i];
			
		}
		double scoreAvg = (double)scoreSum / scores[0].length;
		System.out.println("첫번재 학급의 총점은 "+ scoreSum + " 평균은 " + scoreAvg + "입니다.");
		//두 번재 반의 평균 점수 구하기
		scoreSum = 0;
		for(int i = 0; i < scores[1].length; i++) {
			scoreSum += scores[1][i];
			
		}
		scoreAvg = (double)scoreSum / scores[1].length;
		System.out.println("두번재 학급의 총점은 "+ scoreSum + " 평균은 " + scoreAvg + "입니다.");
		//전체 학생의 평균 점수 구하기
		
		scoreSum = 0;
		int totalSum = 0;
		for(int i = 0; i < scores.length; i++) {
				totalSum += scores[i].length;
			for(int j = 0; j <scores[i].length; j++) {
				scoreSum += scores[i][j];
			}
		}
		scoreAvg = (double)scoreSum / totalSum;
		System.out.println("전체 학급의 총점은 "+ scoreSum + " 평균은 " + scoreAvg + "입니다.");
	}
	
}
