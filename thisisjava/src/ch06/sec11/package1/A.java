package ch06.sec11.package1;

import java.lang.reflect.Method;

public class A {
	//267p
//	A a1 = new A(true);
//	A a2 = new A(1);
//	A a3 = new A("문자열");
//	
//	public A(boolean b) {
//		System.out.println("A public");
//	}
//	
//	A(int b){
//		System.out.println("A default");
//	}
//	
//	private A(String s) {
//		System.out.println("A private");
//	}
	//270p
	public int fidId1;
	int fidId2;
	private int fidId3;
	
	public A() {
		fidId1 = 1;
		fidId2 = 1;
		fidId3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	public void method1() {
		
	}
	
	void method2() {
		
	}
	
	private void method3() {
		
	}
	
}
