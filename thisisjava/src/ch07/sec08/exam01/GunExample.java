package ch07.sec08.exam01;

public class GunExample {

	public static void main(String[] args) {

		Gun myGun = new Gun();
		
		myGun.sgun = new Sgun();
		myGun.run();
		
		myGun.sgun = new RedGun();
		myGun.run();
		
		myGun.sgun = new BlueGun();
		myGun.run();
	
	}

}
