package day08.encap.obj;

public class Hotel {
	
	 private Chef chef; //멤버변수에 클래스타입, 배열도 올 수 있다
	 private Employee emp; 
	 
	 
	 //호텔이 생성될 때, chef를 같이 생성한다.
	 public Hotel() {
		 this.chef = new Chef();
		 this.emp = new Employee();
	 }

	 //chef변수의 getter setter
	 //setter - 매개변수로 객체를 받는타입
	 public void setChef(Chef chef) { //Chef타입, chef매개변수, 매개변수로 chef객체를 받는다
		 this.chef = chef;
	 }
	 //getter - 객체를 반환으로 돌려주는 형태
	 public Chef getChef() { //객체 Chef 타입으로 반환하겠다. 
		 return chef; //변수 chef를 반환하겠다
	 }
	 
	 public void setEmp(Employee emp) {
		 this.emp = emp;
	 }
	 
	 public Employee getEmp() {
		 return emp;
	 }
}
