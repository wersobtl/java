package ch05.sec01;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		int [] arr1;
		int [] arr11;
		int [] arr3;
		
		arr1 = new int [] {1, 2, 3};
		arr11 = new int [] {1, 2, 3};
		int [] arr2 = {1, 2, 3};
		arr3 = arr1;
		
		System.out.println(arr1 == arr11); //new생성자를 이용해서 생성하게 되면 다른 번지수를 참조
		System.out.println(arr1 == arr2); //리터럴해도 번지수가 다름
		System.out.println(arr1 == arr3); //

	}

}
