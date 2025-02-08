package multiclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainClient { //클라이언트
	
	public static void main(String[] args) {
		
		//채팅은 클라이언트와 서버간의 대화(연결)이다
		//서버(컴퓨터)는 클라이언트의 채팅글을 전달하고 여러 클라이언트를 서로 연결할 수 있게 한다
		
		// 우변의 소괄호 안에는 (연결할아이피주소, 포트번호) 를 입력한다
		// 포트번호는 프로그램의 식별번호를 말한다
		try  {
			Socket clientSocket = new Socket("172.30.1.72", 8181);
		
			//메세지를 받는 클래스
			Receive receive = new Receive(clientSocket);
			//데이터를 보내는 클래스
			Sender sender = new Sender(clientSocket);
			
			receive.start(); //스레드 스타트
			sender.start(); //스레드 스타트
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
			System.out.println("호스트 주소 잘못됨");
		
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("스트림 에러");
		}
		
		
		
	}

}
