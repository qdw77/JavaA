package ch06.sec15;

public class MemberLoginOut {

	public static void main(String[] args) {
		//15번
		MemberService memberServerice = new MemberService();
		boolean result = memberServerice.login("hong","12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberServerice.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}

	}

}
