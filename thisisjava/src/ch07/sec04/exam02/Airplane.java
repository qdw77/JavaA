package ch07.sec04.exam02;

public class Airplane {
	/*
	 * 297p
	 * 부모 메서드 호출
	 * 부모 메서드의 일부가 변경되어도 자식 메서드는 중복된 내용을 전부 작성
	 * 
	 * super.method(); < 이걸로 해결 가능
	 * 자식 메서드가 재활용 하고 싶으면 부모 메서드와 이름 다르게 생성(덮어쓰기됨)
	 * 
	 * 다중 상속 불가
	 * 여러개 클래스를 상속 받는 것 : 다중 상속
	 * 
	 * 부모 클래스의 생성자가 매개변수가 있다면 > 자식 생성자 내부에 super(매개변수1,매개변수2) 작성
	 * 부모 클래스 생성자가 매개변수가 없다면 > 자식생성자 내부에 super() 생략가능
	 * super 키워드를 통한 부모 클래스 필드 접근 가능 > super.필드명
	 * 부모클래스의 필드가 private 으로 선언되어 있으면 자식 클래스에서 접근불가
	 * 자식 클래스에서 부모 클래스로 접근하려면 부모클래스에 해당 필드가 public 이나 protected 여야함
	 * super()는 자식 클래스에서 부모 생성자 호출 방식
	 * super.메서드명 형태로 부모클래스 내 메서드 호출 가능
	 * 
	 * */
	
	public void land() {
		System.out.println("착륙합니다.");
	}
	
	public void fly() {
		System.out.println("일반 비행합니다.");
	}
	
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
}
