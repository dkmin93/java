package multiclient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Receive extends Thread { //클라이언트 수신하는 기능을 하는 리시브 객체
	
	private Socket socket;
	
	public Receive(Socket socket) {
		this.socket = socket;
	}
	
	@Override
		public void run() {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			
			while(true) {
				String message = br.readLine();
				System.out.println(message);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		}
	

}
