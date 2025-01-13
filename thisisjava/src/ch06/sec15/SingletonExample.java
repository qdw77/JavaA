package ch06.sec15;


public class SingletonExample {

	public static void main(String[] args) {
		//Singleton obj1 = new Singleton();
		//Singleton obj2 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
		/*
		 * 3,4,4,3,1,4,2,2,2,4,3,(필드,생성자,메소드),
		 * 8번
		 * 
		 * */
		
		
		
		
		
	}
	
	

}
