package day02;

public class DataTypeEx01 {
	public static void main(String[] args) {
		
		//정수형 타입
		byte a = 127; // 양수는 2의 7승(8-1) -1
		byte a2 = -128; // 음수는 - 2의 7승
		
		short b = 32767; // 양수는 2의 15승(16-1) -1
		short b2 = -32768;
		
		int c = 2147483647;
		int c2 = -2147483648;
		
		long d = 1213123123221321423L; //롱타입은 숫자 마지막에 L을 붙여야 한다. 대소문자 무관
		System.out.println(d);
		
		/*
		 * 2진수 - 숫자앞에 0b를 붙임
		 * 8진수 - 숫자앞에 0을 붙임
		 * 16진수 - 숲자앞에 0x를 붙임
		 * 형태로 저장 가능.
		 * 
		 */
		
		int bin = 0b1010;
		System.out.println("이진수 1010의 값은:" + bin + "입니다!");
		
		System.out.println("------------------------------------------------------");
		
		//실수형 타입
		float f1 = 3.141592567F; //더블형이 기본타입이므로 플롯은 숫자 뒤에 f를 붙여야한다.
		double d1 = 3.141592567;
		
		System.out.println(f1); //7자리
		System.out.println(d1); //15자리 더 표현할 수 있으므로 신뢰도가 높기에 기본형
		
		//e표기법 - 실수부를 표현할 자리가 없으면 표현되는 형식
		
		float f2 = 314.15e-2F; //e-2는 뜻은 10의 2승만큼 왼쪽으로 소숫점을 이동하라는 뜻
		double d2 = 0.00031415e4; //e4는 10의 4승만큼 오른쪽으로 소숫점을 이동하라는 뜻
		System.out.println(f2);
		System.out.println(d2);
		
		System.out.println("------------------------------------------------------");
		
		//논리형 타입
		boolean bool = true;
		boolean bool2 = false;
//		boolean bool3 = True; 이미 트루와 폴스를 지정했다면 더이상의 지정은 불가능하다
		
		
		
		
		
	}
}
