package ch02.sec02;

public class ByteExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 100;
		
		short b = 100;
		
		int  c = 100;
		
		long d = 100000000000l;//L을 붙이지 않으면 컴파일러가 int로 처리해서 에러가 난다.
		
		byte v1 = 30;
		
		byte v2 = 50;
		
		// 산술연산에서는 byte가 4byte로 바뀌어 계산되기 때문에 에러가 난다.(cpu처리문제)
		// byte result = v1 + v2;
		
		int result = v1 + v2; //int로 계산해줘야 한다.
		
		byte v3 = 30 + 50;
	}
}
