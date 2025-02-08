package quiz18;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		//첫째줄에 입력의 횟수가 주어지고 5번
		Scanner scan = new Scanner(System.in);
		
		//둘째줄에 입력의 횟수만큼 정수 입력받기 54 32 43 52 75
		//nextLine()로 받아서 split()로 쪼개고 parseInt로 변환해서 정수 배열에 저장
		
		
		String[] arr = scan.nextLine().split(" ");
		System.out.println(Arrays.toString(arr));
		int[] arr2 = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr2));
	
	
	}

}
