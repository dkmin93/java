package day10.inter.basic3;

public class Samsung implements Printed {
	
private String samsung = "재드래곤";
	
	public void print(String document) {
		System.out.println("from 삼성");
		System.out.println(document + "출력됨.");
	}

	public int copy(int n) {
		System.out.println("from 삼성");
		for(int i = 1; i <= n; i++) {
			System.out.println(i + "장 복사");
		}
		
		return n;
	}

}
