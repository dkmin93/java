package day08.this_basic;

public class Employee extends Person {

	String department;
	
	@Override
	String info() {
		// TODO Auto-generated method stub
		return "이름:" + name + ", 나이:" + age + ", 부서:" + department;
	}
	
}
