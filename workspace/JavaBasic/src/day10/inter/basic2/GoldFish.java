package day10.inter.basic2;

public class GoldFish extends Fish implements IPet {

	public void swim() {
		System.out.println("금붕어는 어항에서 수영해요");
	}

	public void play() {
		System.out.println("금붕어는 어항에서 놀아요");
	}

}
