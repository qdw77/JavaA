package ch06.sec08.examTest;

public class Btest {
	
	Atest A = new Atest();
//	static int WheelA; // 지금 있는 휠 재고 
	static int Bmoney; // 자금
	static int BWheel; // B 공장 현재 휠 재고
	static int BCar; // B 공장 차량 재고
	String Bpoint="서구"; // 공장 위치
	static int CarMaking; // 휠 구매
//	static int BWeelBuy; // 
	static int BCarMoney;
	static int BCarBuy;
	static int BCarAll; // 
	
	
	static void BMaking() {
		Btest Bm = new Btest();
		Atest Am = new Atest();
		if (BWheel>=4) {
			// 차량 제작 
			// 휠 재고 확인 후 
			// 
			
		}else {
			System.out.println("휠 재고 부족");
		}
	}
	
	static void Bbuy() {
		Btest BC = new Btest();
		Atest AB = new Atest();
		// 휠 구매 
		Bmoney += CarMaking * 500000;
		// 구매 가능 여부 판단 및 구매 진행
		if (AB.AallNum>=Bmoney) { // 자금 확인
			BWheel += CarMaking; // 휠 재고 
			Bmoney -= AB.AallNum; // 구매 후 잔고
		}else {
			System.out.println("자금 부족");
		}
	}
	
	// 자동차 판매 매소드
	//판매 메서드 : FactoryB 자동차 재고 줄이기, FactoryB 자금 올리기,
	// 클래스명 : salesCar
	static void salesCar() {
		if (BCar>BCarBuy) {
			Btest.BCar -= BCarBuy; // 자동차 재고 줄이기 자동차 재고(BCar)-사려고 하는 차 갯수(BCarBuy)
			Btest.Bmoney += BCarMoney*BCarBuy; // 자금(Bmoney) + 자동차 가격(BCarMoney)
			System.out.println("차량 구매 완료");
			System.out.println("총 가격은 "+ BCarMoney*BCarBuy);
		}else {
			System.out.println("차량의 재고가 모자랍니다.");
		}
	}

}
