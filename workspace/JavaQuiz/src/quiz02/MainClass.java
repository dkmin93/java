package quiz02;

public class MainClass {
	
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		tv.power(); //켬
		tv.changeChannel(5);
		tv.info();
		tv.power(); //끔
		
		System.out.println("=================================");
		
		Account account = new Account("홍길동", "abcd1234", 100000);
		account.deposit(500);
		account.getBalance();
		account.withDraw(1000);
		account.getBalance();
		
		
		
	}

}
