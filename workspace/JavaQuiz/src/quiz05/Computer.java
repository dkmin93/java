package quiz05;

public class Computer extends Calculator {

	double circle(int r) {
		double result;
		double pi = Math.PI;
		System.out.println("입력한 값을 반지름으로 하는 원의 넓이를 구합니다");
		result = (pi * r * r);
		return result;
	}
	
	double rect(double a) {
		double result;
		System.out.println("입력한 값을 한 변의 길이로 하는 정사각형의 넓이를 구합니다");
		result = (a * a);
		return result;
	}
	
	double rect(double a, double b) {
		double result;
		System.out.println("입력한 값을 가로, 세로 길이로 하는 직사각형의 넓이를 구합니다");
		result = (a * b);
		return result;
	}
	
	double rect(double a, double b, double c) {
		double result;
		System.out.println("입력한 값을 가로, 세로, 높이의 길이로 하는 직육면체의 부피를 구합니다");
		result = (a * b * c);
		return result;
	}
	
}
