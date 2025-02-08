package baekjoon06;

public class Quiz04sol {

	public static void main(String[] args) {
		
		System.out.println(palindrom("noon"));
		System.out.println(palindrom("level"));
		System.out.println(palindrom("apple"));

	}

	public static boolean palindrom(String word) {

		for(int i = 0; i < word.length() / 2; i++) {
			if(word.charAt(i) != word.charAt(word.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}



}
