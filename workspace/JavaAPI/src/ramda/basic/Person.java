package ramda.basic;

public class Person {
	
	public void greeting(Say01 say) {
		say.talking();
	}
	
	public void greeting(Say02 say) {
		say.talking("Person이 전달한 인사말 hi");
	}

	public void greeting(Say03 say) {
		String result = say.talking("hello", 10);
		System.out.println(result);
	}
	
}
