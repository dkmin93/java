package quiz20;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetQuiz01 { // 로또 번호 자동 생성기
	
	public static void main(String[] args) {
		
		//set을 사용해서 6개의 랜덤한 로또 번호 출력 1~45
		Set<Integer> lotto = new TreeSet<>();
		
		Random ran = new Random();
		
		while(lotto.size() !=6) {
			
		}
		
	
		System.out.println(lotto.toString());
		

		

		
	}

}
