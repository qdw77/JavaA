package ch06.sec11.exam02;

// 이곳에 import 선언
//ex) import com.hankook.Tire > Tire 클래스의 전체 이름 / 다수일 경우 *
//import com.hankook.Tire
//import com.nexen.Tire
//import com.Kumho.Tire
//Tire < 중복 
//Tire hankook.tire = new Tire();

public class Earth {
	
	/*
	 * p256
	 * 상수 선언
	 * 상수
	 * constant
	 * 불변의 값
	 * 상수는 객체마다 저장할 필요가 없음
	 * 인스턴스 전용 필드가 아니다
	 * final+static의 상질
	 * static final int x =10;
	 *  
	 * 251p 스테틱 블럭 선언
	 * 초기 값 선언 시 static블럭을 이용하며 초기화
	 * 변수의 선언 시 동시에 값 초기화 
	 * 상수명은 전체 식별자명을 대문자로 처리
	 * 
	 * 인스턴스.상수(x)
	 * 클래스명.상수(O)
	 * 
	 * */
	
	//257~258p
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
	
	/*
	 * p258
	 * 패키지
	 * import
	 * 
	 * 파이썬
	 * import
	 * main.py
	 * 
	 * java
	 * import
	 * 다른 패키지에 있을 떄 접근하려면 import
	 * 
	 * ex) import com.hankook.Tire > Tire 클래스의 전체 이름
	 * Tire < 중복 
	 * Tire hankook.tire = new Tire();
	 * import를 여러개 했을 때 동일헌 calss명이 겹치면 인스턴스 만들 때 
	 * hankook.Tire 클래스 위치를 전체 지정해줘야 함
	 * 
	 * 인스턴스 제작 시 패키지 명 정확하게 기재
	 * 
	 * */
	
	/*
	 * 264p
	 * 접근 제한자
	 * 여기서 접근은 외부에서의 접근을 말함
	 * public / protected / default / private
	 * 
	 * 265
	 * 패키지가 다를 경우 반드시 public으로 
	 * 
	 * 266p 
	 * 생성자의 접근 제한
	 * new A < A가 생성자
	 * [public | private] < | or 
	 * 
	 * 267p
	 * 위 표의 2번쨰 비어있는 것은 아무것도 선언하지 않는 경우
	 * 
	 * */
	
	
	
}
