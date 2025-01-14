package ch07.sec10.exam02;

public class AbstractMethodExample {

	public static void main(String[] args) {
		
		/*
		 * p327~p328 실습
		 * 
		 * 추상 클래스
		 * 공통적인 필드나 메소드를 추출해서 선언한 클래스
		 * 
		 * 추상 클래스는 실체 클래스를 만들기 위한 부모로만 사용(카피용)
		 * abstract < 추상 클래스 선언
		 * abstract 추상 클래스는 인스턴스 생성 용도가 아니다.
		 * 추상 클래스의 반대 의미는 실제 클래스
		 * 실제 클래스는 실제 인스턴스를 생성하여 프로그램 내 상호작용을 실질적으로 하는 클래스
		 * 추상 클래스는 실제 클래스의 상속용도로 사용
		 *
		 *p329 ~ 추상 메소드와 재정의
		 * 추상 메서드 선언
		 * abstract void sound(매개변수); // 하나의 필드로서 형태만 미리 정의함 추상 클래스 내부에
		 * 
		 * 추상메서드 선언하는 이유
		 * 
		 * 실제 클래스에서 오버라이딩
		 * 
		 * 추상 메소드와 재정의 실습 p330~331
		 * */
		
		System.out.println("오버라이딩 불러온 것");
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat(); 
		cat.sound();
		
		System.out.println();
		
		System.out.println("재정의 된 메소드 호출로 불러온 것");
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
}
