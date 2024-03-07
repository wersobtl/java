package ch06.sec09;

public class Car {
	//field 선언
	//static은 객체마다 저장할 필요가 없는 필드를 선언할 때 사용.
	static String company = "현대자동차";
	String model;
	int speed;
	
	//constructor 선언
	Car(String model){
		this.model = model;
	}
	
	//method 선언
	static void info() {
		System.out.println(company+"가 설계한 자동차");
	//	this.model = "그랜져"; static은 객체없이도 실행할 수 있는데 this.은 객체 내부의 필드를 가리키기 때문에 에러발생
	}
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void run() {//인스턴스 메소드안에서는 인스턴스 메소드만 실행할 수 있음
		setSpeed(100);
		System.out.println(this.model + "가 달립니다.(시속:"+ this.speed +"km/h)"); //함수의 매개변수가 없기때문에 this.을 사용하지 않아도 되지만
																				//객체의 model이라는 것을 강조하기 위해 사용해줌
	}
	
}
