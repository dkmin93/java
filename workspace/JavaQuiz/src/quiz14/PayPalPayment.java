package quiz14;

public class PayPalPayment implements Payment {
	
	private String details = "4567";
	
	public void pay(int amount) {
		System.out.println("PayPal로 " + amount + "원을 결제합니다.");
	}

	
	public boolean validatePaymentDetails(String details) {
		if(details.equals(this.details)) {
			System.out.println("결제가 정상처리되었습니다");
			return true;
		} else {
			System.out.println("PIN 번호를 다시 확인해주세요");
			return false;
		}
	}

}
