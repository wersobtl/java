package ch04.sec06;

import java.util.Scanner;

public class TestSec06 {

	public static void main(String[] args) {
		//2번 문제
		String grade = "b";
		int score1 = 0;
		switch(grade) {
			case "A", "a" -> {
				score1 = 100;
			}
			case "B", "b" -> {
				int result = 100 - 20;
				score1 = result;
			}
			default -> {
				score1 = 60;
			}
		}

		//3번 문제
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i%3 == 0) {
				sum+=i;
			}
		}
		System.out.println("3의 배수의 총합은 " + sum + "입니다.");
		
		//4번 문제
		int a = 0;
		int b = 0;
		
		while(a+b != 5) {
			a = (int)(Math.random() * 6);
			b = (int)(Math.random() * 6);
			System.out.println("첫번째 주사위의 수는 " + a + "입니다.");
			System.out.println("두번째 주사위의 수는 " + b + "입니다.");
		}
		
		//5번 문제
		for(int x = 1; x <= (60/4); x++ ) {
			for(int y = 1; y <= (60/5); y++) {
				if(x*y == 60) {
					System.out.println(x + ", " + y);
				}
			}
		}
		
		//6번 문제
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j ++) {
				if(j==i+1) {
					break;
				};
				
			}
			System.out.println();
		}
		
		//7번 문제
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int money = 0;
		while(num != 4) {
			System.out.println("-----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------------");
			String strNum = scanner.nextLine();
			num = Integer.parseInt(strNum);
			if(num == 1) {
				System.out.println("선택> " + num);
				//System.out.println("예금액을 입력해주세요.");
				System.out.print("예금액> ");
				String strMoney1 = scanner.nextLine();
				int pay = Integer.parseInt(strMoney1);
				money += pay;
			}else if(num == 2) {
				System.out.println("선택> " + num);
				if(money != 0) {
					System.out.print("출금액> ");
					String strMoney2 = scanner.nextLine();
					int pay = Integer.parseInt(strMoney2);
					if(money-pay > 0) {
						money -= pay;
					}else {
						System.out.println("잔고가 부족합니다.");
					}
				}
			}else if(num == 3) {
				System.out.println("선택> " + num);
				System.out.println("잔고> " + money);
			}else if(num == 4) {
				System.out.println("선택> " + num);
				System.out.println("프로그램을 종료합니다.");
			}
			
		}
		
	}

}
