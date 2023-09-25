package map.MapEx03;

public class Member {
	// 아이디 비번 필드
	private String userid;
	private String userpw;
	
	public Member() {
		
	}

	public Member(String userid, String userpw) {
		this.userid = userid;
		this.userpw = userpw;
	}

	// getter setter
	
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	
	public void disp() {
		System.out.println("아이디 : " + userid + ", 비밀번호 : " + userpw);
	}
	
	
}
