package ch06.sec15;

public class Singleton {

	/*
	 * 싱글톤 패턴
	 * 캡슐화 / 추상화
	 * 하나에 대한 것만 다루는 것
	 * 
	 * 보스에서 인스턴스 
	 * 하나만 만들어야 한다고 지정 < 싱글톤 패턴
	 * 
	 * DBCP
	 * 동시성
	 * 병렬성
	 * 멀티슬레그
	 * 공용인스턴스 (동시성 문제 주의)
	 * 코어/스래드
	 * 
	 * 정적 메소드
	 * 
	 * 클래스 int 클래스 
	 * 인스턴스 하나
	 * 참고하는 변수는 여러개 가능
	 * */
	
	private static Singleton singleton=new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
