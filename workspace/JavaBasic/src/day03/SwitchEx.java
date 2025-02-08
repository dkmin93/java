package day03;

public class SwitchEx {

	public static void main(String[] args) {
		
		int a = 5;
		
		switch ( a ) {
		
		case 0: //0과 1의 경우를 동시에
		case 1:
			System.out.println("1인데용");
			break; // switch문장을 탈출
		case 2:
			System.out.println("2인데용");
			break;
		case 3:
			System.out.println("3인데용");
			break;
		case 4:
			System.out.println("4인데용");
			break;

		default: //else구문과 유사
			System.out.println("1~4값이 아닙니다");
			break;
		}
		
		
		
	}
	
}
