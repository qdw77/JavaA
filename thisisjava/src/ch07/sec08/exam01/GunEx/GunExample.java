package ch07.sec08.exam01.GunEx;

public class GunExample {

	public static void main(String[] args) {
		
		// 객체 생성 > 부모 객체의 필드가 선언된
		Gun myGun = new Gun();
		
		// 기본적인 은색
		myGun.sgun = new Sgun();
		myGun.run();
		
		// 빨간색 
		myGun.sgun = new RedGun();
		myGun.run();
		
		//파란색
		myGun.sgun = new BlueGun();
		myGun.run();
	
	}

}
