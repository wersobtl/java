package ch06.sec07.exam01;

public class KoreanExample {

	public static void main(String[] args) {
//		Korean korea = new Korean();
		Korean korea = new Korean("홍길동","123123-2131123");
		System.out.println(korea.name);
		System.out.println(korea.ssn);
		Korean k2 = new Korean("김자바","293192-2931922");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		
	}

}
