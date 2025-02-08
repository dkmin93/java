package quiz02;

public class Tv {
	
	String brand;
	int channel;
	boolean power; // 기본 값이 false 로 시작
	
	Tv() {
		brand = "LG";
	}
	
	void info() {
		System.out.println("===TV 정보===");
		System.out.println("회사명:" + brand);
		System.out.println("채널번호:" + channel);
		System.out.println("전원상태:" + power);
	}

	int changeChannel(int ch) {
		channel = ch;
		System.out.println("현재 채널번호:" + channel);
		return channel;
	}
	
	void power() {
		power = !power; // 기본시작값이 false이므로 true로 바꿔준 것
		if(power) {
			System.out.println("전원이 켜졌습니다");
		} else {
			System.out.println("전원이 꺼졌습니다");
		}
	}
}
