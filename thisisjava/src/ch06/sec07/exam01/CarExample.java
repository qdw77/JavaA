package ch06.sec07.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("그랜저","검정",250);
		//Car myCar = new Car(); //기본 생성자 호출 불가 / 이미 커스텀을 해놔서 못함
		/*
		 * 생성자의 오버로딩 / 
		 * 오버 라이딩> A클래스를 B라는 클래스가 상속 ,A라가 Z만듦 B도 사용 가능하고 새롭게 만들 수도 있음
		 * 오버라이딩: 상속받은 클래스(자식)가 상속해준 클래스 내부(부모)에 선언된 특정 함수를 같은 이름으로 새롭게 정의하는 행위
		 * 오버로딩: 상속과 무관하게 특정 클래스 내부에 같은 이름 함수를 여러개 만드는 것
		 * Car() 기본 생성자
		 * Car(String model)
		 * Car (model,color)
		 * Car (model,color,maxSpeed...)
		 * 
		 * 매개변수 아름만 바꾸면 오류
		 * self 
		 * 
		 * */

	}

}
