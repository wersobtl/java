package ch04.sec06;

public class BreackExample {

	public static void main(String[] args) throws Exception{
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다");
		
		ad: for(char upper = 'A'; upper <= 'Z'; upper ++) {
			for(char lower = 'a'; lower <= 'z'; lower ++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break ad; //빠져나갈 for문에 label을 달고 명시해주면 가까운 for문이 아니라 특정한 for문을 빠져나간다.
				}
			}
		}
		
	}

}
