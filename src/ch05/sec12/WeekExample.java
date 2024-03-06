package ch05.sec12;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		Week today = Week.WEDNESDAY;
		if(today == Week.SATURDAY) {
			System.out.println("토요일 입니다.");
		}else {
			System.out.println("토요일이 아닙니다");
		
		}
		Calendar now = Calendar.getInstance();
		int month = now.get(Calendar.MONTH); // 12월이 index[0]이기 때문에 우리나라 기준으로 하려면  +1을 더해준다.
		int week = now.get(Calendar.DAY_OF_WEEK);
		int year = now.get(Calendar.YEAR);
		System.out.println(week);
		
		
		today = null; 
		
		switch(week) {
			case 1 : today = Week.SUNDAY;
				break;
			case 2 : today = Week.MONDAY;
				break;
			case 3 : today = Week.TUESDAY;
				break;
			case 4 : today = Week.WEDNESDAY;
				break;
			case 5 : today = Week.THURSDAY;
				break;
			case 6 : today = Week.FRIDAY;
				break;
			case 7 : today = Week.SATURDAY;
				break;
		}
		if(today == Week.SUNDAY) {
			System.out.println();
		}else {
			System.out.println();
		}
		
	
	}
}
