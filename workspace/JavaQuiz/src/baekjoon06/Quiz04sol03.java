package baekjoon06;

public class Quiz04sol03 {

	public static void main(String[] args) {
		
		System.out.println(palindrom("level"));
		System.out.println(palindrom("apple"));

	}

	public static boolean palindrom(String word) {
		return new StringBuilder(word).reverse().toString().equals(word);

	}

}


