package ch06.sec07.exam02;

public class Car {
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언
	Car(){}
	Car(String model){
		this.model = model;
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
//	Car(String color, String model{ // 같은 타입과 개수를 가지면 순서를 바꾸더라도 오버로딩이 되지 않음
//		this.color = color;
//		this.model = model;
//	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	Car(int maxSpeed, String model, String color){ //다른 타입과 개수를 가지면 순서를 바꾸더라도 오버로딩 가능
		this.maxSpeed = maxSpeed;
		this.model = model;
		this.color = color;
	}
	
	
}
