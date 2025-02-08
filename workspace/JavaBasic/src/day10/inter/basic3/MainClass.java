package day10.inter.basic3;

public class MainClass {
	
	public static void main(String[] args) {
		Lg lg = new Lg();
		lg.print("LG로 실행함");
		lg.copy(5);
		
		System.out.println("==============================================");
		
		Printed pt = new Samsung(); //Samsung타입으로 만들어서 Printed 타입에 저장
		pt.print("print 실행함");
		pt.copy(5);
		
		System.out.println("==============================================");
		
	
		
		
	}

}
