package quiz11.review;


public class Sorceress extends Player {

	//블리자드 : 매개변수로 Player배열 받는다. 스킬을 사용하면 나의 mp가 200소모. 마나가 부족하면 스킬사용불가
	//배열안에 들어있는 모든 객체에 100~250사이의 랜덤한 피해를 1번 발생
	//타격당한 플레이어의 이름 출력
	
	public Sorceress(String name) {
		this.name = name;
		this.hp = 500;
		this.mp = 1000;
	}
	
	public void Meteo(Player[] player) {
		if(this.mp < 200) {
			System.out.println("마나가 부족하여 스킬을 사용할 수 없습니다");
		}
		this.mp -= 200;
		System.out.println(this.name + "님이 " + "지정된 범위에 메테오를 사용합니다");
		for(Player p : player) {
			int random = (int)(Math.random()*151 + 100);
			p.hp -= random;
			System.out.println(p.name + "님의 hp가 " + random + " 감소하여 현재 체력은 " + p.hp + "입니다");
		}
		
		
		
		
	}
	

	
	
}
