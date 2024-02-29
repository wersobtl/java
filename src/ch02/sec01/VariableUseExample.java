package ch02.sec01;

public class VariableUseExample {

	public static void main(String[] args) {
		int hour = 10;
		int minute = 30;
		System.out.println("현재시간은 " + hour + "시" + minute + "분 입니다.");
		
		int totalMinit = (hour * 60) + minute ; 
		System.out.println("총 " + totalMinit + "분 입니다.");
		
		System.out.println("시간"+hour);
		

	}

}
