package quiz14;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		1. Payment라는 인터페이스를 정의하세요. 이 인터페이스에는 다음과 같은 메서드가 포함됩니다:
		
		void pay(int amount): 특정 금액을 지불합니다.
		boolean validatePaymentDetails(String details): 지불 세부사항이 유효한지 확인합니다.
		
		
		2. 다음 두 클래스를 작성하고 Payment 인터페이스를 구현하세요.
		
		CreditCardPayment 클래스:
		pay 메서드는 "신용카드로 [금액]원을 결제합니다."를 출력합니다.
		validatePaymentDetails 메서드는 카드 번호 형식(문자 16자리)이 올바른지 확인하여 결과를 반환합니다.
		
		PayPalPayment 클래스:
		pay 메서드는 "PayPal로 [금액]원을 결제합니다."를 출력합니다.
		validatePaymentDetails 메서드는 PIN 번호가 멤버변수 PIN 번호와 일치하는지 확인하여 결과를 반환합니다.
		  
		3. 메인 클래스에서 Payment 타입의 객체를 사용하여 두 가지 결제 방식을 시뮬레이션합니다.
				
		결제는 입력으로 결정합니다. 
		> 1. 신용카드결제 2. 페이팔결제
		이후 금액과 결제 세부사항을 입력받고, 각 방식의 pay와 validatePaymentDetails 메서드를 호출하세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("결제 방식을 입력해주세요.");
		System.out.println("1번 : 신용카드");
		System.out.println("2번 : Paypal");
		System.out.println("결제 방식>>");
		
		int paytype = scan.nextInt();
		
		Payment ccp = new CreditCardPayment();
		Payment ppp = new PayPalPayment();
		
		if(paytype == 1) {
			System.out.println("결제할 금액을 입력해주세요>>");
			ccp.pay(scan.nextInt());
			System.out.println("카드 번호 16자리를 입력해주세요>>");
			System.out.println(ccp.validatePaymentDetails(scan.next()));
		} else if(paytype == 2) {
			System.out.println("결제할 금액을 입력해주세요>>");
			ppp.pay(scan.nextInt());
			System.out.println("PIN 번호를 입력해주세요>>");
			System.out.println(ppp.validatePaymentDetails(scan.next()));
		}
		
		
		
	}

}
