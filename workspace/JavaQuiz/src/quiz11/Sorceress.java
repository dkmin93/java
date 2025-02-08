package quiz11;

import java.util.Random;

public class Sorceress extends Player {

	//블리자드 : 매개변수로 Player배열 받는다. 스킬을 사용하면 나의 mp가 200소모. 마나가 부족하면 스킬사용불가
	//배열안에 들어있는 모든 객체에 5~15사이의 랜덤한 피해를 1번 발생
	//타격당한 플레이어의 이름 출력
	
	Sorceress(String name) {
		this.name = name;		
		hp = 500;
		mp = 1000;
	}
	
	public void blizzard(Player[] players) { // 피해자 배열을 만들어서 매개변수에 넣기
		if(this.mp < 200) {
			System.out.println("마나가 부족하여 블리자드 스킬을 사용할 수 없습니다");
		}
			this.mp -= 200;
			for(Player p : ) {
			int ran	= (int)(Math.random() * 11 + 5);
			
			
			System.out.println(this.name + "이(가) 블리자드를 사용하였습니다. " + p +"의 hp가 100 감소했습니다.");
			System.out.println("현재 " + p.name + "의 체력은 " + p.hp + "입니다.");
		}
	}
	
	
}
