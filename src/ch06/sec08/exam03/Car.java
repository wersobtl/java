package ch06.sec08.exam03;

public class Car {
	//Field 선언
	int gas;
	
	//Constructor 선언
	
	//method 선언
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달린다."+"가스 잔량은 "+ gas);
				gas -= 1;
			}else {
				System.out.println("멈춘다.");
				return;
			}
		}
	}
}
