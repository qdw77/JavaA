package ch06.sec11.package2;

import ch06.sec11.package1.*;

public class C {
	
//	A a1 = new A(true);
//	//	A a2 = new A(1); // default 생성자 접근 불가(컴파일 에러)
//	//	A a3 = new A("묹자열"); // private 생성자 접근 불가(컴파일 에러)
	
	/*
	 * 필드와 메소드 접근 제한
	 * */
	public C() {
		A a = new A();
		
		a.fidId1 = 1;
//		a.fidId2 = 1; // default 생성자 접근 불가(컴파일 에러)
//		a.fidId3 = 1; // private 생성자 접근 불가(컴파일 에러)
		
		a.method1();
//		a.method2(); // default 생성자 접근 불가(컴파일 에러)
//		a.method3(); // private 생성자 접근 불가(컴파일 에러)
		
		/*
		 * Getter / Setter
		 * 271p
		 * 필드 접근은 Getter & Setter로 한다
		 * 
		 * get은 public으로 다른 곳에서 받아줘야 하니까 
		 * */
	}

}
