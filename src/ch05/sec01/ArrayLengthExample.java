package ch05.sec01;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int [] arrInt = new int[19];
		
		for(int i = 0; i < arrInt.length; i ++) {
			arrInt[i] = i;
		}
		int sum = 0;
		
		for(int i = 0; i < arrInt.length; i ++) {
			sum += arrInt[i];
		}
		
		double avg = sum / arrInt.length;
		
		System.out.println(sum + " " + avg);
	}

}
