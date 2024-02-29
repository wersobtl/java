package ch03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {
		boolean a = 0.1 == (double)0.1f; //정밀도 차이때문에 false값이 나온다.
		
		boolean c = 0.1f == (float)0.1;
		
		System.out.println(a + "," + c );
		
		
		 

	}

}
