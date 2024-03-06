package ch06.sec04;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("Student클래스의 객체1을 생성하였습니다.");
		
		Student s2 = new Student(); //1번과 다른 번지를 참조
		System.out.println("Student클래스의 객체2를 생성하였습니다.");
		
		Student s3 = s1; //1번과 같은 번지를 참조
		if(s1 == s2) {
			System.out.println("같은 객체");
			
		}else {
			System.out.println("다른 객체");
		}

	}

}
