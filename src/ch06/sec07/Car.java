package ch06.sec07;

public class Car {
	
	String company;
	String name;
	boolean state;
	int speed;
	// 기본 생성자
	Car(){
		
	}
	// 생성자 추가
	Car(String company, String name){
		this.company = company;
		this.name = name;	
	}
}
