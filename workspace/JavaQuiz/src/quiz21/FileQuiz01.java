package quiz21;

import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class FileQuiz01 {
	
	public static void main(String[] args) {
		
		
		
		Writer fw = null; 
		
		//1.스캐너를 이용해서 파일명을 입력 받습니다
		Scanner scan = new Scanner(System.in);
		
		System.out.println("파일명을 입력해주세요>");
		String title = scan.next();
		
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\" + title + ".txt";
		
		//2.file 폴더 하위에 입력받은 파일명으로 파일을 씁니다
		
		try {
			fw = new FileWriter(path);
			System.out.println("내용을 입력해주세요>");
			String content = scan.nextLine(); //엔터값의 여부를 제거
			fw.write(content);
			
			System.out.println("파일 출력 완료!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				
			}
		}
		
		
		
		//3. 파일을 쓸때, "쓰고 싶은 말"을 사용자에게 입력 받습니다.
		
		
	}

}
