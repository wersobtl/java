package ch06.sec09;

public class CarExample {

	public static void main(String[] args) {
		System.out.println(Car.company);
		Car.info();// 객체 생성없이 클래스를 이용해서 메소드 호출
		Car newCar = new Car("G80");
		newCar.setSpeed(150);
		System.out.println(newCar.speed);
		newCar.run();
		System.out.println(newCar.company);//The static field Car.company should be accessed in a static way 에러는 안남
		System.out.println(Car.company); // 옳바른 표현
	}

}
