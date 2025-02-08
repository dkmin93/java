package regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {
	
	public static void main(String[] args) {
		
//		 | - or
//		 () - 집합
//		 ? - 0~1회 나온다
//		 * - 0회 이상 나온다
//		 + - 1회 이상 나온다
//		 {4} - 4회 나온다
//		 {3, } - 3회 이상 나온다
//		 {3,5} - 3~5회 나온다
//		 
//		 [0-9] - 0~9 사이의 문자 1개가 나온다
//		 \\d - 0~9 사이의 문자 1개가 나온다
//		 
//		 [a-zA-Z가-힣] - 알파벳 또는 한글 1개가 나온다
//		 \\w - 영문자 숫자 1개가 나온다
		
//		 정규표현식에 사용되는 특수문자를 찾고 싶은 경우에는 \\를 붙이면 된다
//		 \\? - 가령 ?는 정규표현식에 사용되는 문자지만 ?자체를 찾고 싶을 때 사용		
		
		String info = "30세/홍길동/강남구/02-123-1234/010-1234-1234/aaa@example.com";
		
		String pattern1 = "\\d{2,3}-\\d{3,4}-\\d{4}"; //전화번호의 형식
		
		Pattern p = Pattern.compile(pattern1); //정규표현문자열을 넣는다
		Matcher m = p.matcher(info); //적용할 문자열을 소괄호 안에 넣는다
		
//		find - 정규표현식을 찾는다(찾을 경우 true, 없을 경우 false)
//		group - 정규표현 문자열을 얻는다
//		start - 시작 위치
//		end - 끝 위치
		
//		if(m.find()) { //1번 수행할 때 앞에서 한 번 찾는다
//			System.out.println("정규표현식에 해당하는 문자열을 찾음!");
//			System.out.println(m.group());
//			System.out.println("시작위치:" + m.start()); //위치는 인덱스 번호
//			System.out.println("끝위치:" + m.end());
//		}
		
		while(m.find()) { //1번 수행할 때 앞에서 한 번 찾는다
			System.out.println("정규표현식에 해당하는 문자열을 찾음!");
			System.out.println(m.group());
			System.out.println("시작위치:" + m.start()); //위치는 인덱스 번호
			System.out.println("끝위치:" + m.end());
		}
		
		System.out.println("===================================================");
		
		//이메일 형식		   알파벳이나 숫자 1개이상(+) \\.(특수문자가 정규표현식의 문자일경우 \\를 사용해 특수문자만을 찾을 수 있다)
		String pattern2 = "[a-z0-9]+@[a-z]+\\.[a-z]+"; //형식은 다를 수 있다
		
		Matcher m2 = Pattern.compile(pattern2).matcher(info);
		
		if(m2.find()) {
			System.out.println(m2.group()); // 
		}
		
		
	}

}
