package ch02.sec06;


public class Scanner {

	public static void main(String[] args) {
		String car = null;
		System.out.println(car);
		car = "자동차";
		System.out.println(car);
		
		String truck;
		truck = "트럭";
		System.out.println(truck);
		int [] num = null;
		System.out.println(num);
		int [] num1 = {1,2};
		System.out.println(num1[0]);
		num = num1;
		System.out.println(num);
	}

}
