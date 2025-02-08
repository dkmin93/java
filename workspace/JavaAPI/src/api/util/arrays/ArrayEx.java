package api.util.arrays;

import java.util.Arrays;

public class ArrayEx {
	
	public static void main(String[] args) {
		
		//util패키지부터는 import구문이 반드시 상단부에 들어간다 ex)스캐너
		
		int[] arr = {65, 34, 23, 63, 88, 1, 25};
		
		Arrays.sort(arr); //void형이라 한번 적용하면 배열을 싹 오름차순 정렬을 해준다
		System.out.println(Arrays.toString(arr)); //내림차순 정렬 찾아보기
		
		//이진탐색에는 반드시 정렬이 필요하다
		int index = Arrays.binarySearch(arr, 34);
		System.out.println("34가 있는 위치:" + index);
		int index2 = Arrays.binarySearch(arr, 24);
		System.out.println("찾는값이 없으면 음수 반환:" + index2);
		
		//배열의 복사
		int[] newArr = Arrays.copyOf(arr, arr.length);
		System.out.println("복사된배열:" + Arrays.toString(newArr));
		
		//배열의 복사 - 범위만큼만 복사
		int[] newArr2 = Arrays.copyOfRange(arr, 0, 3); //인덱스 0이상 3미만의 범위를 지정해서 복사
		System.out.println("범위지정복사:" + Arrays.toString(newArr2));
		
		//배열의 내부요소가 동일한지 확인 equals()
		if(Arrays.equals(arr, newArr)) { //equals()랑 마찬가지로 타입이 같아야만 한다
			System.out.println("배열의 요소가 같음");
		} else {
			System.out.println("배열의 요소가 같지 않음");
		}
		
	}

}
