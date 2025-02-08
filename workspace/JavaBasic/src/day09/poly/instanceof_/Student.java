package day09.poly.instanceof_;

public class Student extends Person {

	String studentId;
	
	Student(String name, int age, String studentId) {
		super(name, age); //부모님이 가지고 있는 name, age에 한번에 저장한다
		this.studentId = studentId;
	}
	
	@Override //어노테이션 - 특정 기능을 표현, 지워도 무관
	String info() {
		// TODO Auto-generated method stub // 작성하고 싶은 내용을 적을 것
		return super.info() + ", 학번:" +studentId;
	} //부모클래스의 이름 나이까지는 동일하므로 super로 부모님클래스에서 정보를 끌어오고 학번만 추가한다
	  
	
	
}
