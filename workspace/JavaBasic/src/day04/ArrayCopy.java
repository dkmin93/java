package day04;

import java.util.Arrays;

public class ArrayCopy {
	
	public static void main(String[] args) {
		
		//복사의 개념 2개가 있다
		//얕은 복사 : 
		//깊은 복사 : 원본에는 영향을 끼치지 않은채로 복사
		
		int[] arr = {1, 2, 3, 4, 5}; // arr 자리에는 주소를 저장한다
		int[] newArr = arr; //얕은복사 주소값을 본떠서 저장. 원본 배열 또한 변경 된다.
		
		System.out.println("newArr" + Arrays.toString(newArr));
		newArr[0] = 100;
		System.out.println("newArr" + Arrays.toString(newArr));
		System.out.println("arr" + Arrays.toString(arr));
		
		System.out.println(arr == newArr);
		
		//깊은 복사 : 완전히 새로운 배열을 만들고 요소를 옮겨 담는다
		
		int[] arr2 = new int[arr.length]; // 원본 배열 arr과 크기가 같은 배열 arr2 생성
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i];
		}
		
		System.out.println(arr == arr2);
		//사본 배열의 값을 변경하더라도 원본 배열에 영향을 미치지 않는다
		
		arr2[0] = 200;
		System.out.println("원본" + Arrays.toString(arr));
		System.out.println("사본" + Arrays.toString(arr2));
		
		
	}

}
