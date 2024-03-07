package ch06.sec08.exam02;

public class Member {
	//필드 선언
	String name;
	//생성자 선언
	Member(String name){
		this.name = name;
	}
	//메소드 선언
	public static void CallByValue(int arg) {
		arg = 2;
	}
	
	public static void CallByReference(int[] arg) {
		arg[0] = 2;
	}
	public static void CallByReference(Member member) {
		member.name = "김자바";
	}
}
