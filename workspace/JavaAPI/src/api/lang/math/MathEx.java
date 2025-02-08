package api.lang.math;

public class MathEx {
	
	public static void main(String[] args) { //프라이빗 메서드라 스태틱 기능으로 호출한다 뉴메스 불가능
		
		System.out.println(Math.random()); //0이상 1미만 랜덤 난수값
		
		System.out.println(Math.ceil(3.14)); //올림 실수형 반환
		
		System.out.println(Math.floor(3.14)); //내림 실수형 반환
		
		System.out.println(Math.round(3.14)); //반올림 정수형 반환
	
		System.out.println(Math.abs(-5)); //절댓값 정수형 반환
	
		System.out.println(Math.max(-24, -542)); // 비교해서 최댓값 정수 반환
		
		System.out.println(Math.min(-24, -542)); // 비교해서 최솟값 정수 반환
		
		System.out.println(Math.sqrt(3)); // 소괄호 안의 루트값
		
		
		
		
	}

}
