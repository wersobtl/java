package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		//스캐너를 만들어 준다.
		Scanner scanner = new Scanner(System.in);
		/*int a = 0;
		while(a == 0) {
			System.out.println("X의 값을 입력해주세요.");
			String strX = scanner.nextLine();
			int x = Integer.parseInt(strX);
			
			System.out.println("Y의 값을 입력해주세요.");
			String strY = scanner.nextLine();
			int y = Integer.parseInt(strY);
			
			System.out.println("X와 Y의 합계는 " +(x + y) +"입니다.");
			
			System.out.println("아무말이나 입력해주세요.");
			String anythingTalk = scanner.nextLine();
			System.out.println("입력한 말은 \"" + anythingTalk + "\" 입니다.");
			System.out.println("계속하시려면 '0'을 입력해주세요.");
			String strA = scanner.nextLine();
			a = Integer.parseInt(strA);
			System.out.println();
		}*/
		
		while(true) {
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;
			}
			
			System.out.print("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");
		
	}

}
