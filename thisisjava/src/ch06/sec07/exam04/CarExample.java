package ch06.sec07.exam04;

public class CarExample {

	public static void main(String[] args) {
		Car Car1 = new Car();
//		System.out.println("car1.company : "+Car1.company);
//		System.out.println();
		
		Car Car2 = new Car("자가용");
		System.out.println("Car2.company : "+Car2.company);
		System.out.println("Car2.model : "+Car2.model);
		System.out.println();
		
		Car Car3 = new Car("자가용","빨강");
		System.out.println("Car3.company : "+Car3.company);
		System.out.println("Car3.model : "+Car3.model);
		System.out.println("Car3.color : "+Car3.color);
		System.out.println();
		
		Car Car4 = new Car("택시","검정",200);
		System.out.println("Car4.company : "+Car4.company);
		System.out.println("Car4.model : "+Car4.model);
		System.out.println("Car4.color : "+Car4.color);
		System.out.println("Car.maxSpeed : "+Car4.maxSpeed);
		/*
			 self,cls < 파이썬
			 this < 자바
			 
			 self > 인스턴스 주체 
			 cls > 클래스 차제 > cls. / Student.
			 
			 this > self에 가까움
			 this.(model,"은",250)
			 
			 파이썬 
			 생성자 오버로딩 X
			 
		 */
	}

}
