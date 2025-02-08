package quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FileQuiz03 {

	public static void main(String[] args) {


		// youjin choi가 입사한 회사에서는 매일 오전 7시에 연계사에서 날짜유형의 csv파일을 전송을 해줍니다.
		// 2025_01_24_data.csv 유형의 파일입니다
		// 그래서 youjin choi는 *매일 아침*마다 csv파일을 읽어서 데이터베이스에 저장하는 프로그램 코드를 만들어야 합니다.
		// 데이터베이스에 저장하려면, List<Data>클래스로 값을 저장해야 합니다.
		// Data클래스는 getter, setter를 가지는 은닉 클래스입니다.
		
		// 데이터 클래스의 리스트 선언
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_");
		String formatedNow = today.format(formatter);
		
		List<String> list = new List
		
		// buffered를 사용해서 날짜_data.csv파일을 읽어서 한줄 한줄씩 출력해주세요.
		String readpath = "C:\\Users\\user\\Desktop\\course\\java\\workspace\\JavaQuiz\\src\\quiz21\\" + formatedNow + "data.csv";
		String savepath = "C:\\Users\\user\\Desktop\\course\\java\\workspace\\JavaQuiz\\src\\quiz21\\Data.java";
		
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new FileReader(readpath));
			bw = new BufferedWriter(new FileWriter(savepath));
			
			br.readLine(); //첫행은 넘어가기
			
			String str;
			
			while((str = br.readLine()) != null) {
				System.out.println(str);
				String[] arr = str.split(",");
				Data data = new Data(arr[0], arr[1], arr[2], arr[3]);
				list.add(data); //while문 밖에서 리스트 선언
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				
			}
		}

		// 읽은 데이터를 ,기준으로 분리해서 데이터를 리스트에 잘 정리해서 저장해 주세요.
		// 첫째줄을 Line()으로 먹어서 없애버리기 
		//split으로 읽은 데이터 쪼개고 각각을 리스트로 만들어서 반복문으로 저장
	
	
	
	
	
	
	
	}

}
