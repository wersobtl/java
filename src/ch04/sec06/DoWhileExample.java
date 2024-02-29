package ch04.sec06;

public class DoWhileExample {

	public static void main(String[] args) {
		int [] a = {1,2};
		int [] b = {1,2};
		int [] c = a;
		System.out.println(a == b);
		System.out.println(a == c);
		c[1] = 3;// c 배열값을 변경
		System.out.println(a == c);
		System.out.println(a[1]); //a 배열값이 변경
		
		String a1 = "컴퓨터";
		String b1 = "컴퓨터";
		String c1 = a1;
		System.out.println(a1 == b1);
		c1 = "자전거";
		System.out.println(a1); //a1값은 변하지 않음
		

	}

}
