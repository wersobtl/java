package ch06.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {
		//newCar객체를 생성
		
		Car newCar = new Car("부릉부릉", false);
		
		System.out.println("모델명 = "+newCar.model);
		System.out.println("속도 = "+newCar.speed);
		System.out.println("시동여부 = "+newCar.start);
		
		System.out.println();
		
		newCar.model = "그랜져";
		newCar.start = true;
		newCar.speed = 130;
		
		System.out.println("모델명 = "+newCar.model);
		System.out.println("속도 = "+newCar.speed);
		System.out.println("시동여부 = "+newCar.start);
		
		System.out.println();
		
		Car yourCar = new Car("두발자전거", false);
		
		System.out.println("모델명 = "+newCar.model);
		System.out.println("속도 = "+newCar.speed);
		System.out.println("시동여부 = "+newCar.start);
	}

}
