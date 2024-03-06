package ch06.sec07.exam01;

public class Korean {
	String nation = "대한민국"; //필드선언을 하고 초기화를 해준다.
	String name;//필드선언만 해준다, 기본값 null
	String ssn;// 기본값 null
	int num;
	
	
	//생성자 선언(기본 생성자는 생성안됨)
	public Korean(String n, String n1) {
		name = n;
		ssn = n1;
	}
	
	public Korean(String n, int n1) {
		name = n;
		num = n1;
	}
	public Korean(int n1, String n) {
		num = n1;
		name = n;
	}
}
