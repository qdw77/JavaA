package ch06.sec08.examTest;

public class Atest {
	
	static int WheelSize; // 휠 사이즈 
	String Apoint = "신탄진"; // 공장 위치
	static int Amoney; // 자금 // 각 공장의 자금 필드(클래스변수)
	static int Wheel; // 현재 재고
	static int AallNum; // 총 가격
	static int AwheelNum = 500000; // A공장 가격
	// CarMaking < B공장 휠 구매량
	static int AWheelM=200000;// A 휠 타이어 제작 비용

	static void Aproduce(int WheelSize) {
		// 객체 생성
		Atest Amaking = new Atest();
		Btest B = new Btest();
		Amaking.Amoney += Amaking.AallNum;
		if (Amoney>AWheelM) {
			Amaking.Wheel += B.CarMaking; // 재고 제작	
		}
		
	}
	
	static void Acount() { // WheelSize 휠사이즈 // CarMaking < B공장의 구매하고자 하는 휠 개수
		
		// 객체 생성
		Atest Anum = new Atest();
		Btest B = new Btest();
		
		if (Anum.Wheel > 0) {
			// 휠타이어 가격 계산
			Anum.AallNum = AwheelNum * B.CarMaking; // 가격 계산
			// 판매 후 자금
			Anum.Amoney += Anum.AallNum;
		} else {
			System.out.println("판매불가");
		}
		Anum.Wheel -= B.CarMaking; // 판매 후 재고
	}

}
