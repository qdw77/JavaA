package ch07.sec10.exam01;

public abstract class Phone {
	
	/*
	 * 추상 클래스
	 * 공통적인 필드나 메소드를 추출해서 선언한 클래스
	 * 
	 * 추상 클래스는 실체 클래스를 만들기 위한 부모로만 사용(카피용)
	 * abstract < 추상 클래스 선언
	 * abstract 추상 클래스는 인스턴스 생성 용도가 아니다.
	 * 추상 클래스의 반대 의미는 실제 클래스
	 * 실제 클래스는 실제 인스턴스를 생성하여 프로그램 내 상호작용을 실질적으로 하는 클래스
	 * 추상 클래스는 실제 클래스의 상속용도로 사용
	 * */
	
	/*
	 * 추상 메서드 선언
	 * abstract void sound(매개변수);
	 * 
	 * */
	
	String owner;
	
	
	Phone(String owner) {
		this.owner = owner;
	}
	
	
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
