package quiz10;

public class MainClass {

	public static void main(String[] args) {

		//Computer com = new Computer(); 아래 방법과 동일
		
		Computer com = new Computer(new KeyBoard(), new Mouse(), new Monitor());

		KeyBoard key = com.getKeyboard();
		key.info();
		Mouse mouse = com.getMouse();
		mouse.info();
		Monitor monitor = com.getMonitor();
		monitor.info();
		
	}

}
