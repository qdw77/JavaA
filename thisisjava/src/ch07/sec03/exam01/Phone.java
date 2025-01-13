package ch07.sec03.exam01;

public class Phone {
	/*
	 *부모 생성자를 자식이 부르는 법
	 *부모 생성자 호출 p290
	 *상속
	 *super < 부모클래스 생성자
	 * */
	
	public String model;
	public String color;
	
	public Phone() {
		System.out.println("Phone() 생성자 실행");
	}

	// 부모 클래스가 매개변수를 갖는 생성자 선언
	public Phone(String model,String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone(String model,String color) 생성자 실행");
	}
	
}
