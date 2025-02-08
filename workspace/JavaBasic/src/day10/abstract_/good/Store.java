package day10.abstract_.good;

public abstract class Store {
	
	/*
	 * 1.메서드에 abstract를 붙이면 추상 메서드가 된다.
	 * 추상 메서드는 {}가 없는(괄호 속이 비어 있는) 메서드 선언이다
	 * 2.추상메서드를 쓰고 싶으면 추상 클래스 안이여야만 한다.
	 * 3.추상클래스도 일반메서드, 생성자, 일반변수 모두 사용할 수 있다.(+@ 추상메서드까지)
	 * 
	 */

	public String storeName = "신비한 과일가게";
	
	public Store() {
		System.out.println("Store생성자 호출");
	}
	
	public abstract void melon();
	public abstract void orange();
	public abstract void grape();
	public abstract void apple();
	
	public final void mango() {
		System.out.println("망고는 시세가 1000원으로 동일합니다");
	}
	
	
	
	
}
