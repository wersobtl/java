package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		int [] array = new int[t];
		for(int i = 0; i < t; i ++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			array[i] = a + b;
		}
		for(int i = 0; i < t; i++) {
			System.out.println(array[i]);
		}
	}
}
		
	
		

