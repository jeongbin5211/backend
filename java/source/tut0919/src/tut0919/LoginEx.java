package tut0919;

public class LoginEx {
	
	// 2. 필드(멤버변수) 생성
	String userid;
	String passwd;
	
	public static void main(String[] args) {
		
		// 1. 로그인이 필요한곳(웹사이트, 그룹웨어, 업체) -> 객체 하나 만들어서 관리하는게 용이함
		
		// 웹사이트(web) : 아이디, 비번
		LoginEx web = new LoginEx();
		
		web.userid = "id1";
		web.passwd = "pwd1";
		
		
		LoginEx web2 = new LoginEx();
		
		web.userid = "id1";
		web.passwd = "pwd1";
		
		// 그룹웨어(grp) : 아이디, 비번
		
		LoginEx grp = new LoginEx();
		
		grp.userid = "id2";
		grp.passwd = "pwd2";
		
		
		// 업체
	}
}
