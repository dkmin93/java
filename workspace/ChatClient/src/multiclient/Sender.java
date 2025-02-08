package multiclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class Sender extends Thread { //메세지를 보내는 기능을 가진 객체

	private Socket socket;

	public Sender(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() { 

		try {
			//사용자에게 입력 받아서 서버로 output 한다
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
			
			//서버로 전송할 output
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				
				String message = br.readLine(); //입력
				
				if(message.equals("exit")) {
					break; // exit 입력시 종료
				}
			
				out.println(message); //소켓에 메세지 전송
				out.flush();
				
			}

			br.close();
			out.close();
			socket.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}






}
