package ramda.anomymous.basic;

public class Computer {

	private int sound;
	private RemoteControl remote;
	
	public Computer() {
		
		remote new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("컴퓨터를 킵니다");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("컴퓨터를 끕니다");
				
			}
			
			@Override
			public void VolumeUp() {
				sound++;
				System.out.println("컴퓨터볼륨 :" + sound);
				
			}
			
			@Override
			public void VolumeDown() {
				sound--;
				System.out.println("컴퓨터볼륨 :" + sound);
			}
		};
		
	}
	
}
