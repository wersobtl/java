package ch05.sec11;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		System.out.println(args.length);
		
		if(args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);
			
		} 
		String num1 = args[0];
		String num2 = args[1];
		int intNum1 = Integer.parseInt(num1);
		int intNum2 = Integer.parseInt(num2);
		System.out.println(intNum1 + intNum2);

	}

}
