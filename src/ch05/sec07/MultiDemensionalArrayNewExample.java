package ch05.sec07;

public class MultiDemensionalArrayNewExample {

	public static void main(String[] args) {
		// 길이가 같은 2차원 배열을 만드는법 
		int [][] arr = new int[2][3];
		
		// 길이가 서로 다른 2차원 배열 만드는법
		int [][] arr1 = new int[2][];
		arr [0] = new int[1];
		arr [1] = new int[2];
		
		//각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
		int [][] array = new int[2][3];
		//배열 항목 초기값 출력
		for(int i = 0; i < array.length; i ++) {
			for(int j = 0; j <array[i].length; j ++) {
				System.out.println("array[" + i + "][" + j + "] 의 값은 " + array[i][j] +"입니다.");
			}
		}
		//배열 항목 값 변경
		array[0][0] = 67;
		array[0][1] = 45;
		array[0][2] = 89;
		array[1][0] = 96;
		array[1][1] = 100;
		array[1][2] = 16;
		
		//전체 학생의 수학 평균 구하기
		int classNum = 0;
		int totalScore = 0;
		double avgScore = 0;
		for(int i = 0; i < array.length; i ++) {
			classNum += array[i].length;
			for(int j = 0; j < array[i].length; j ++) {
				totalScore += array[i][j];
			}
		}
		avgScore = (double)totalScore / classNum;
		System.out.println("전체 학생의 총점은 " + totalScore + "이고 평균은 " + avgScore +"입니다.");
		//각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열 생성
		int [][] array1 = new int [2][];
		array1[0] = new int[2];
		array1[1] = new int[3];
		//배열 항목 초기값 출력
		for(int i = 0; i < array1.length; i ++) {
			for(int j = 0; j <array1[i].length; j ++) {
				System.out.println("array1[" + i + "][" + j + "] 의 값은 " + array1[i][j] +"입니다.");
			}
		}
		//배열 항목 값 변경
		array1[0][0] = 68;
		array1[0][1] = 79;
		array1[1][0] = 46;
		array1[1][1] = 89;
		array1[1][2] = 97;
		
		//전체 학생의 영어 평균 구하기
		classNum = 0;
		totalScore = 0;
		avgScore = 0;
		for(int i = 0; i < array1.length; i ++) {
			classNum += array1[i].length;
			for(int j = 0; j < array1[i].length; j ++) {
				totalScore += array1[i][j];
			}
		}
		avgScore = (double)totalScore / classNum;
		System.out.println("전체 학생의 총점은 " + totalScore + "이고 평균은 " + avgScore +"입니다.");
	}

}
