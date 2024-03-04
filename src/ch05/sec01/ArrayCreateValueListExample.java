package ch05.sec01;

public class ArrayCreateValueListExample {

	public static void main(String[] args) {
		int [] intArray = new int[] {85, 90, 93};
		int sum = 0;
		for(int i = 0; i < intArray.length; i ++) {
			sum += intArray[i];
		}
		System.out.println(sum);
		
		double avg = (double)sum/intArray.length;
		
		System.out.println(avg);

	}

}
