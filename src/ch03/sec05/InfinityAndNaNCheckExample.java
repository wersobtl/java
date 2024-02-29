package ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0; //int 0으로 나누면 예외발생으로 에러가 난다.
		double z = x / y; //Infinity
		//double z = x % y; //NaN
		
		System.out.println(z + 2); // Infinity
		
		if(Double.isInfinite(z)|Double.isNaN(z)) {
			System.out.println("Infinity 또는 NaN이므로 연산불가");
		}else {
			System.out.println(z + 2);
		}

	}

}
