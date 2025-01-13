package ch06.sec15;

public class ShopService {
	//18번
	
	private static ShopService singIeton = new ShopService();
	
	private ShopService() {}
	
	public static ShopService getInstance() {
		
		return singIeton;
	}

}
