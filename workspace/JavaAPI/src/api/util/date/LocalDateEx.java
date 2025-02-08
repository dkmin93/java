package api.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateEx {
	
	public static void main(String[] args) {
		
		/*
		 * LocalDate클래스 - 년 월 일 정보
		 * LocalTime클래스 - 시 분 초 정보
		 * LocalDateTime클래스 - 년 월 일 시 분 초
		 */
		
		LocalDate now= LocalDate.now();
		System.out.println(now);
		
		LocalDate ofDate = LocalDate.of(2022, 2, 12); //년 월 일 지정 가능
		System.out.println(ofDate);
		
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		
		//로컬 데이터 타입을 문자형으로 포멧
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		String result2 = time.format(dtf);
		System.out.println(result2);
	}

}
