package quiz01;

import java.util.Arrays;

public class MethodQuiz01 {
	
	public static void main(String[] args) {
		
		
		method1();
		
		System.out.println(method2("전달 받은 매개 변수 리턴"));
		
		System.out.println(method3(1, 2, 3));
		
		System.out.println(method4(4)); // 짝수라고 출력되어야함
		
		method5("반복", 3); // 
		
		System.out.println(); //줄바꿈
		
		System.out.println(maxNum(10, 20)); // 20 출력
		
		System.out.println(abs(-10)); //10 출력
		
		char[] arr = {65, 66, 67};
		System.out.println(method6(arr)); //char 배열을 입력해서 ABC 출력

		int[] arr2 = {1, 2, 3, 4, 5};
		System.out.println(method7(arr2));
		
		
		String[] arr3 = method8("메서드","어려워요");
		System.out.println(Arrays.toString(arr3));
	}

	static void method1() {
		System.out.println("안녕");
	}
	
	static String method2(String a) {
		
		String result = a;
		return result;
	}
	
	static double method3(int a, int b, double c) {
		
		double sum = a + b + c;
		return sum;
	}
	
	static String method4(int a) { // 이런식으로도 변수 추가설정 안해도 return 가능
	
		
		if(a % 2 == 0) {
			return "짝수";
			
		} else {
			return "홀수";
		}
	
		
	}
	
	static void method5(String a, int b) {
		for(int i = 1; i <= b; i++) {
		System.out.print(a);
		}
	}
	
	static int maxNum(int a, int b) {
		int max = 0;
		if(a > b) {
			max = a;
		} else {
			max = b;
		}
		return max;
	}
	
	static int abs(int a) {
		int abn = 0;
		if(a < 0) {
			abn = a * -1;
		} else {
			abn = a;
		}
		return abn;
	}
	
	static String method6(char[] arr) { // char [] = {65,66,67}
		for(int i = 0; i < arr.length; i++) {
			System.out.print((arr[i]));
		}
		return "";
	}
	
	static int method7(int[] arr) {
		int sum = 0;
		for(int i = 0; i< arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	static String[] method8(String a, String b) {// 메서드 어려워요 변수 입력
		String[] arr = new String[2];
		arr[0] = a;
		arr[1] = b;
		return arr;
	}
}
