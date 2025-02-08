package day08.this_basic;

public class Teacher extends Person {
	
	String subject;
	
	@Override
	String info() {
		// TODO Auto-generated method stub
		return "이름:" + name + ", 나이:" + age + ", 과목:" +subject;
	}

}
