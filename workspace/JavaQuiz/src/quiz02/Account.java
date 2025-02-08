package quiz02;

import java.util.Scanner;

public class Account {
	
	String name;
	String password;
	int balance;
	
	Account(String yourname, String yourpassword, int yourbalance) {
		name = yourname;
		password = yourpassword;
		balance = yourbalance;
	}
	
	void deposit(int money) { //입금 기능
		System.out.println(money + "원을 입금했습니다.");
		balance += money;
	}
	
	int withDraw(int b) { //출금기능
		Scanner scan = new Scanner(System.in);
		System.out.println("비밀번호를 입력하세요>");
		String pw = scan.next();
		
		if(password.equals(pw)) { // DB에 입력된 passsword 값이랑 출금시 입력된 pw를 비교하여 동일한가?
			System.out.println("비밀번호가 일치합니다");
			System.out.println(b + "원을 출금합니다");
			balance-=b;
		} else {
			System.out.println("비밀번호가 일치하지 않습니다");
		}
		return b;
	}
	
	int getBalance() { // 잔액조회 기능
		System.out.println("잔액을 조회합니다.");
		System.out.println("현재 잔액은 " + balance + "원 입니다.");
		return balance;
	}
	

}
