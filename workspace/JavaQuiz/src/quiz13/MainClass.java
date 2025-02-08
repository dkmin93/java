package quiz13;

public class MainClass {
	
	public static void main(String[] args) {
		
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
		Marine m4 = new Marine();
		
		SiegeTank t1 = new SiegeTank();
		
		DropShip d1 = new DropShip();
		
		d1.ride(m1);
		d1.ride(m2);
		d1.ride(m3);
		d1.ride(m4);
		d1.ride(t1);
		d1.ride(m1);
		
		
		
		
	}

	
	
}
