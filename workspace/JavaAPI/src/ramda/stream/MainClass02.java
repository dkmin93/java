package ramda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class MainClass02 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 100; i++) {
			list.add(new Random().nextInt(100) + 1); // 1~100 랜덤 수
		}
		
		System.out.println(list.toString());
		
		System.out.println("===============================================");
		
		//중복제거 distinct
		//정렬 sorted
		list.stream().distinct().sorted().forEach(a -> System.out.print(a + " "));
		
		System.out.println(); //
		
		//내림차순
		list.stream()
			.distinct()
			.sorted((o1, o2) -> Integer.compare(o2, o1)) // 전항과 후항을 비교해서 음수나 양수를 반환한다 음수나 양수에 따라서 내림차순 오름차순이 달라진다
			.forEach(a -> System.out.print(a + " "));
			
		System.out.println("\n===============================================");			
				
		//걸러내기 filter(조건식) - 조건식이 true인 경우만 필터링
		list.stream().filter(a -> a %2 == 0).forEach(a -> System.out.print(a + " "));
		
		System.out.println("\n===============================================");
		
		//새로운 stream으로 반환 map
		//원본 리스트의 값이 50 보다 큰값이면 true, 아니면 false
		
		list.stream().map(a -> a >= 50 ? true : false).forEach(a -> System.out.print(a + " "));
		//삼항연산식 a가 50 이상이면 true 반환 아니면 false 반환
		
		System.out.println("\n===============================================");
		
		//stream의 형변환 mapTo
		
		list.stream().mapToDouble(a -> a).forEach(a -> System.out.print(a + " "));
		// Integer 타입의 리스트를 Double 타입으로 형변환하여 출력
	
		System.out.println("\n===============================================");
	
		//최종처리 집계함수 max min sum count average - int 타입만 기능을 제공하므로 mapTo를 사용해 int 타입으로 형변환
		int max = list.stream().mapToInt(a->a).max().getAsInt();
		int min = list.stream().mapToInt(a->a).min().getAsInt();
		long cnt = list.stream().mapToInt(a->a).count(); //count는 롱타입만 제공
		double avg = list.stream().mapToInt(a->a).average().getAsDouble(); // 평균은 더블타입만 제공
		int sum = list.stream().mapToInt(a->a).sum();
		
		System.out.println("리스트에서 max값:" + max);
		System.out.println("리스트에서 min값:" + min);
		System.out.println("리스트에서 count값:" + cnt);
		System.out.println("리스트의 평균:" + avg);
		System.out.println("리스트의 합계:" + sum);
		
		System.out.println("\n===============================================");
		
		//최종 처리 수집함수 collect - 컬렉션 타입으로 반환
		
		//50보다 큰 값들만 list로 다시 얻는다.       50이상인 수만 나오게 필터링                     to뒤의 타입으로 반환, List 타입으로 반환
		List<Integer> newList = list.stream().filter(a -> a >= 50).collect(Collectors.toList());
		System.out.println(newList);
		
		//맵 타입으로 반환                                               키           값
		Map<Integer, Integer> newMap = list.stream().distinct().filter(a -> a >= 50).collect(Collectors.toMap(a -> a, a -> a * a));
		System.out.println(newMap.toString());
		
		List<String> names = Arrays.asList("hong", "kim", "park", "choi", "an");
		
		System.out.println("\n===============================================");
		
		//리스트의 요소들 중에서 4글자 이상인 값만 전부 대문자로 바꾸고 알파벳순으로 정렬한 결과를 새로운 리스트로 반환
		List<String> newName = names.stream()
									.filter(a -> a.length() >= 4)
									.map(a -> a.toUpperCase())
									.sorted()
									.collect(Collectors.toList());
		
		System.out.println(newName.toString());
	}

}
