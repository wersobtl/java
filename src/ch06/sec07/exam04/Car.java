package ch06.sec07.exam04;


public class Car {
	//필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(String model){ //1번 생성자
		this(model, "검정", 150);
	}
	Car(String model, String color){ //2번 생성자
		this(model, color, 150);
		
	}
	Car(String model, String color, int maxSpeed){ //3번 생성자
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}

