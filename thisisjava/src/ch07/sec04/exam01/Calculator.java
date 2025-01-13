package ch07.sec04.exam01;

public class Calculator {

	/*
	 * 메소드 오버라이딩 p295~
	 * raise가 자바에서는 throws다
	 * @Override
	 * 
	 * */
	public double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle 실행");
		return 3.14159*r*r;
	}
	
	/*
	 * 
	 * 부모 메서드 호출
	 * 부모 메서드의 일부가 변경되어도 자식 메서드는 중복된 내용을 전부 작성
	 * 
	 * super.method(); < 이걸로 해결 가능
	 * 자식 메서드가 재활용 하고 싶으면 부모 메서드와 이름 다르게 생성(덮어쓰기됨)
	 * 
	 * 
	 * */
	
	
	
}
