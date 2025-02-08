package day10.abstract_.good;

public class BusanStore extends Store {

	@Override
	public void melon() {
		System.out.println("부산지점의 멜론가격은 100원 입니다");
	}

	@Override
	public void orange() {
		System.out.println("부산지점의 오렌지가격은 200원 입니다");
	}

	@Override
	public void grape() {
		System.out.println("부산지점의 포도가격은 300원 입니다");
	}

	@Override
	public void apple() {
		System.out.println("부산지점의 사과가격은 400원 입니다");
	}
	
}
