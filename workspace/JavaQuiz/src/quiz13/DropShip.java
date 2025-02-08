package quiz13;

public class DropShip extends Unit {

	private Unit[] arr = new Unit[8];
	private int index = 0;
	
	DropShip() {
		System.out.println("Can I take your order?");
		hp = 150;
		armor = 2;
		
	}
	
	void ride(Unit unit) {
		System.out.println("유닛을 수송칸에 태웁니다.");
		if(unit instanceof Marine && index <= 7) {
			arr[index] = unit;
			index++;
		} else {
			System.out.println("수송 공간이 부족합니다.");
		}
		
		if(unit instanceof SiegeTank && index <= 4) {
			arr[index] = unit;
			index += 4;
		} else {
			System.out.println("수송 공간이 부족합니다.");
		}
	}
	
}
