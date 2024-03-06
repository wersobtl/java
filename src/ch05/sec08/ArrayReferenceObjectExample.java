package ch05.sec08;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String [] stringArray = new String [3];
		stringArray[0]="홍길동";
		stringArray[1]="홍길동";
		stringArray[2]=new String("홍길동");
		System.out.println(stringArray[0]==stringArray[1]);
		System.out.println(stringArray[1]==stringArray[2]);
		System.out.println(stringArray[1].equals(stringArray[2]));

	}

}
