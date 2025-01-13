package ch06.sec11.package1;

public class B {
//	A a1= new A(true);
//	A a2 = new A(1);
////	A a3 = new A("문자열"); // private 생성자 접근 불가(컴파일 에러)
	public void method() {
		A a = new A();
		
		a.fidId1 = 1;
		a.fidId2 = 1;
//		a.fidId3 = 1; // private 생성자 접근 불가(컴파일 에러)
		
		a.method1();
		a.method2();
//		a.method3(); // private 생성자 접근 불가(컴파일 에러)
	
	}
	
}
