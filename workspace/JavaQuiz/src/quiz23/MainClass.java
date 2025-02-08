package quiz23;

public class MainClass {
	
	public static void main(String[] args) {
		
		// 음악 재생 객체 1개 생성 음악은 15초간 재생 단순히 메세지 출력
		
		// 동영상 다운로드 객체 1개 생성 다운은 10초간 1초마다 *로 슬립걸기
		
		// 각각 재생과 다운로드가 끝나면 완료 메세지 출력
		
		MusicListen ml = new MusicListen();
		VideoDownload vd = new VideoDownload();
		
		Thread thread01 = new Thread(ml);
		Thread thread02 = new Thread(vd);
		
		thread01.start();
		thread02.start();
		
		
	}

}
