package quiz06sol;

import java.util.Arrays;
import java.util.Scanner;

public class MyCart extends Cart{

	MyCart(int m) {
		money = m;
		tv = 300;
		com = 400;
		radio = 500;
	}
	
	void buy(String product) {
		if(money <300) {
			System.out.println("[금액 부족]");
			return;
		}
		////문자의 비교는 equals, 맨앞에 ! 붙여서 부정의 표현
		if(!(product.equals("tv") || product.equals("com") || product.equals("radio"))) { 
			System.out.println("[상품 없음]");
			return;
		}
		
		switch (product) {
		case "tv":
			if(money < 300) {
				System.out.println("[금액 부족]");
				return;
			}
			money -= tv;
			break;
		case "com":
			if(money <400) {
				System.out.println("[금액 부족]");
				return;
			}
			money -= com;
			break;
		case "radio":
			if(money <500) {
				System.out.println("[금액 부족]");
				return;
			}
			money -= radio;
			break;	
		default:
			break;
		}
		
		add(product); //추가하기 기능 호출

	}
	
	
	void add(String product) {
		
		if(i >= cart.length) { //가득참
			//2배 크기의 새로운 배열
			String[] newCart = new String[cart.length *2];
			//배열의 복사
			for(int i = 0; i < cart.length; i++) {
				newCart[i] = cart[i];
			}
			//장바구니 교체
			cart = newCart;
			newCart = null;
		}
		cart[i] = product;
		i++; // 다음번째에 상품이 담겨야 하니까 1증가
		
		info();
	}
	
	
	void info() {
		
		String str = "[";
		for(int j = 0; j < i; j++) {
			str += cart[j] + " ";
		}
		str += "]";
		System.out.println(str + "\n남은금액:" + money);
	}
	





}
