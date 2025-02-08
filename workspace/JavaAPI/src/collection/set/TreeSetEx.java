package collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	
	public static void main(String[] args) {
		
		//자동으로 오름차순 정렬이 되는 set
		
		Set<String> set = new TreeSet<>();
		
		set.add("강아지");
		set.add("강아지");
		set.add("송아지");
		set.add("망아지");
		set.add("얼룩송아지");
		
		//set처럼 중복을 허용하지 않고 순서 또한 보장하지 않는다
		//하지만만 숫자는 오름차순 문자는 사전 순으로 정렬된다
		System.out.println(set.toString());
		
		//나머지 사용방법은 HashSet과 동일하다
		
		
	}

}
