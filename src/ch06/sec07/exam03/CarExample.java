package ch06.sec07;

public class CarExample {

	public static void main(String[] args) {
		//기본 생성자
		Car newCar = new Car();
		
		System.out.println(newCar.company +" "+ newCar.name);
	
		Car myCar = new Car("현대","차차차");
		
		System.out.println(myCar.company +" "+ myCar.name);
		
	}

}
