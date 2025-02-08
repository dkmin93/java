package day05;

import java.util.Arrays;

public class MethodEx06 {
	
	public static void main(String[] args) {
		
		//Queue - FIFO(First In First Out) 롤 큐...
		//offer - 뒤에서 추가
		//poll - 앞에서 제거하고 반환
	
		offer(1);
		offer(2);
		offer(3);
		offer(4);
		offer(5);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("삭제된 데이터:" + poll());
		System.out.println(Arrays.toString(arr));
		
		
	}//메인함수 끝
	
	static int[] arr = {};
	
	static void offer(int data) {
		//1. 배열 크기를 +1한 새로운 배열생성
		int[] temp = new int[arr.length+1];
		//2. 배열을 복사
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		//3. 마지막 추가
		temp[temp.length - 1] = data;
		//4. 원본배열을 바꿔치기
		arr = temp;
		temp = null;
	}
	
	static int poll() { //앞에서 제거하고 반환
		
		//1.배열의 길이가 0보다 클때만 실행
		if(arr.length > 0) {
			//2.삭제할 데이터 백업
			int del = arr[0];
			//3.arr보다 길이가 -1인 배열 생성
			int[] temp = new int [arr.length - 1];
			//4.배열의 첫번째 요소부터 마지막 요소까지 temp에 옮겨 담기 arr 1234
			for(int i = 0; i < temp.length; i++) { //      temp 234
				temp[i] = arr[i+1];
			}
			//5.원본배열을 바꿔치기
			arr = temp;
			temp = null;
			//6.삭제한데이터반환
			return del;
		}
		
		return 0;
	}
	
	
}
