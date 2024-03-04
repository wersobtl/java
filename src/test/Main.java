package test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int [] arr = new int [] {0, 0, 0};
		
		
		arr[0] = scanner.nextInt();
		arr[1]= scanner.nextInt();
		arr[2] = scanner.nextInt();
		if(arr[0] > 0 && arr[0] <= 6 && arr[1] > 0 && arr[1] <= 6 && arr[2] > 0 && arr[2] <= 6) {
			boolean num1 = (arr[0] == arr[1] && arr[1] == arr[2] && arr[0] == arr[2]); 
			boolean num2 = (arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]);
			boolean num3 = (arr[0] != arr[1] && arr[1] != arr[2] && arr[0] != arr[2]);
			
			if(num1) {
				System.out.println(10000 + (arr[0] * 1000));
			}else if(num2) {
				Arrays.sort(arr);
				System.out.println(1000 + (arr[1] * 100));
			}else if(num3) {
				int maxNum = 0;
				for (int i : arr) {
					maxNum = Math.max(maxNum, i);
				}
				System.out.println((maxNum * 100));
				}	
		}
	}
}
		
	
		

