package ch06.sec08.exam02;

// 실행 클래스
public class ComputerExample { 
	public static void main(String[] args) {
		// static < 클래스 함수로 아무나 공용 호출 가능
		// 정적 <-> 동적 / 정적 할당과 동적 할당
		// 정적 할당 < 일단 메모리 자리 차지
		// 동적 할당 < 호출,인스턴스 등 객체 때마다 메모리
		// static <-> 인스턴스에서
		Computer myCom = new Computer();
		
		int result1 = myCom.sum(1,2,3);
		System.out.println("result1: "+result1);
		
		int result2 = myCom.sum(1,2,3,4,5);
		System.out.println("result2: "+result2);
		
		int[] values = {1,2,3,4,5};
		int result3 = myCom.sum(values);
		System.out.println("result3: "+result3);
		
		int result4 = myCom.sum(new int[] {1,2,3,4,5});
		System.out.println("result4: "+result4);
		// 인스턴스 메소드
		// 클래스
		// 
		/*메소드 오버로딩
		 * 
		 * 인스턴스 멤버
		 * 멤버란?
		 * 필드,메소드 등을 멤버
		 * 정적 멤버 > static / 클레스 메소드 , 클레스 멤버
		 * 인스턴스 멤버
		 * 객체 소속 멤버
		 * setSpeed() > 객체에 포함되지 않는다.
		 * 안에 있는 정의는 1개/객체는 따로 분리해서 관리,메소드는 하나로 관리
		 * this 
		 * 
		 * 정적 멤버
		 * public class Calculator 
		 * static < 클래스 변수 
		 * 
		 * */
	}

	

}


