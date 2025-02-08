package day08.this_basic;

//자식의 클래스 뒤에 extends + 부모클래스 를 사용하고 중복되는 부분을 수정한다
public class Student extends Person {

	String studentId;
	
	@Override //어노테이션 - 특정 기능을 표현, 지워도 무관
	String info() {
		// TODO Auto-generated method stub // 작성하고 싶은 내용을 적을 것
		return "이름:" + name + ", 나이:" + age + ", 학번:" +studentId;
	}
	
	
}
