package ch07.sec07.exam03;

public class Parent {
	
	/*
	 * 부모 클래스의 생성자가 매개변수가 있다면 > 자식 생성자 내부에 super(매개변수1,매개변수2) 작성
	 * 부모 클래스 생성자가 매개변수가 없다면 > 자식생성자 내부에 super() 생략가능
	 * super 키워드를 통한 부모 클래스 필드 접근 가능 > super.필드명
	 * 부모클래스의 필드가 private 으로 선언되어 있으면 자식 클래스에서 접근불가
	 * 자식 클래스에서 부모 클래스로 접근하려면 부모클래스에 해당 필드가 public(자식이 아니여도 됌) 이나 protected(자식한테만 공개) 여야함
	 * super()는 자식 클래스에서 부모 생성자 호출 방식
	 * super.메서드명 형태로 부모클래스 내 메서드 호출 가능
	 * 
	 * 강제 타입 변환
	 * 자식타입 변수 = (자식 타입)부모타입인스턴스; // 강제 형 변환
	 * 부모타입 변수 = 자식인스턴스 // 자동 형 변환
	 * 
	 * 부모를 상속받은 자식 인스턴스가 부모타입으로 자동변환되면 선언된 필드와 메서드만 사용가능
	 * 자식 타입에 선언된 필드와 메소드를 꼭 사용해야한다면 강제 타입 변환
	 * */
	
	
	public String field1;
	
	public void method1() {
	
		System.out.println("Parent-method1()");
	
	}
	
	public void method2() {
		
		System.out.println("Parent-method2()");
	
	}

}
