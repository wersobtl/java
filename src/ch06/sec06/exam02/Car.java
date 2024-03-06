package ch06.sec06.exam02;

public class Car {
	//필드 선언(객체에 포함되는 데이터 선언)
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	//생성자 선언
	Car(){
		model = "홍차";
		color = "검정";
	}
	
	//메소드 선언
	void run() {
		speed = 60;
	}
}
	
