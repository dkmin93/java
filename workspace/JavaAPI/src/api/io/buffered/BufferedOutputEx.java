package api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class BufferedOutputEx {
	
	public static void main(String[] args) {
		
		//Buffered가 붙은 클래스는 입출력 성능향상을 위한 스트림 클래스입니다
		
		//Buffered + 스트림 타입으로 이름이 결정된다
		
		//BufferedOutputStream 는 outputstream의 성능향상 스트림이다
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\test01.txt";
		
		//OutputStream os = null;
		BufferedOutputStream bos = null;
		
		try {
			
			//OutputStream os = new FileOutputStream(path);
			bos = new BufferedOutputStream( new FileOutputStream(path));
			
			String str = "youjin choi good morning";
			
			bos.write(str.getBytes()); //파일을 씀
			bos.flush(); //버퍼를 밀어낸다(=데이터가 전달 된다)
			//write 후에 버퍼로 꼭 밀어내야 한다
			
			//Thread.sleep(20000); //20초 스탑
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
			} catch (Exception e2) {
				
			}
		}
	
		System.out.println("프로그램 정상 작동");
		//프로그램이 종료되면 버퍼가 자동으로 비워진다
	}
	
	

}
