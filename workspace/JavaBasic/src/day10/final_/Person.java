package day10.final_;

public class Person {
	
	//final이 변수 앞에 붙으면 반드시 초기값을 지정해줘야만 한다
	//직접 멤버변수에 지정을 해줘도 되고
	public final String nation = "대한민국"; //국적
	public final String ssn; //주민번호
	public final String name; //이름

	//생성자와 this를 사용해서 값을 입력받아 지정해도 된다.
	//객체들이 서로 다른 값을 가질 수 있기때문에
	public Person(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		
	}
	
}
