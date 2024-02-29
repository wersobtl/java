package ch03.sec01;

public class SignOperationExample {

	public static void main(String[] args) {
		byte b = 100;
		//byte result = -b; //부호를 바꾸는 것도 연산이기 때문에 int로 변환하는 과정이 들어가기 때문에 int로 바꿔줘야 한다
		int result = -b;
		int x = 10;
		int y = 10;
		int result1 = ++x + 10; //x를 1증가시키고 연산
		int result2 = y++ + 10; //연산하고 난 뒤에 y를 증가
		System.out.println(x + ", " + y + ", " + result1 + ", " + result2);
		int z;
		z = ++x + y++; //x=12 y=11
		System.out.println(z); //x=12 y=12 z=23
		z = y++; //z=12
		System.out.println(z+","+y);//z=12 y=13
	}

}
