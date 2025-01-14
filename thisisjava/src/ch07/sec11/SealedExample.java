package ch07.sec11;

public class SealedExample {
	public static void main(String[] args) {
		
		Person p = new Person();
		Employee e = new Employee();
		Manager m = new Manager();
		Director d = new Director();
		
		p.work();
		System.out.println();
		e.work();
		System.out.println();
		m.work();
		System.out.println();
		d.work();
		//p335 확인문제
		/* 1,4,1,4,4,
		 * 1. 1 > 자바는 여러개의 부모 클래스를 만들지 못함(다중 x)
		 * 2. 4 > instanceof ? 3? 
		 * 3. 1 > final은 말그대로 그게 완성본이기 때문에 수정이 불가해서 부모클래스로 사용 불가
		 * 4. 4 > final만 불가(protected는 같은 패키지에선 무조껀 가능하고 다른 패키지에선 자식 클래스만 사용 가능하다)
		 * 5. 4 > 추상 클래스는 부모 클래스만 가능
		 * 
		 * */
		
		
	}

}
