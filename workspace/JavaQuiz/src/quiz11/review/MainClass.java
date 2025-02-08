package quiz11.review;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("카단");
		Warrior w2 = new Warrior("카멘");
		w1.Smash(w2);
		w1.info();
		w2.info();
		
		Sorceress s1 = new Sorceress("아제나");
		Sorceress s2 = new Sorceress("아브렐슈드");
		s1.info();
		s2.info();
		
		Player[] target = {w2, s2};
		s1.Meteo(target);
		
		
		
		
		
		
		
	}
	
}
