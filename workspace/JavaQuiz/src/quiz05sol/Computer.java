package quiz05sol;

public class Computer extends Calculator {

	
	double pi = Math.PI; 
	//오버라이딩
	double circle(int a) {
		return a * a * pi;
	}
	
	//오버로딩
	double rect(double a) {
		return a * a;
	}
	
	double rect(double a, double b) {
		return a * b;
	}
	
	double rect(double a, double b, double c) {
		return a * b * c;
	}
	
}
