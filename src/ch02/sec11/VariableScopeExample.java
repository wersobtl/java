package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		int v2 = 0;
			if(v1 >5) {
				v2 = 3;
			}
		int result = v1 + v2;
		System.out.println(result);
	}

}
