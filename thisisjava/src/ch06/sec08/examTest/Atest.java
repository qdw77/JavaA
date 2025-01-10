package ch06.sec08.examTest;

public class Atest {
	/*
	 * 휠타이어 A제품을 만드는 A공장 자동차를 만드는 B제품을 만드는 B공장 A제품은 B공자의 제품을 만들기 위한 부품이다 B공장은 A공장에게
	 * 일정 수량을 구매하고 개당 50만원 지불 휠타이어 4개를 사와야 B공장 자동차 1개를 만들 수 있다.
	 *
	 * A 휠타이어를 받고 A제품 결제 제품으로 B 자동차 조립
	 * A공장에서 휠타이어 완제품 품질겁사 기능() 휠타이어의 종류(일반/고급)(A공장 인스턴스 필드)
	 * 
	 * A > B로 휠타이어 x개를 옮기는 배송함수 휠 사이즈 (필드) 
	 * 휠타이어 없는 자동차 만들기 기능 (B인스턴스) 
	 * 자동차 만들기 휠타이어 장착 메소드 (A인스턴스 4개가 B인스턴스 1개에 포함된다) 
	 * 자동차 판매 기능(B공장 클래스메서드) 
	 * 휠타이어 구매 기능(B공장 클래스 메서드)
	 * 각 공장의 자금 필드(클래스변수) 
	 * B공장에서 휠타이어 4배수 단위 구분(B인스턴스 메서드에서 호출해야할 듯) 
	 * B공장의 휠타이어 장착전 재고와 장착 후 재고 수량 파악(B클래스 변수) 
	 * B공장에 휠타이어 재료가 있어야 가동된다(B클래스 메서드) 휠타이어 만들기 기능 (A인스턴스) 
	 * 만들기 휠타이어 가격 계산기능 (A공장 클래스 메서드) 
	 * 휠타이어 구매 수량 필드 (A,B 둘 다 클래스메서드를 통한 필드) 
	 * 공장 위치 필드(A,B각각 클래스 변수) 
	 */

	// A제품 > A공장 / B공장 B제품 / 총
	// 자금 필드(클래스변수)
	// 공장위치
	// 휠 사이즈 > 고정값 필드 final(최종적)?
	static int WheelSize; 
	String Apoint = "신탄진"; // 공장 위치
	static int Amoney; // 자금 // 각 공장의 자금 필드(클래스변수)
	static int Wheel; // 현재 재고
	static int WeelMaking;
	
	// A공장 가격 클래스 메서드
	static int AwheelNum = 500000;

	static void Aproduce(int WheelSize,int WheelMaking) {
		// 객체 생성
		Atest Amaking = new Atest();
		
		// WheelMaking 만들 수량
		int WheelAll = Wheel + WheelMaking; // 재고 제작
	}
	

	// 클래스 메서드 ,안에 들어가야하는 것 구매 수량,장착메서드?,가격계산,구매 수량,자금
	static void Acount(int Wheelnum,int WheelAll) { // WheelSize 휠사이즈 // Wheelnum 구매 수량
		
		// 객체 생성
		Atest Anum = new Atest();
		Btest B = new Btest();
		// WheelAll < 값 가지고 와서 계산 
		
		// B 클래스 불러와서 구매하는 메서드
		// +Wheelnum 구매 수량
		if (Wheel > 0) {
			// 휠타이어 가격 계산기능 (A공장 클래스 메서드
			int AallNum = AwheelNum * Wheelnum; // 가격 계산
			// 판매 후 자금
			int Amoneyafter = Amoney + AallNum;
		} else {
			System.out.println("판매불가");
		}
		int Wheel = WheelAll - Wheelnum; // 재고 빼기 > 현재 재고

	}

}
