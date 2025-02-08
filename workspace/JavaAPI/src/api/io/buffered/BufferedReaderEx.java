package api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {
	
	public static void main(String[] args) {
		
		//2바이트 기반의 성능향상 보조스트림
		
		//readLine() - 데이터를 읽을 때 한줄씩 통째로 읽어들인다.
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\test02.txt";
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(path));
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
			// System.out.println(br.readLine()); //더이상 읽을 내용이 없으면 null을 출력
			
			
			
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
