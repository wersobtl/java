package ch05.sec01;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		int [] arrInt = new int[3];
		for(int i = 0; i < arrInt.length; i++) {
			System.out.println("arrInt["+ i +"] = " + arrInt[i]);
		}
			System.out.println();
			arrInt[0] = 1;
			arrInt[1] = 2;
			arrInt[2] = 3;
		for(int i = 0; i < arrInt.length; i++) {
				System.out.println("arrInt["+ i +"] = " + arrInt[i]);
		}
		
		System.out.println();
		double [] arrDouble = new double[3];
		for(int i = 0; i < arrDouble.length; i++) {
			System.out.println("arrDouble["+ i +"] = " + arrDouble[i]);
		}
			System.out.println();
			arrDouble[0] = 0.1;
			arrDouble[1] = 0.2;
			arrDouble[2] = 0.3;
		for(int i = 0; i < arrDouble.length; i++) {
				System.out.println("arrDouble["+ i +"] = " + arrDouble[i]);
		}
		
		System.out.println();
		String [] arrString = new String[3];
		for(int i = 0; i < arrString.length; i++) {
			System.out.println("arrString["+ i +"] = " + arrString[i]);
		}
			System.out.println();
			arrString[0] = "하하";
			arrString[1] = "호호";
			arrString[2] = "후후";
		for(int i = 0; i < arrString.length; i++) {
				System.out.println("arrString["+ i +"] = " + arrString[i]);
		}
	}

}
