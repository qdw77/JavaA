package ch06.sec10.exam02;

public class ClassName {
	
	/*
	  인스턴스 멤버 사용 불가
	  252p
	  스테틱 블록 안에서는 스테틱 블록에 선언된 것들만
	  
	 */
//	# class ClassName:
//		#   def __init__(self):
//		#     pass
//		#
//		#   field2=0
//		#   @classmethod
//		#   def method2(cls):
//		#     pass
//		#
//		#   @classmethod
//		#   def method3(cls):
//		#     self.field=10
//		#     self.method1()
//		#
//		#     
//
//		import datetime as dt
//		x=dt.datetime.now()
//		x.year
//		x.second
//		x.time() # 클래스,인스턴스 메서드
	
	int fieId1;
	void method1() {
		
	}
	
	static int fieId2;
	static void method2() {
		
	}
	
	static {
//		fieId1 = 10;
//		method1();
		fieId2 = 10;
		method2();
	}
	
	static void method3() {
//		this.fieId1 = 10;
//		this.method1();
		fieId2=10;
		method2();
	}
	
	static void method4() {
		ClassName obj = new ClassName();
		obj.fieId1=10;
		obj.method1();
	}
	

}
