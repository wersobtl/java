package ch05.sec12;

import java.util.Scanner;

public class TestCh05 {

	public static void main(String[] args) {
		//7. 주어진 배열 항목에서 최대값을 출력하는 코드를 작성해보세요(for 문 이용)
		//int[] array = {1,5,3,8,2}
		int [] array = {1,5,3,8,2};
		int maxNum = 0;
			for(int i = 0; i < array.length; i ++) {
				int num = array[i];
				if(maxNum <= num) {
					maxNum = num;
				}
			}
		System.out.println(maxNum);
		//8. 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성해보세요(중첩 for문 이용)
		int [][] arrayScore = {
								{95, 86},
								{83, 92, 96},
								{78, 83, 93, 87, 88}
		};
		int totalPeople = 0;
		int totalSum = 0;
		for (int i = 0; i < arrayScore.length; i++) {
				totalPeople += arrayScore[i].length;
			for(int j = 0; j < arrayScore[i].length; j++) {
				totalSum += arrayScore[i][j];
			}
		}
		double avg = (double)totalSum / totalPeople;
		
		System.out.println(totalPeople + " " + totalSum + " " + avg);
		
		//9. 문제는 책을 참고
		int [] score = new int [3];
		Scanner scanner = new Scanner(System.in);
		boolean exit = true;
		int [] classScore = null;
		while(exit) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트| 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");
			String strNum = scanner.nextLine(); 
			int num = Integer.parseInt(strNum);
			switch(num){
				case 1: 
						System.out.print("학생수> ");
						String strClassNum = scanner.nextLine();
						int classNum = Integer.parseInt(strClassNum);
						classScore = new int[classNum];
						break;
				case 2: 
						for(int i = 0; i<classScore.length; i++) {
							System.out.print("scores[" + i + "]>");
							String str = scanner.nextLine();
							int number = Integer.parseInt(str);
							classScore[i] = number;
						}
						break;
				case 3:
						for(int i = 0; i < classScore.length; i++ ) {
							System.out.println("scores["+ i + "]: " + classScore[i]);
						}
						break;
				case 4:
						int maxNum1 = 0;
						for(int i = 0; i < classScore.length; i++) {
							int num1 = classScore[i];
							if(maxNum1 < num1) {
								maxNum1 = num1;
							}
						}
						int totalSum1 = 0;
						for(int i=0; i < classScore.length; i++) {
							totalSum1 += classScore[i];
						}
						double avg1 = (double)totalSum1/classScore.length;
						System.out.println("최고 점수:" + maxNum1);
						System.out.println("평균 점수:" + avg1);
						break;
				case 5:
						System.out.println("프로그램 종료");
						exit = false;
			
			}
			
		}
	}

}
