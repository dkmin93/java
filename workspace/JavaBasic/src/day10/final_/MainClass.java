package day10.final_;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person ko = new Person("고길동", "123123-1231234");
		Person hong = new Person("홍길동", "234234-1231234");
		
		System.out.println(ko.ssn);
		System.out.println(hong.ssn);
		
		//값의 변경 금지
		//ko.ssn = "바꿔야지~";
		
		System.out.println("=======================================");
		
		//상수의 사용 스태틱이니까 바로 생성 가능
		System.out.println(Constant.EARTH_RADIUS);
		System.out.println(Constant.O2);
		System.out.println(Constant.PI);
		
	}

}
