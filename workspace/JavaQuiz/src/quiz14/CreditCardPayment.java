package quiz14;

public class CreditCardPayment implements Payment {

	private String details = "123456789abcdefg";
	
	public void pay(int amount) {
		System.out.println("신용카드로 " + amount + "원을 결제합니다.");
	}

	
	public boolean validatePaymentDetails(String details) {
		if(details.equals(this.details)) {
			System.out.println("결제가 정상처리되었습니다");
			return true;
		} else {
			System.out.println("카드 번호 16자리를 다시 확인해주세요");
			return false;
		}
		
	}

}
