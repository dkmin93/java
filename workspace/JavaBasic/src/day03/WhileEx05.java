package day03;

public class WhileEx05 {
	
	public static void main(String[] args) {
		
		//배열과 반복
		String[] arr = {"민수", "영희", "영자", "영숙", "길동"};
		
		int i = 0; //배열은 넘버링이 0부터 시작되므로
		while( i < arr.length ) { //상수를 입력하면 배열갯수가 늘어날 경우 오류가 날 수 있기에
			System.out.println(arr[i]);
			i++;
		}
		
		
		int[] iArr = {43, 23, 54, 213, 54, 4, 65}; //정수 배열의 합
	
		int j = 0;
		int sum = 0; //합계를 누적할 변수
		while(j < iArr.length) {
			
			sum += iArr[j]; //배열 요소들의 합
			
			j++;
		}
		
		System.out.println(sum);
		
	}

}
