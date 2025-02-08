package collection.map;

import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TreeMapEx {
	
	public static void main(String[] args) {
		
		//사용방법은 HashMap이랑 같음
		//키를 정렬시켜서 저장한다
		
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(2,"a");
		map.put(3,"b");
		map.put(5,"c");
		map.put(1,"밥먹자");
		
	}

}
