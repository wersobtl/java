package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("-----동작을 입력해주세요.-----");
			System.out.println("---1.증가--2.감소--3.중지---");
			System.out.println("-------------------------");
			System.out.print("선택 : ");
			
			
			String str = scanner.nextLine();
			
			if(str.equals("1")) {
				speed++;
				System.out.println("현재속력은 " + speed + "입니다.");
			}else if(str.equals("2")) {
				if(speed > 0) {
					speed--;
					System.out.println("현재속력은 " + speed + "입니다.");
				}else {
					System.out.println("정지된 상태입니다.");
				}
			}else if(str.equals("3")) {
				run = false;
			}
			System.out.println("중지되었습니다.");
		}

	}

}
