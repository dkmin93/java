package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		//SimpleDateFormat - 날짜형을 문자형으로 포멧
		
		//HH면 24시간 형식, hh면 12시간 형식, a를 넣으면 오전 오후도 표시해줌
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		
		String result = sdf.format(date); //sdf타입을 String타입으로 변환
		System.out.println(result);
	}

}
