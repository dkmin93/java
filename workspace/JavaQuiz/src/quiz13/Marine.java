package quiz13;

public class Marine extends Unit {

	public static int attack = 6;
	public static int armor = 0;
	int weight;
	
	Marine() {
		System.out.println("You wanna piece of me, boy?");
		this.hp = 40;
		weight = 1;
	}
	
	void StimPack() {
		System.out.println("Ah! Yeah!");
		System.out.println("스팀팩을 사용합니다. hp가 10 감소하고 attack이 1 증가합니다.");
		this.attack += 1;
		this.hp -= 10;
	}
	
	void info() {
		System.out.println("hp:" + this.hp);
		System.out.println("attack:" + this.attack);
		System.out.println("armor:" + this.armor);
	}
	
}
