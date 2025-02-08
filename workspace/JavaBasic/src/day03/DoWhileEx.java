package day03;

public class DoWhileEx {
	
	public static void main(String[] args) {
		
		//dowhile문 : 조건이 false여도 무조건 1번은 실행된다. 2회전부터는 while문과 동일
		
		
		int i = 1;
		do {
			
			System.out.println(i);
			
			i++;
		} while ( i >= 10 );
		
	}

}
