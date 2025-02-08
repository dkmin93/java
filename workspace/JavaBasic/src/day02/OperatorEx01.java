package day02;

public class OperatorEx01 {
	public static void main(String[] args) {
		
		//단항연산자
		
		//부호연산자 +, -
		int i = -3;
		System.out.println(i);
		
		//증감연산자 ++, --
		
		int k = 1;
		int h = k++; //후위연산 : 먼저 값을 대입하고 맨 마지막에 증감
		System.out.println("k값:" + k);
		System.out.println("h값:" + h);
		
		int x = 1;
		int y = ++x; //전위연산 : 먼저 증감시키고 그 다음에 대입을 한다
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		
		x = 1;
		System.out.println( x++ );
		System.out.println( ++x );
		
		System.out.println("-------------------------------------------------------");
		
		//비트연산자 ~ 많이 쓰진 않는다
		byte b = 10; // 0000 1010
		System.out.println(~b); // 1111 0101
		System.out.println(~b + 1); // -10 b에대한 보수라는 뜻 보수는 원래수와 더해서 0이되게 하는 수 
		
		
		System.out.println("-------------------------------------------------------");
		
		//논리반전 연산자 ! 부정의 의미로 사용(조건을 만들 때 사용)
		
		System.out.println(!true);
		System.out.println(!false);
		
		boolean bool = !true;
		
		
		
	}
}
