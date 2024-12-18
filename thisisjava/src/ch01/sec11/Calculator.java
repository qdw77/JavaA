package ch01.sec11;

public class Calculator {

	public static void main(String[] args) {
		//변수 타입, 식별자(렘 주소), 연산자
		int x =1; //init
		int y =2;
		int result = x+y;
		System.out.println("x + y = "+result);
		// ram/rom/
		
		int z; //변수 선언만
		int u = 100; //메모리 할당
		
		// 자바에서는 변수 선언시 데이터 타입을 지정해야함
		// 정수/실수/논리
		// 1. 정수 타입은 총 5가지
		// V 점차 용량이 커짐
		// byte 
		// shot
		// char (유니코드 )
		// int < 가장 기본
		// long
		// 데이터 타입에 따라 값의 표현 범위가 달라짐
		// 1바이트=8bit
		// 테라바이트까지가 기본
		
		// 1바이트 표현 범위 -128~127 (총 256개의 수)
		// 유니코드
		// -2ⁿ~(2ⁿ-1) 
		// -1 이 붙어있는 이유는 0도 양수
		 
		// n | n-1 | n-2 | n-3 | n-4 | n-5 | ＊ ＊ ＊ | 3 | 2 | 1 |
		// 부호 bit >양수0,음수1 
		// > |                       2 진수                       |
		
		// 파이썬에서 문자/문자열 구분 x
		// 문자 값은 유니코드로 변환되어 저장
		
		// 부동소수점 > 단점 > 오차 발생
		
		// double xx = 5e2;
		// System.out.println(xx);
		
		// 논리 타입
		
		
		// String 문자열 타입
		// char
		String var1="dddd";
		System.out.println(var1);
		
		
		// 이스케이프 코드 
		// """ """
		
		
		// 자동 변환 타입
		byte byteValue=10;
		int intValue = byteValue; // 자동 타입 변환
		System.out.println(intValue);
		
		//정수타입이 실수타입으로 대입되는 경우 무조껀 변환된다.
		char charValue='A';
		int intV=charValue; //65
		System.out.println(intV);
		
		
		// 강제 변환 타입
		// 큰 허용 타입을 작은 허용 타입으로 강제로 쪼개서 저장
		// 만약 int에 10을 넣을 때 1byte(-128~127)만 있으면 저장할 수 있지만 2byte이상이라면 망가진다.
		
		// 실수 연산
		// double 
		
		
		
	}

}
