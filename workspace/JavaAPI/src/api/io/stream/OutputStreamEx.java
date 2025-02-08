package api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamEx {
	
	public static void main(String[] args) {
		
		//io패키지의 모든 클래스는 생성자가 throws 키워드를 던지고 있어서
		//모두 try~catch 블록과 함께 사용합니다.
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\hello.txt";
		
		FileOutputStream fos = null; //fos는 부모클래스로 OutputStream가 있기에 OutputStream에도 담을 수 있다.
		
		try {
			fos = new FileOutputStream(path);
			
			String str = "길동아! 잠깨!";
			fos.write(str.getBytes());
			
			fos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	
		
		
	}

}
