package quiz11;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("주먹펴고일어서");
		Warrior w2 = new Warrior("아란");
		
		Sorceress s1 = new Sorceress("루시드");
		Sorceress s2 = new Sorceress("검은마법사");
		
		w1.powerStrike(s1);
		w1.info();
		s1.info();
		
	
		Player[] target = {w1, w2}; // Player타입의 target이라는 이름을 가진 배열에 w1과 w2를 담겠다
		s2.blizzard(target);
		s2.info();
		w1.info();
		w2.info();
		
		
	}
	
}
