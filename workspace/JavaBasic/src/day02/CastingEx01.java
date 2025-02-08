package day02;

public class CastingEx01 {
	public static void main(String[] args) {
		
		/*
		 * 크기가 작은타입을 큰 타입에 대입하면
		 * 자동으로 형변환을 해준다
		 * JVM(자바가상머신)이 해준다
		 */
		
		byte b = 10;
		short c = b; // byte타입에서 short형으로 자동형변환
		int i = b; // byte타입에서 int형으로 자동형변환
		long l = b;
		
		char cc = 'A';
		int ii = cc; // char이 int로 형변환
		System.out.println(ii);
		
		int k = 10;
		double d = k;
		System.out.println(d); // int가 double로 자동형변환 
	}
}
