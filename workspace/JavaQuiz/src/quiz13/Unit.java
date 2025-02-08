package quiz13;

public abstract class Unit {
	
	int x = 0;
	int y = 0;
	int hp;
	int armor;
	int weight;
	
	public void location() {
		System.out.println("현재 유닛의 좌표는");
		System.out.println(x + "," + y + " 입니다.");
	}

	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(this.x + "," + this.y + " 좌표로 이동합니다.");
	}
	
	void stop() {
		System.out.println("위치가 고정됩니다.");
	}
	
	void info() {
		System.out.println("해당 유닛의 정보를 조회합니다.");
		System.out.println("hp:" + this.hp);
		System.out.println("armor:" + this.armor);
	}
}
