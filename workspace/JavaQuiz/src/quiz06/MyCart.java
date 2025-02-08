package quiz06;

import java.util.Arrays;
import java.util.Scanner;

public class MyCart extends Cart{ //상속 받은 자식 클래스

	MyCart(int a) {
		money = a;
		tv = 300;
		com = 400;
		radio = 500;
	}
	// 가진돈이 1~299 무조건 부족 / 300~399 TV는 사고 컴퓨터 못삼 / 400~499 tv 컴퓨터사고 라디오못

	void buy(String product) {
		if(money < 300) {
			System.out.println("잔액이 부족합니다");
			return;
		} else if(money < 400) {
			if (product == "tv") {
				money -= tv;
				System.out.println("tv를 구매합니다. 충전된 금액에서 300원을 차감합니다.");
				System.out.println("현재 잔액> " + money + "원");
				System.out.println("구매한 상품> tv");
				System.out.println("===================================");
			} else {
				System.out.println("잔액이 부족합니다");
				return;
			}

		} else if(money < 500) {
			if (product == "tv") {
				money -= tv;
				System.out.println("tv를 구매합니다. 충전된 금액에서 300원을 차감합니다.");
				System.out.println("현재 잔액> " + money + "원");
				System.out.println("구매한 상품> tv");
				System.out.println("===================================");
				//add("tv");
			} else if(product == "com") {
				money -= com;
				System.out.println("com를 구매합니다. 충전된 금액에서 400원을 차감합니다.");
				System.out.println("현재 잔액> " + money + "원");
				System.out.println("구매한 상품> com");
				System.out.println("===================================");
				//add("com");
			} else {
				System.out.println("잔액이 부족합니다");
				return;
			}
		} else if(money >= 500) {
			if(money < 300) {  // 가진 돈 300 미만일 경우
				System.out.println("잔액이 부족합니다");
				return;
			} else { // 돈이 충분히 있을 경우
				if (product == "tv") {
					money -= tv;
					System.out.println("tv를 구매합니다. 충전된 금액에서 300원을 차감합니다.");
					System.out.println("현재 잔액> " + money + "원");
					System.out.println("구매한 상품> tv");
					System.out.println("===================================");
					//add("tv");
				} else if(product == "com") {
					money -= com;
					System.out.println("com를 구매합니다. 충전된 금액에서 400원을 차감합니다.");
					System.out.println("현재 잔액> " + money + "원");
					System.out.println("구매한 상품> com");
					System.out.println("===================================");
					//add("com");
				} else if(product == "radio") {
					money = radio;
					System.out.println("radio를 구매합니다. 충전된 금액에서 500원을 차감합니다.");
					System.out.println("현재 잔액> " + money + "원");
					System.out.println("구매한 상품> radio");
					System.out.println("===================================");
					//add("radio");
				} else {
					System.out.println("상품 없음");
					return;
				}
			}
		}
	}



	/*1. 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 *    -기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 *    -기존의 장바구니 값을 새로운 배열에 복사.
	 *    -새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 2. product를 장구니에 담는다.
	 */
	void add(String product) {
		cart[i] = product;
		if(i >= cart.length) {
			String[] temp = new String[cart.length * 2];
			for(int i = 0; i < temp.length; i++) {
				temp[i] = cart[i];
				cart[i] = temp[i];
				temp = null;
			}
			
			cart[i] = product;
			i++;
			
		}
		info();
	}

	void info() {
		for(int i = 0; i < cart.length; i++) {
			System.out.println("장바구니 내역> " + cart[i]);
			
			System.out.println("현재 충전되어 있는 금액은 " + money + "입니다." );
			buy(cart[i]);
		}

	}

	//1. MyCart의 생성자에서는 int매개변수를 하나 받으며, 금액을 초기화합니다. tv=300원, com=400원, radio=500원 으로 초기화
	//2. buy(), add(), info() 메서드를 오버라이딩 합니다.

	/*
	 * buy()의 기능
	 * 1. money가 300보다 작으면 "금액부족" 출력후 메서드를 종료.
	 *    매개변수가 tv, com, radio가 아니더라도 "상품없음" 출력 후 종료
	 * 2. 매개변수 tv라면 금액에서 tv가격을 빼고 add(상품)을 호출
	 *    매개변수 com라면 금액에서 com가격을 빼고 add(상품)를 호출
	 *    매개변수 radio라면 금액에서 radio를 빼고 add(상품)을 호출
	 */


	/*
	 * add()의 기능
	 * 1. 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 *    -기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 *    -기존의 장바구니 값을 새로운 배열에 복사.
	 *    -새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 2. product를 장구니에 담는다.
	 * 3. info() 메서드를 호출
	 */


	/*
	 * info()의 기능
	 * 
	 * 2. 장바구니에 담긴 물건 목록을 + 금액을 더해서 출력 
	 * 3. 메인에서 buy()를 실행 시킨다.
	 */





}
