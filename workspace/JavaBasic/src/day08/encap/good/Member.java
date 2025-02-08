package day08.encap.good;

public class Member {
	
	//특별한 기능이 있는게 아니라 단순히 값을 저장하는 용도의 클래스도 있다
	//DTO = Data Transfer Object
	
	private String name;
	private int age;
	private String address;
	private String phone;
	private boolean isApprove;
	
	// 생성자 - 기본 생성자 1, 멤버변수 갯수만큼 값을 전달받는 생성자 1
	// alt + shift + s 또는 source 탭
	// Generate constructor using field
	
	public Member(String name, int age, String address, String phone, boolean isApprove) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.isApprove = isApprove;
	}
	
	
	
	
	public String getName(String name) {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge(int age) {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isApprove() {
		return isApprove;
	}
	public void setApprove(boolean isApprove) {
		this.isApprove = isApprove;
	}

	//각각의 변수에 대한 getter, setter를 만들어야한다
	
	//getter, setter를 빨리 단축키로 만드는 방법
	// alt + shift + s 또는 source 탭
	// generate getters and setters
	
	
	
}
