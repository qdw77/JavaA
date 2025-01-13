package ch06.sec15;

public class MemberService {
	//15번 부터 다시
	String id;
	String password;
	// 로그인 값을 저장 후 확인하고 로그아웃
//	public MemberService(String id,String password) {
//		this.id=id;
//		this.password=password;
//	}

	public boolean login(String id, String password) {
		if(id.equals("hong")&&password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println(id+"님이 로그아웃하셨습니다.");
	}

}
