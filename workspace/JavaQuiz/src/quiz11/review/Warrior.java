package quiz11.review;

public class Warrior extends Player {

	//생성자 : 이름을 전달 받아서 hp는 1000 mp는 500으로 초기화
	//강타 : 매개변수로 Player를 받는다. 스킬을 사용하면 나의 mp가 100소모. 마나가 부족하면 스킬사용불가
	//타격당한 상대방은 hp가 100이 감소
	
	public Warrior(String name) {
		this.name = name;
		this.hp = 1000;
		this.mp = 500;
	}
	
	public void Smash(Player p) {
		if(this.mp < 100) {
			System.out.println("마나가 부족하여 스킬을 사용할 수 없습니다");
		}
		this.mp -= 100;
		System.out.println(this.name + "님이 " + p.name + "님에게 스매시를 사용합니다");
		
		p.hp -= 100;
		System.out.println(p.name + "님의 hp가 100감소하여 현재 체력은 " + p.hp + "입니다");
		
	}
	
	

}
