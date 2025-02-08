package day08.encap.obj;

public class MainClass {

	public static void main(String[] args) {

		Hotel hotel = new Hotel();

		//setter
		Chef c = new Chef();
		hotel.setChef(c);
		//hotel.setChef(new Chef()); 위의 방법이나 이 방법이나 같은 표현

		//getter
		Chef chef = hotel.getChef();
		chef.cooking();

	}
}
