package tut0925.List05;

public class Member {
	private String memberID;
	private String memberpw;
	
	public Member() {}
	
	public Member(String memberID, String memberpw) {
		this.memberID = memberID;
		this.memberpw = memberpw;
	}

	// 출력 메소드
	
	public void disp() {
		System.out.println("아이디 : " + memberID + ", 비밀번호 : " + memberpw);
	}

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getMemberpw() {
		return memberpw;
	}

	public void setMemberpw(String memberpw) {
		this.memberpw = memberpw;
	}
	
}
