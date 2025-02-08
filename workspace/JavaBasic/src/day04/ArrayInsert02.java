   package day04;

import java.util.Arrays;

public class ArrayInsert02 {
	
	public static void main(String[] args) {
		
		//깊은복사. 배열의 중간부분에 새로운 배열값 넣는 방법
		
		int[] arr = {10, 20, 30, 40, 50};
		int[] newArr = new int[arr.length + 1]; //기존 배열 arr보다 1 더 큰 배열 새로 생성
		
		int data = 100; //추가할 데이터
		int target = 2; //추가할 위치 인덱스2번(3번째)에 100을 넣기
		
		//복사
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(newArr));
		
		//배열의 마지막부터 타겟인덱스까지 값을 옮겨 담는 작업
		for(int i = newArr.length - 1; i > target; i--) {
			
			newArr[i] = newArr[i-1];
			
		}
	
		System.out.println(Arrays.toString(newArr));
		
		//타겟 인덱스 자리에 새로운 배열값 추가
		newArr[target] = data;
		
		System.out.println(Arrays.toString(newArr));
		
		arr = newArr; // 원본배열을 새로운 배열로 바꿔치기(복사)
		newArr = null; // 새로운배열은 삭제
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
	
	}

}
