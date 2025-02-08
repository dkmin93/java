package generic.bad;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		p.setObj("홍길동"); //문자열 홍길동 저장
		String name = (String)p.getObj(); //Object타입으로 저장되어있으므로 String타입으로 사용하려면 캐스팅해야한다
		
		p.setObj(new ABC()); // ABC객체 생성해서 저장
		ABC n = (ABC)p.getObj(); //Object타입으로 형변환되어 저장되있으므로 ABC타입으로 다시 캐스팅해줘야한다
	
		/*/
		 * Object형으로 선언하면 무엇이든 저장할 수 있는 장점이 있지만
		 * 반대로 값을 사용할 때 타입별로 형변환을 해야하는 문제가 발생한다
		 * 잘못 형변환하면 예외가 발생한다
		 */
	
	
	}

}
