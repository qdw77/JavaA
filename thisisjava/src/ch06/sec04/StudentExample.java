package ch06.sec04;

public class StudentExample {

	public static void main(String[] args) {
		/*
		 * public static void main(String[] args) < 있는 클래스는 실행을 위한 클래스
		 * 없으면 라이브러리 클래스(가져다 쓰는 클래스)
		 * 
		 * 멤버 구성
		 * 필드 / 생성자 / 메소드
		 * 
		 * 생성자 클래스명(){
		 * 
		 * }
		 * 
		 * 타입 필드명 [ = 초기값];
		 * 
		 * 지역 변수 > 매소드 안에 형성된 것
		 * 필드는 자바의 클래스
		 * 접근제한자
		 * 
		 * */
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");

	}

}
