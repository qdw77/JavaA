package ch06.sec10.exam03;

public class Car {
	int speed;
	void run() {
		System.out.println(speed+"로 달립니다.");
	}
	
	static void simulate() {
		Car myCar = new Car();
		
		myCar.speed=200;
		myCar.run();
	}
	
	public static void main(String[] arg) {
		simulate();
		
		Car myCar = new Car();
		
		myCar.speed =60;
		myCar.run();
	}
	/*
	 * 휠타이어 A제품을 만드는 A공장
	 * 자동차를 만드는 B제품을 만드는 B공장
	 * A제품은 B공자의 제품을 만들기 위한 부품이다
	 * B공장은 A공장에게 일정 수량을 구매하고 개당 50만원 지불
	 * 휠타이어 4개를 사와야 B공장 자동차 1개를 만들 수 있다.
	 * */

}
