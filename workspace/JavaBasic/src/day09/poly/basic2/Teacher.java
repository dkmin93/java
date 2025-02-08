package day09.poly.basic2;

public class Teacher extends Person {
	
	String subject;
	
	Teacher (String name, int age, String subject) {
		super(name, age); //부모님이 가지고 있는 name, age에 한번에 저장한다
		this.subject = subject;
	}
	
	@Override
	String info() {
		// TODO Auto-generated method stub
		return super.info() + ", 과목:" +subject;
	}

}
