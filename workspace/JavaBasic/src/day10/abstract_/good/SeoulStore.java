package day10.abstract_.good;

public class SeoulStore extends Store{

	@Override
	public void melon() {
		System.out.println("서울지점의 멜론가격은 500원 입니다");
	}

	@Override
	public void orange() {
		System.out.println("서울지점의 오렌지가격은 600원 입니다");
	}

	@Override
	public void grape() {
		System.out.println("서울지점의 포도가격은 700원 입니다");
	}

	@Override
	public void apple() {
		System.out.println("서울지점의 사과가격은 800원 입니다");
	}

	
	
}
