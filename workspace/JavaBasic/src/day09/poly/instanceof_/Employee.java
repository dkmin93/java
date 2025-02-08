package day09.poly.instanceof_;

public class Employee extends Person {

	String department;
	
	Employee(String name, int age, String department) {
		super(name, age); //부모님이 가지고 있는 name, age에 한번에 저장한다
		this.department = department;
	}
	
	@Override
	String info() {
		// TODO Auto-generated method stub
		return super.info() + ", 부서:" + department;
	}
	
}
