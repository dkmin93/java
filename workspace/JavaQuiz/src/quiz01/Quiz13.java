package quiz01;

public class Quiz13 {
	
	public static void main(String[] args) {
		
		//1. 7~100사이의 정수들 중에서 7의 배수를 가로로 출력
		
		for(int a = 7; a <= 100; a++) {
			
			if(a % 7 == 0)
			
			System.out.print(a + " ");
		}
		
		System.out.println(); //줄바꿈
	
		
		//2. 200까지 정수 중에서 8의 배수의 갯수를 출력
		
		int cnt = 0;
		for(int a = 1; a <= 200; a++) {
			
			if (a % 8 == 0) { // 8의 배수들만 배열을 생성해서 담기
				cnt++;	
			}
			
		}
		System.out.println("8의 배수의 갯수는:" + cnt);
		
		//3. 50~100사이의 짝수의 합
		int sum = 0;
		for(int a = 50; a <= 100; a++) {
			if (a % 2 == 0) {
				sum += a;
			}
		}
		System.out.println("짝수의 합은:" + sum);
		
		//4. A~Z까지 문자열의 합을 구하세요. ABCD....Z
		//A = 65, Z = 90
		
		String str = "";
		for(char a = 'A'; a<='Z'; a++) {
			str+=a;
			
		}
		System.out.print(str);
		
	
	}

}
