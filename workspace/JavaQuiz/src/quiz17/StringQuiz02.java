package quiz17;

public class StringQuiz02 {
	
	public static void main(String[] args) {
		
		//문자열 거꾸로 뒤집기
		
		//매개변수로 전달받은 문자열을 거꾸로 뒤집어서 반환하는 메서드를 생성
		                //   01234  43210
		//reverse(String) // abced가 decba가 됨
		
		
		System.out.println(reverse("ABCDE"));
		System.out.println(reverse("hello world"));
		
	}
	
	public static String reverse(String word) {
		String[] arr = word.split("");
		String result = "";
		
		for(int i = word.length()-1; i >= 0 ; i--) { //43210
			result += arr[i]; 
		}
		return result;
		
		
		
		
	}

}


