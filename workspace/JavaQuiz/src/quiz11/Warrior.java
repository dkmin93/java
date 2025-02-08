package quiz11;

public class Warrior extends Player {

	//생성자 : 이름을 전달 받아서 hp는 1000 mp는 500으로 초기화
	//강타 : 매개변수로 Player를 받는다. 스킬을 사용하면 나의 mp가 100소모. 마나가 부족하면 스킬사용불가
	//타격당한 상대방은 hp가 100이 감소
	
	
	Warrior(String name) {
		this.name = name;		
		hp = 1000;
		mp = 500;
	}
	
	public void powerStrike(Player p) {
		if(this.mp < 100) {
			System.out.println("마나가 부족하여 파워스트라이크 스킬을 사용할 수 없습니다");
			return;
		}
			this.mp -= 100;
			p.hp -= 100;
			System.out.println(this.name + "이(가) 파워스트라이크를 사용하였습니다. " + p.name +"의 hp가 100 감소했습니다.");
			System.out.println("현재 " + p.name + "의 체력은 " + p.hp + "입니다.");
		
	}

}
