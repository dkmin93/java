package quiz12;

public class MainClass {
	
	public static void main(String[] args) {
		
		Circle c = new Circle("반지름이 10인 원", 10);
		System.err.println(c.getName());
		System.out.println(c.getArea());
		
		Rect r = new Rect("변의길이가 2인 정사각형", 2);
		System.err.println(r.getName());
		System.out.println(r.getArea());
		
		
		
		
	}

}
