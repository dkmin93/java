package day11.exception.trycatch;

import java.util.Arrays;

public class MultiCatchEx01 {
	
	public static void main(String[] args) {
		
		//main에 값을 주는 방법
		//run탭 - run configuration - arguments탭 - ${string_prompt}
		try {
			String a = args[0];
			String b = args[1];
			
			int x = Integer.parseInt(a); //문자열을 숫자열로 변환하는 기능
			int y = Integer.parseInt(b);
			
			System.out.println(x + y);
			
			//String str = null; //기타 예외
			//str.charAt(0);
			
			//예외의 종류별로 각기 다른 프로그램 처리를 할 수 있다
			
		} catch (NegativeArraySizeException e) { //예외를 처리할 클래스
			System.out.println("실행 매개값을 반드시 2개 전달해 주세요.");
		} catch (NumberFormatException e) { //예외처리는 ()안에서 |를 사용하여 여러개를 처리할 수도 있다
			System.out.println("실행 매개값을 반드시 숫자로 전달해 주세요.");
		} catch (Exception e) { // 어떤 예외가 나와도 Exception은 예외의 최상위 부모클래스 이므로 모든 예외처리가 가능하다
			System.out.println("기타 예외입니다"); //Exception은 마지막에 사용해야한다. 상위 클래스가 맨 위에 있어버리면 처리가능한 하위클래스까지 싹 다 Exception에 포함되어버리기 때문
		}
		
	}

}
