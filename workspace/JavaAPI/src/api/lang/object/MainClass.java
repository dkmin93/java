package api.lang.object;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * Object class
		 * toString - 객체의 주소를 문자열로 반환
		 * equals - 객체의 주소값을 비교해서 같은 객체라면 true
		 * hashCode - 객체의 값을 고유한 숫자로 만들어서 반환
		 * getClass - 현재 실행되는 클래스를 문자열로 반환
		 * clone(protected) - 객체를 복사해주는 기능
		 * finalize - 객체가 소멸될 떄 동작한다(정확한 시점을 알기 어렵다.)
		 */
		
		Person p = new Person("홍길동");
		
		String s = p.toString();
		System.out.println(s);
		
		Person p2 = new Person("홍길동");
		boolean r = p.equals(p2); 
		System.out.println("이름이 같음?: "+ r); //주소값이 서로 다르다
		
		System.out.println("객체의 고유한 숫자값:" + p.hashCode());
		
		System.out.println("현재 실행되는 객체를 반환:" + p.getClass());
		
		try {
			Person clonePerson = (Person)p.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		//finalize
		p = null;
		System.gc(); //가비지컬렉터 동작
		
		
		
		
	}

}
