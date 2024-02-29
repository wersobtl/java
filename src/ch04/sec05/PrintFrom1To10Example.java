package ch04.sec05;

public class PrintFrom1To10Example {

	public static void main(String[] args) {
		int i = 1;
		while(i <= 10) {
			System.out.println(i + " ");
			i++;
		}
		
		int sum = 0;
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("10부터 " + (i-1) + "까지의 합은 " + sum + "입니다.");
	}

}
