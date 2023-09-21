package tut0921;

public class Register {
	// 필드 
	private String email;
	private String userpw; 
	private String username;
	
	// 생성자 : 파일이름과 동일해야함
	
	public Register() {
		
	}
	
	public Register(String email, String userpw, String username) {
		this.email = email;
		this.userpw = userpw;
		this.username = username;
	}
	
	// getter, setter
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	// 메소드
	
	public String disp() {
		return "이메일 : " + email + " 비밀번호 : " + userpw + " 이름 : " + username;
	}
	
	public String disp2() {
		return "이메일 : " + getEmail() + " 비밀번호 : " + getUserpw() + " 이름 : " + getUsername();
	}
	
}
