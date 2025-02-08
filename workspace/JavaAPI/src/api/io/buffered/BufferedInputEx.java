package api.io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class BufferedInputEx {
	
	public static void main(String[] args) {
		
		//BufferedInputStream - 1바이트 기반으로 데이터를 읽는 성능 향상 스트림이다
	
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\test01.txt";
		
		//InputStream is = new FileInputStream(null);
		
		BufferedInputStream bis = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(path));
			
			int result;
			
			while((result = bis.read()) != -1) {
				System.out.print((char)result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
			} catch (Exception e2) {
				
			}
		}
		
		
		
		
		
		
	}

}
