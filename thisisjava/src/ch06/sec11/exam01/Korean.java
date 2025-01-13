package ch06.sec11.exam01;

public class Korean {

		/*
		 * Static 사용 특징
		 * Static변수(클래스 변수)는 메모리에 로드할 때 초기화 되어 클래스의 모든 인스턴스가 공유한다
		 * Static으로 선언된 변수와 매서드는 객체를 생성하지 않고 클래스 이름을 통해 호출된다
		 * Static 메소드는 인스턴스 변수나 매서드를 직접 참조할 수 없음, 정적 변수와 창작 매소드만 
		 * Static 메소드 내에서는 this를 사용할 수 없음
		 * Static 메소드는 오버라이딩 될 수 없음
		 * 
		 * final은 앞으로 절대 바꿀일 없는 필드에 적용
		 * final 타입 필드명 = 값 // 깂변경 X 안 필드에 final 키워드를 붙임 
		 * final 필드에 값이 할당되지 않으면 오류발생 
		 * 
		 * 생성자에서 final필드에 어떤 값을 초기화 한다. (this를 통해서)
		 * this,ssn
		 * 인스턴스에 할당 final
		 * 필드
		 * */
		// 255p
		final String nation = "대한민국";
		final String ssn;
		
		String name;
		
		public Korean(String ssn,String name) {
			this.ssn = ssn;
			this.name = name;
		}
		
	

}
