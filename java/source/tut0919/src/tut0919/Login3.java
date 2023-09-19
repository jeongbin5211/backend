package tut0919;

import java.time.LocalDate;

public class Login3 {
	private String usermail;
	private String userpw;
	private LocalDate now = LocalDate.now();
	
	// 생성자
	public Login3() {
		System.out.println("로그인 정보를 출력합니다.");
	}
	
	// getter, setter
	
	public String getUsermail() {
		return usermail;
	}
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	
	public LocalDate getNow() {
		return now;
	}
	
	// 메소드

	@Override
	public String toString() {
		return "Login3 [usermail=" + usermail + ", userpw=" + userpw + ", now=" + now + "]";
	}
	
}
