package ch07.sec09;

import java.time.Instant;

public class InstanceofExample {
	//p323
	public static void personInfo(Person person) {
		System.out.println("name: "+person.naem);
		person.walk();
		
		if(person instanceof Student student ) {
			System.out.println("studnetNo: "+student.studentNo);
			student.study();
		}
	}

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		System.out.println();
		
		Person p2 = new Student("김길동", 10);
		personInfo(p2);
	}

}
