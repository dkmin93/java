package quiz08;

public class MainClass {
	
	public static void main(String[] args) {
		
		SuperSonicAp ap = new SuperSonicAp("대한항공");
		
		ap.takeOff();
		ap.fly();
		ap.flyMode = 1;
		ap.fly();
		ap.land();
		System.out.println(ap.info());
	}

}
