package ch07.sec03.exam01;

//자식 생성자
public class SmartPhone extends Phone {

//	public SmartPhone(String model,String color) {
//		//부모 클래스의 생성자가 매개변수가 있다면 > 자식 생성자 내부에 super(매개변수1,매개변수2) 작성
//		// 부모 클래스의 생성자가 매개변수가 없다며> 자식 생성자 내부에 super() 생략가능
//	
//		super();
//		this.model = model;
//		this.color = color;
//		System.out.println("SmartPhone(String model,String color)생성자 실행됨");
//	}
	
	public SmartPhone(String model,String color) {
		//부모 클래스의 생성자가 매개변수가 있다면 > 자식 생성자 내부에 super(매개변수1,매개변수2) 작성
		// 부모 클래스의 생성자가 매개변수가 없다며> 자식 생성자 내부에 super() 생략가능
		super(model,color);
		System.out.println("SmartPhone(String model,String color)생성자 실행됨");
	}
	
}
