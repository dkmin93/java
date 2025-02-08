package day09.poly.basic2;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
//		//다형성이라는 개념이 없다면?
//		Student s1 = new Student("홍길동", 20, "123");
//		Student s2 = new Student("박찬호", 30, "456");
//		Student s3 = new Student("손흥민", 40, "789");
//		
//		Teacher t1 = new Teacher("강호동", 50, "체육");
//		Teacher t2 = new Teacher("유재석", 60, "국어");
//		
//		Employee e1 = new Employee("조세호", 70, "예능부");
//		
//		// 학생 배열
//		Student[] students = {s1,s2,s3};
//		Teacher[] teachers = {t1,t2};
//		Employee[] employees = {e1};
		
		
		//다형성을 적용
		Person s1 = new Student("홍길동", 20, "123");
		Person s2 = new Student("박찬호", 30, "456");
		Person s3 = new Student("손흥민", 40, "789");
		
		Person t1 = new Teacher("강호동", 50, "체육");
		Person t2 = new Teacher("유재석", 60, "국어");
		
		Person e1 = new Employee("조세호", 70, "예능부");
		
		Person[] people = {s1,s2,s3,t1,t2,e1};
		
		for(Person p : people) { //향상된 for문
			System.out.println(p.info()); //오버라이드 된 메서드
		}
		
		System.out.println("================================================");
		
		//showStudent에 s1, t1, e1객체를 각각 전달하기
		
		House h = new House();
		h.showPerson(s1);
		h.showPerson(t1);
		h.showPerson(e1);
		
	}

}
