package day08.super_basic2;

public class MainClass {
	
	public static void main(String[] args) {
		
		Student s = new Student("홍길동", 20, "123456");
		System.out.println(s.info());
		
		Teacher t = new Teacher("가나다", 21, "수학");
		System.out.println(t.info());
		
		Employee e = new Employee("라마바", 22, "기획");
		System.out.println(e.info());
		
		
		
		
		
	}

}
