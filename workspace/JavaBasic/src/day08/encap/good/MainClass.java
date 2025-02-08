package day08.encap.good;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyData me = new MyData();
		//me.setYear(2026);
		
		me.setYear(2025);
		int year = me.getYear();
		System.out.println("년도:" + year);
		
		me.setMonth(12);
		int month = me.getMonth();
		System.out.println("월:" + month);
		
		me.setDay(25);
		int day = me.getDay();
		System.out.println("일:" + day);
		
		me.setSsn("2512253030333");
		String ssn = me.getSsn();
		System.out.println("주민등록번호:" + ssn);
		
	}

}
