package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {
		
		String name = "홍길동";
		String job = "programmer";
		System.out.println(name +"의 직업은 " + job +"입니다.");
		
		String str = "나는 \"자바\"를 배웁니다."; // 문자열안에 \"를 작성하면 "를 문자열로 인식, \는 이스케이프 문자
		String str1 = "나는 \\자바\\를 배웁니다";
		System.out.println(str);
		System.out.println(str1);
		String str2 = "C:\\Program\\java\\src";
		System.out.println(str2);
		String str3 = "나는 \t자바를\t를 배웁니다."; //들여쓰기 tap
		System.out.println(str3);
		String str4 = "나는 \n자바를\n를 배웁니다."; //줄바꿈 
		System.out.println(str4);
		
	}
	{
		String name = "사자";
	}
	{
		String name = "호랑이";
	}

}
