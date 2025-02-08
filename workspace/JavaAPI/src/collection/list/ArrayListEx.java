package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx { //동적 메서드

	public static void main(String[] args) {

		//ArrayList<String> list = new ArrayList<>();
		List<String> list = new ArrayList<>(); //List(부모클래스)가 가진 추상메서드를 ArrayList가 다 구현하고 있어서 보통 이 방식을 흔하게 사용한다

		//list에 추가
		list.add("java");
		list.add("database");
		list.add("html");
		list.add("git");
		list.add("java");

		//list를 문자열로 한눈에 확인
		System.out.println(list.toString());

		//list의 크기 확인
		System.out.println("리스트 크기:" + list.size()); //반복문을 돌릴경우 .length가 아니라 .size를 사용하기!!!!

		//list의 중간에 값을 추가
		list.add(2, "css"); //2번째 인덱스 자리에 ""새로운 값을 추가한다
		System.out.println(list.toString());

		//list에서 값을 얻기
		String element = list.get(3);
		System.out.println("3번 인덱스의 값:" + element);

		//list에 값이 포함되어 있는지 확인하기, 문자열 및 숫자만 확인 가능
		if(list.contains("database")) {
			System.out.println("database가 포함되어 있음");
		} else {
			System.out.println("database가 포함되지 않음");
		}
		
		//list에서 특정 값 삭제
		list.remove(0); //0번 인덱스 값 삭제
		System.out.println(list.toString());
		
		list.remove("git"); //""입력한 값 삭제
		System.out.println(list.toString());

		//list에서 값 수정
		list.set(0, "데이터베이스");
		System.out.println(list.toString());

		System.out.println("======================================================");
		
		//요소를 지정해서 리스트를 빨리 생성
		List<String> newList = Arrays.asList("홍길동", "이순신", "홍길자");
		System.out.println(newList.toString());
		
		//제네릭<?> - 꺽쇄 안에 ?가 들어가 있다면 뭐든지 다 들어갈 수 있다는 의미
		//제네릭<? estends String> String이나 String의 자식타입은 전달 가능
		//제네릭<? super String> String의 형태를 가질 수 있다면 전달 가능
		
		list.addAll(newList); //Collection<String> 타입이면 무엇이든 전달 가능 
		System.out.println(list.toString());
		
		//리스트 요소를 전부 삭제
		list.clear();
		System.out.println(list.toString());
		
		
		
	}

}
