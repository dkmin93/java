package api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx {
	
	public static void main(String[] args) {
		
		//2바이트 기반에 성능향상 보조 스트림 BufferWriter
		
		Scanner scan = new Scanner(System.in);
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\test02.txt";
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(path, true));
			//path뒤에 추가로 true를 주면 기존 파일이 있을 경우 내용을 이어서 작성한다
			//true가 없으면 매번 비우고 새로운 내용을 입력하게 된다.
			
			while(true) {
				System.out.print(">");
				String str = scan.nextLine();
				
				if(str.equals("exit")) {
					break;
				}
				
				str += "\r\n"; //줄바꿈
				bw.write(str);
				bw.flush(); //반복문 안에다 쓰면 쓸때마다 보내고 밖에다 쓸 경우 다 쓰고 한번에 보낸다
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (Exception e2) {
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
