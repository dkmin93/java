package baekjoon06;

public class Quiz04sol02 {

	public static void main(String[] args) {

		System.out.println(palindrom("level"));
		System.out.println(palindrom("apple"));
		
	}

	public static boolean palindrom(String word) { //스트링빌더 리버스 기능 이용하는 방법

		StringBuilder sb = new StringBuilder(word);
		sb.reverse();

		String newWord = sb.toString();

		return word.equals(newWord);
	}




}
