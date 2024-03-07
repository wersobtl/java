package ch06.sec07.exam04;

 class CarExample {

	public static void main(String[] args) {
		Car newCar = new Car("소나타"); //1번 생성자로 호출
		System.out.println(newCar.company + newCar.model + newCar.color + newCar.maxSpeed); 
		
		Car newCar1 = new Car("그랜져","실버"); //2번 생성자로 호출
		System.out.println(newCar.company + newCar1.model + newCar1.color + newCar1.maxSpeed); 
		
		Car newCar2 = new Car("모닝","레드",180); //3번 생성자로 호출
		System.out.println(newCar.company + newCar2.model + newCar2.color + newCar2.maxSpeed); 
	}

}
