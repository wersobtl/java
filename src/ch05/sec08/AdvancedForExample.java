package ch05.sec08;

public class AdvancedForExample {

	public static void main(String[] args) {
		//배열 변수 선언과 배열 생성
		int [] score = {80, 90 , 20 , 30 , 50};
		int totalSum = 0;
		for(int i : score) {
			totalSum += i;
		}
		System.out.println(totalSum);
		double totalAvg = totalSum/score.length;
		System.out.println(totalAvg);
		
		String [] food = {"진국수","엄마손집밥","다사랑","49도시락","채서원병천순대","명화당","k밥상","한촌설렁탕"};
		double random=Math.random();
		int num = (int)Math.round(random * (food.length-1));
		System.out.println(food[num]);
		
		System.out.println(args.length);
	}

}
