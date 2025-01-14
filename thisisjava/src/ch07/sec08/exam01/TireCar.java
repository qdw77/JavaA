package ch07.sec08.exam01;

public class TireCar {
	
	// 317~318 p 다양성 실습
	
	public void roll() {
		System.out.println("회전합니다.");
	}
			
	public void HanRoll() {
		
		System.out.println("한국 타이어가 회전합니다");
	}
	
	public void KumRoll() {
		System.out.println("금호 타이어가 회전합니다.");
	}
	
	public TireCar tircar;
	public void run() {
		tircar.roll();
		tircar.HanRoll();
		tircar.KumRoll();
	}

	public static void main(String[] args) {
		
		TireCar t = new TireCar();
		
		

	}
	
	/*
	 * 메서드가 클래스 타입을 가지고 있을 떄 class의 자식개체를 넣을 수 있음/ 자동 형변환
	 * 
	 * 319p
	 * 매개변수 다형성
	 * 
	 * 클래스의 종류
	 * 1. 총기 Car
	 * 2. 격잘함수 run
	 * 3. 기본총알(은색) Tire - 은색총알이 날아간다 - 오버라이딩 roll
	 * 4. 빨간총알 - 빨간 총알이 날아간다 - 오버라이딩 roll
	 * 5. 파란총알 - 파란 총알이 날아간다 - 오버라이딩 roll
	 * */

}
