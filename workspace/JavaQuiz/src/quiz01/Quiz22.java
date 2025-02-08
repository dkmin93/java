package quiz01;

import java.util.Arrays;

public class Quiz22 {
	
	public static void main(String[] args) {
		
		//배열의 크기를 한개 늘리고 맨 앞에 data를 추가
		int[] arr = {10, 20, 30, 40, 50};
		//            0   1   2   3   4
		int data = 100; //새로 추가할 데이터
		int target = 0;  // 추가할 위치 인덱스 번호 (맨앞)
		
		int[] newArr = new int[arr.length + 1]; //원본배열 보다 1 더큰 크기의 새 배열 생성
		
		for(int i = 0; i < arr.length; i++) { 
			newArr[i] = arr[i]; 
		}
		
		System.out.println("복사된 새배열" + Arrays.toString(newArr));
		// 10 20 30 40 50 0
		// 0  1  2  3  4  5
		
		for(int i = newArr.length - 1; i > target; i--) {
			newArr[i] = newArr[i - 1]; 
		}
		
		newArr[target] = data;
		
		System.out.println("데이터를 추가한 배열" + Arrays.toString(newArr));
		
	}

}
