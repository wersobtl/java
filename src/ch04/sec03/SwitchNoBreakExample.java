package ch04.sec03;

public class SwitchNoBreakExample {

	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;
		
		switch(time) {
			case 8 : 
				System.out.println("출근을 합니다.");
				
			case 9 :
				System.out.println("회의를 합니다.");
				
			case 10 :
				System.out.println("업무를 합니다.");
				
			case 11 : 
				System.out.println("외근을 합니다.");
					
			
		}
	}

}
