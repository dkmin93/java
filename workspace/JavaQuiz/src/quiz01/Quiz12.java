package quiz01;

public class Quiz12 {
	
	public static void main(String[] args) {
		
		int[] arr = {1000, 500, 100, 50, 10};
		int money = 17780;
		
		
		//가장 최선의 방법으로 금액 거슬러주기
		
		int i= 0;
		
		while ( i < arr.length ) {
			
			int m = money / arr[i];
			
			int n = m * arr[i];
			
			money -= n; // money %=arr[i];
			  
		System.out.println(arr[i] + "원 : " + m + "개");
			
			i++;
		}
	
		
	}
	
}