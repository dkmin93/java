package day10.inter.basic2;

public class Dog extends Animal implements IPet {

	public void eat() {
		System.out.println("강아지는 사료를 먹어요");
	}

	public void play() {
		System.out.println("강아지는 밖에서 놀아요");
	}

}
