package day10.inter.basic2;

public class MainClass {
	
	public static void main(String[] args) {
		
		Animal baduk = new Dog();
		Animal shampoo = new Cat();
		Animal hodol = new Tiger();
		Animal[] arr = {baduk, shampoo, hodol};
		
		for(Animal a : arr) {
			a.eat(); //Animal처럼 동작됨
		}
		
		//펫 타입
		IPet[] arr2 = new IPet[3];
		arr2[0] = (IPet)baduk; // 바둑이는 Animal타입이지만, IPet을 구현하고 있어서 상호형변환이 가능하다
		arr2[1] = (IPet)shampoo;
		arr2[2] = new GoldFish();
		
		System.out.println("==========================================");
		
		for(IPet a : arr2) {
			a.play();
		}
		
		System.out.println("==============================================");
		
		PetHouse.carePet((IPet)baduk);
		PetHouse.carePet(arr2[1]);
		PetHouse.carePet(arr2[2]);
		
		
	}

}
