package day06;

public class Phone {

	String model;
	int price;
	String color;
	
	//생성자는 클래스명과 대소문자 동일하고 반환유형은 없어야한다
	//보통 초기값을 지정하는 작업을 한다.
	Phone() {
		System.out.println("폰 생성자 호출 됨!!!"); //
		model = "늑대의유혹 가로본능";
		price = 10000;
		color = "검정색";
	}
	
	//생성자는 중복해서 여러개 만들 수 있다
	//단 매개변수의 종류 개수 순서가 달라야한다
	//완전 똑같이는 만들 수 없다는 뜻
	
	Phone(String pColor) {
		model = "전지현의 애니콜";
		price = 20000;
		color = pColor;
	}
	
	Phone(String pColor, int pPrice) {
		model = "M 모토로라가 부활했습니다";
		price = pPrice;
		color = pColor;
	}
	
	//멤버변수의 갯수 만큼 값을 받아서 초기화 해주는 생성자
	Phone(String pModel, String pColor, int pPrice) {
		//멤버변수를 초기화 해주고, 메인에서 입력
		model = pModel;
		color = pColor;
		price = pPrice;
		
	}
	
	
	void info() {
		System.out.println("===휴대폰 정보===");
		System.out.println("모델:" + model);
		System.out.println("가격:" + price);
		System.out.println("색상:" + color);
	}
	
}
