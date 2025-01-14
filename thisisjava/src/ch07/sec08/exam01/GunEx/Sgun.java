package ch07.sec08.exam01.GunEx;

public class Sgun {
	
	// Car 필드를 선언하고 메소드로 필드에 대입된 객체 roll()메소드 호출
	/*
	 * 클래스의 종류
	 * 1. 총기 Car
	 * 2. 격잘함수 run 
	 * 3. 기본총알(은색) Tire - 은색총알이 날아간다 - 오버라이딩 roll
	 * 4. 빨간총알 - 빨간 총알이 날아간다 - 오버라이딩 roll Redgun
	 * 5. 파란총알 - 파란 총알이 날아간다 - 오버라이딩 roll Bluegun
	 * */
	//부모 클래스
	public void bullet() {
		System.out.println("은색 총알이 날아간다.");
	}
	
}
