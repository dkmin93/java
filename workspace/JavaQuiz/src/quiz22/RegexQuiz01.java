package quiz22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {
	
	public static void main(String[] args) {
		
		String str = "헐4,500원 일수도 있고~ 1,200원 일수도 있지. 킹치만 가격은 6000원 일 수도 있어";
		
		String pattern = "[0-9]+\\,*[0-9]+원"; // 최대가 십만원대(100,000)
		
		Matcher m = Pattern.compile(pattern).matcher(str); // pattern을 cimpile해서 문자열 str에서 pattern에 따라 검증하는 Matcher를 생성 
		
		while(m.find()) { 
			System.out.println(m.group()); //Matcher에서 패턴에 해당하는 값을 얻음
		}
		
		
		
		
	}

}
