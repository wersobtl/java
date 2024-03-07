package ch06.sec08.exam02;

public class CallByValueVsCallByReferenceExample {

	public static void main(String[] args) {
		int value1 = 1; //기본 타입
		int [] value2 = {1}; //참조 타입
		
		CallByValue(value1);
		System.out.println(value1);
		
		CallByReference(value2);
		System.out.println(value2[0]);
		
		Member member = new Member("홍길동");
		System.out.println("name: " + member.name);
		CallByReference(member);
		System.out.println("name: " + member.name);
	}
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

