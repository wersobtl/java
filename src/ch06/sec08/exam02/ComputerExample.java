package ch06.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		int [] arr1 = {30, 20, 40};
		int [] arr2 = new int[5];
		arr2[0] = 30;
		arr2[1] = 20;
		arr2[2] = 40;
		arr2[3] = 20;
		arr2[4] = 60;
		int sum = 0;
		Computer computer = new Computer();
		sum = computer.sum(arr1);
		System.out.println(sum);
		sum = computer.sum(arr2);
		System.out.println(sum);
		//sum = computer.sum({3,5,6});
		sum = computer.sum(new int[] {3,5,6});
		System.out.println(sum);
		//sum = computer.sum(9,9,2); 매개변수를 배열로 받는 메소드에서는 사용불가능, 그래서 가변길이 매개변수를 이용해준다 int...values
		System.out.println();
		
		
		//sum1 호출
		sum = computer.sum2(arr1);
		System.out.println(sum);
		sum = computer.sum2(arr2);
		System.out.println(sum);
		//sum = computer.sum({3,5,6});
		sum = computer.sum2(new int[] {3,5,6});
		System.out.println(sum);
		sum = computer.sum2(9,9,2);
		System.out.println(sum);
		
	}

}
