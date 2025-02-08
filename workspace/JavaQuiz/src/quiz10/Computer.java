package quiz10;

public class Computer {
	
	//1. 키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요, 정보이므로 프라이빗 처리. 멤버변수 선언
	private KeyBoard key; //키보드클래스 변수명; 일단은 아무값도 없다
	private Mouse mouse; //마우스클래스 변수명;
	private Monitor monitor; //모니터클래스 변수명;
	
	//2.기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	public Computer() { //기본생성자 생성
		this.key = new KeyBoard(); //변수들을 클래스로 초기화
		this.mouse = new Mouse();
		this.monitor = new Monitor();
	}
	
	//3.KeyBoard, Mouse, Monitor를 전달받는 생성자를 생성하세요.
	public Computer(KeyBoard key, Mouse mouse, Monitor monitor) {
		this.key = key;
		this.mouse = mouse;
		this.monitor = monitor;
	}

	//4.키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	public void computerInfo() {
		key.info();
		mouse.info();
		monitor.info();
	}

	//5.키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요
	public KeyBoard getKeyboard() {
		return key;
	}

	public void setKeyboard(KeyBoard key) {
		this.key = key;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	//6.메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	
	
	
}
