package ch06.sec07.exam08;


public class Calculator {
	void poxerOn() {
		System.out.println("전원을 킵니다.");
	}
	void poxerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x/(double)y;
		return result;
	}
}
