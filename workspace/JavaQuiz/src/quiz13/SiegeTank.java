package quiz13;

public class SiegeTank extends Unit {
	
	public static int attack = 30;
	public static int armor = 2;
	
	int weight;
	
	private boolean changeMode = false;

	SiegeTank() {
		System.out.println("Ready to roll out!");
		this.hp = 150;
		weight = 4;
	}
	
	public void changeMode() {
		System.out.println("공성모드로 전환합니다. attack이 40 증가합니다.");
		changeMode = !changeMode;
		this.attack += 40 ;
		stop();
	}
	
	void info() {
		System.out.println("hp:" + this.hp);
		System.out.println("attack:" + this.attack);
		System.out.println("armor:" + this.armor);
	}

}
