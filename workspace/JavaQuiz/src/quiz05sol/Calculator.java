package quiz05sol;

public class Calculator {
	
	int result;
	double pi = 3.14;
	
	int add(int a) {
		result += a;
		return result;
	}
	
	int sub(int a) {
		result -= a;
		return result;
		
	}
	
	double circle(int a) {
		return a * a * pi;
	}

}
