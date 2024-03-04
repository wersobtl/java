package ch05.sec01;

public class SplitExample {

	public static void main(String[] args) {
		String board = "자바, programming, java, 고구마, 감자";
		String [] token = board.split(","); //.split안에 있는 문자를 기준으로 String객체 안의 있는 문자를 구분해서 String 배열로 저장한다.
		System.out.println(token.length);
		System.out.println(token[0]);
		System.out.println(token[1]);
		System.out.println(token[2]);
		System.out.println(token[3]);
		System.out.println(token[4]);
		
		for(int i = 0; i < token.length; i ++) {
			System.out.println("token "+ i + "=" + token[i]);
		}
		

	}

}
