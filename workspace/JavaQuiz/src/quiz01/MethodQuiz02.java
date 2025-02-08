package quiz01;

public class MethodQuiz02 {
	
	public static void main(String[] args) {
		System.out.println(javaJavaJa(10)); // 자바자바 출력
	}

	static String javaJavaJa(int a) { 
	
		String ja = "자";
		String java = "자바";
		String c = "";
		if(a == 1) { //1인 경우
			c = ja;
		} else if (a % 2 == 1 && a != 1) { // 홀수인 경우 3자바자(1반복) 5자바자바자(2반복)
			for(int i = 1; i <= a/2; i++) {
				c += java;
			}
				c = c + ja;
		} else { //짝수인 경우 2 4
			for(int i = 1; i <= a/2; i++) {
				c += java;
			}
		}
		
		return c;
		
	}
}
