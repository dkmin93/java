package quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class FileQuiz02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//1.날짜클래스를 이용해서 file 경로에 20250124.txt 이름으로 파일을 만들기
		LocalDate today = LocalDate.now();
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\"+ today +".txt";
	
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(path, true));
			
			//2.내용은 "그만" 을 입력할 때 까지 작성하기
			while(true) {
				System.out.print(">>>");
				String str = scan.nextLine();
				
				if(str.equals("그만")) {
					break;
				}
				
				str += "\r\n";
				bw.write(str);
				bw.flush(); //버퍼를 비운다
				
			}
			
			System.out.println("파일 입력이 완료되었습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (Exception e2) {
				
			}
		}
		
		//3.파일을 다 썼다면 버퍼드리더를 이용해서 파일의 내용을 읽어들이기.
		BufferedReader br = null; //리더랑 라이터를 같은 try catch구문안에 넣어도 가능
		String str;
		
		try {
			br = new BufferedReader(new FileReader(path));
			
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}	
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				
			}
		}
		
		
				
	}

}
